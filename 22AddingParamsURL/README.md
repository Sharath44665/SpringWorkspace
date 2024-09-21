# Adding parameters in URL

for example http://localhost:8080/hello?first=sharath&last=chandra

from the above line we wanna access parameters and display it on page

FirstController.java
```java
@GetMapping("/hello/{demo_name}")
public String getPathName(@PathVariable("demo_name") String demoName){
    return "you have added: "+ demoName;
}
```

