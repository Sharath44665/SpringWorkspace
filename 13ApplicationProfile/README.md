# Application Profiles

this is useful when you are working in dev environment or prod environment

- create file `custom-dev.properties`

adding profiles in community edition intellij **may not** available

### But you can do this:
- create a file `application-dev.properties`
- modify the values
- now in `application.properties` add this line at the beginnnig
``` 
spring.profiles.active=dev
```
- run the program 
