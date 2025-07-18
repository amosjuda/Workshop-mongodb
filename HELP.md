# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.0-SNAPSHOT/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.0-SNAPSHOT/maven-plugin/build-image.html)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/4.0.0-SNAPSHOT/reference/data/nosql.html#data.nosql.mongodb)
* [Spring Web Services](https://docs.spring.io/spring-boot/4.0.0-SNAPSHOT/reference/io/webservices.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/4.0.0-SNAPSHOT/reference/data/sql.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

