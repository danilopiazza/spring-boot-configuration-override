Bean overriding is disabled by default since [Spring Boot 2.1][1].

Trying to override an existing bean results in the following error:

> Description:
>
> The bean '...', defined in class path resource [...], could not be registered. A bean with that name has already been defined in class path resource [...] and overriding is disabled.
>
> Action:
>
> Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true

To enable bean overriding, set [`spring.main.allow-bean-definition-overriding`][2] to `true`.

Later beans override earlier ones.

[1]: https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.1-Release-Notes
[2]: https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#core-properties
