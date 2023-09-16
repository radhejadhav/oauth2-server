# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsingle/index.html#web)
* [OAuth2 Authorization Server](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsingle/index.html#web.security.oauth2.authorization-server)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsingle/index.html#web.security)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)

Login Steps

1. Hit this URL in the browser
    http://localhost:9090/oauth2/authorize?response_type=code&client_id=client1&redirect_uri=http://localhost:3000/authorized&scope=openid read

    username: radhe
    password: password
2. request for token
   http://localhost:9090/oauth2/token
   Basic Auth: username: client1
                password: myClientSecretValue
   body : grant_type: authorization_code
            code : url code
            redirect_uri: http://localhost:3000/authorized

3 create db table

CREATE TABLE oauth2_registered_client (
    id varchar(100) NOT NULL,
    client_id varchar(500) NOT NULL,
	client_id_issued_at timestamp,
	client_secret varchar(500),
	client_secret_expires_at timestamp,
	client_name varchar(500),
	client_authentication_methods text,
	authorization_grant_types text,
	redirect_uris text,
	post_logout_redirect_uris text,
	scopes text,
	client_settings text,
	token_settings text,
	
    PRIMARY KEY (id)
)
   
