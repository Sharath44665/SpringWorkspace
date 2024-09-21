# Adding path in URL

for example http://localhost:8080/hello/username

from the above line we wanna access username and display it on page

FirstController.java
```java
@GetMapping("/hello/{demo_name}")
public String getPathName(@PathVariable("demo_name") String demoName){
    return "you have added: "+ demoName;
}
```

