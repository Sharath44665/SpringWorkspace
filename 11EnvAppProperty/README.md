# Reading Application property

- go to main-> resources -> add one more line `application.propertes`
```
my.custom.property=Hello From application.properties (custom prop)
```
- in `MyFirstService.java`

``` java
public String readAppProperty(){
        return environment.getProperty("my.custom.property");
    }
```

call the above function in `Application.java`