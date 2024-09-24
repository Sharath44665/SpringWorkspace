# Reading from table:

``` java
@GetMapping("/students")
public List<Student> getAll(){
    return repository.findAll() ;
}
```
check this url in post man: 
http://localhost:8080/students

## get specific student with id

``` java
@GetMapping("/students/{sid}")
public Student updateStudent(@PathVariable("sid") Integer id){
    return repository.findById(id).orElse(new Student());
}
```

**this should return null values in postman**   

http://localhost:8080/students/100

output:
``` json
{
    "id": null,
    "firstname": null,
    "lastname": null,
    "email": null,
    "age": 0
}
```
**this should return in postman** 

http://localhost:8080/students/2

output:
``` json
{
    "id": 2,
    "firstname": "sharath",
    "lastname": "chandra",
    "email": "sharathchandra@example.com",
    "age": 25
}
```


