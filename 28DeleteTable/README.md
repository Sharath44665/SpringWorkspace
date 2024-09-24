# delete Student:

FirstController.java
``` java
@DeleteMapping("/student/d/{sid}")
@ResponseStatus(HttpStatus.OK)
public void deleteStudent(@PathVariable("sid") Integer id){
    repository.deleteById(id );
}
```

check the url in postman: http://localhost:8080/student/d/52