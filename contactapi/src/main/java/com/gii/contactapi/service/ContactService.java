package com.gii.contactapi.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gii.contactapi.domain.Contact;
import com.gii.contactapi.repo.ContactRepo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static com.gii.contactapi.constant.Constant.PHOTO_DIRECTORY;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepo contactRepo;

    public Page<Contact> getAllContacts(int page, int size) {
        return contactRepo.findAll(PageRequest.of(page, size, Sort.by("name")));
    }

    public Contact getContact(String id) {
        return contactRepo.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    public Contact createContact(Contact contact) {
        return contactRepo.save(contact);
    }

    public Contact deleteContact(String id) {
        Contact contact = contactRepo.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
        contactRepo.delete(contact); 
        return contact;
    }

    public String uploadPhoto(String id, MultipartFile file) {
        log.info("Saving picture for user: {}", id);
        Contact contact = getContact(id);
        String photoUrl = photoFunction.apply(id, file);
        contact.setPhotoUrl(photoUrl);
        log.info("Photo URL: {}", photoUrl);
        contactRepo.save(contact);
        return photoUrl;
    }

    private final Function<String, String> fileExtension = (filename) -> {
        return Optional.of(filename)
                .filter(name -> name.contains("."))
                .map(name -> "." + name.substring(filename.lastIndexOf(".") + 1))
                .orElse(".png");
    };

    private final BiFunction<String, MultipartFile, String> photoFunction = (id, image) -> {
        String filename = id + fileExtension.apply(image.getOriginalFilename());

        int lastIndexOfDot = filename.lastIndexOf(".");
        String extension = lastIndexOfDot != -1 ? filename.substring(lastIndexOfDot) : ".png";

        try {
            Path fileStorageLocation = Paths.get(PHOTO_DIRECTORY).toAbsolutePath().normalize();
            if (!Files.exists(fileStorageLocation)) {
                Files.createDirectories(fileStorageLocation);
            }

            Files.copy(image.getInputStream(), fileStorageLocation.resolve(id + extension), REPLACE_EXISTING);

            return ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/contacts/image/" + filename)
                    .toUriString();
        } catch (Exception exception) {
            throw new RuntimeException("Unable to save image");
        }
    };

}
