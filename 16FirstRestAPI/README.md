# Rest API

```java
@GetMapping("/welcome")
@ResponseStatus(HttpStatus.ACCEPTED)
public String welcome(){
    return "<h1>Welcome from first controller</h1>";
}
```

from the above code, while checking on `localhost:8080/welcome`, in the developer tools it should display **http status code**: 202
    