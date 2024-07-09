# React JS with Spring Boot

[YouTube tutorial](https://www.youtube.com/watch?v=-LUA-LHXobE)

### Introduction

- [Intro 0:00](https://www.youtube.com/watch?v=-LUA-LHXobE&t=0s)
- [Software Requirements 4:01](https://www.youtube.com/watch?v=-LUA-LHXobE&t=241s)

### Spring Boot

- [Contact Domain 6:34](https://www.youtube.com/watch?v=-LUA-LHXobE&t=394s) | [Spring Initializer Configuration](docs/start.spring.io.md) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/f1b7a4ec9c079a75723cc55051219af17eecc29d)
- [Contact Repository 12:40](https://www.youtube.com/watch?v=-LUA-LHXobE&t=760s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/b6d176cda572f40a6c8292d37fd71346e35e5efa) 
- [Contact Service - Part 1 14:24](https://www.youtube.com/watch?v=-LUA-LHXobE&t=864s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/49d0acfa0acc9bbeeee70d87ccab39a3ec8b90f9)
- [Contact Service - Part 2 18:20](https://www.youtube.com/watch?v=-LUA-LHXobE&t=1100s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/29d7391776af70cd237147f4eacd93fa367d49c1)
- [Data Source Configuration 33:32](https://www.youtube.com/watch?v=-LUA-LHXobE&t=2012s) | [Code diff 1](https://github.com/g-milligan/reactjs-with-springboot/commit/bc90add4c10636f3c1ec1f2edb43491837010b9c) | [Code diff using environment variables](https://github.com/g-milligan/reactjs-with-springboot/commit/0e8340940cb87201e6806539e3b16f58f5f83c1b)
- [API Test Part 1 36:24](https://www.youtube.com/watch?v=-LUA-LHXobE&t=2184s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/e91392767994fb3f0f36fb3f2043d889055764f3) | [Code diff with postman collection + sample data](https://github.com/g-milligan/reactjs-with-springboot/commit/43647e01d026f13410f5327128ccfa35c3a102a0)
- [API Test Part 2 43:16](https://www.youtube.com/watch?v=-LUA-LHXobE&t=2596s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/af79d5ad72aeb226d1a9943b1b6c6fb3acb8daf0) | [Code diff with delete endpoint](https://github.com/g-milligan/reactjs-with-springboot/commit/3e5e62053b71b27e5ebb67d1ecca191cad9ace52)

### ReactJS

Install in the project root using an app folder name, `frontent`:
```shell
npx create-react-app frontend
```

Install additional dependencies in `./frontend`
```shell
npm i axios react-router-dom
```

Troubleshooting [issue](https://www.freecodecamp.org/news/error-error-0308010c-digital-envelope-routines-unsupported-node-error-solved/) solution:

`./frontend`
```shell
npm uninstall react-scripts
npm install react-scripts
```

Start the app:

`./frontend`
```
npm start
```

- [Create ReactJS application 50:47](https://www.youtube.com/watch?v=-LUA-LHXobE&t=3047s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/bc0f8a110ede10e2a9fb4c5f8ca25547b145044d)
- [Clean up ReactJS application 54:04](https://www.youtube.com/watch?v=-LUA-LHXobE&t=3244s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/10561ec18a11027fa3036d840f5a6fa3d432bc69)
- [Components 57:31](https://www.youtube.com/watch?v=-LUA-LHXobE&t=3451s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/0980b3550657612e630a7bcc1e6816d178bd39e6)
- [Header Component 1:1:07](https://youtu.be/-LUA-LHXobE?t=3667) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/e220289a3d703737f795ddb9ed5ea2b53c9abd51)
- [Contact Component 1:7:14](https://youtu.be/-LUA-LHXobE?t=4035) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/2fc9c71e938c5aa7a9ace949a4f5d4a731d92b52)
- [Contact List Component 1:13:31](https://www.youtube.com/watch?v=-LUA-LHXobE&t=4411s)
- [Contact Service 1:29:9](https://youtu.be/-LUA-LHXobE?t=5352) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/0f4433fe1662b38c6ea29fd0b94330321a5d89a6)
- [Fetching Contacts 1:34:21](https://www.youtube.com/watch?v=-LUA-LHXobE&t=5661s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/83f5ed099f876096b04631e41d7ba509d60e7cf1)
- [CORS Configuration 1:39:43](https://www.youtube.com/watch?v=-LUA-LHXobE&t=5983s)
- Display Header Component 1:45:5 | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/724c0b06df6139bbe916b9a5c4cb4d810d6b3b78)
- [Routes and Display Contact List 1:48:56](https://www.youtube.com/watch?v=-LUA-LHXobE&t=6536s) | [Code diff](https://github.com/g-milligan/reactjs-with-springboot/commit/0be4208c81679fbefc1979c04f5b48597392a7e6)
- [HTML Modal 1:54:28](https://www.youtube.com/watch?v=-LUA-LHXobE&t=6868s)
- [Save Data From Modal 1:59:56](https://www.youtube.com/watch?v=-LUA-LHXobE&t=7196s) | [Code diff](#TODO)
- Save File From Modal 2:5:21
- [Save Contact 2:10:26](https://www.youtube.com/watch?v=-LUA-LHXobE&t=7826s)
- [Fetch Single Contact 2:20:31](https://www.youtube.com/watch?v=-LUA-LHXobE&t=8431s)
- Show Contact Name 2:29:2
- [Update Contact Photo 2:33:43](https://www.youtube.com/watch?v=-LUA-LHXobE&t=9223s)
- [Display Contact Form 2:42:48](https://www.youtube.com/watch?v=-LUA-LHXobE&t=9768s)
- [Update Contact 2:49:24](https://www.youtube.com/watch?v=-LUA-LHXobE&t=10164s)
- [Toast Notification 2:53:19](https://www.youtube.com/watch?v=-LUA-LHXobE&t=10399s)