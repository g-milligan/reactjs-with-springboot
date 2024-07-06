package com.gii.contactapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gii.contactapi.domain.Contact;
import java.util.Optional;


@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}
