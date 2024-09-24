# search

1. in `StudentRepository`

``` java
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByFirstnameLike(String firstname); // or using findAllByFirstnameContaining()
}
```

2. do this: 

``` java
@GetMapping("/students/search/{sname}")
public List<Student> findStudentByName(@PathVariable("sname") String name){
    return repository.findAllByFirstnameLike(name);
}
```

3. finally in postman copy paste this url: http://localhost:8080/students/search/sharath

output:
``` json
[
    {
        "id": 2,
        "firstname": "sharath",
        "lastname": "chandra",
        "email": "sharathchandra@example.com",
        "age": 25
    },
    {
        "id": 52,
        "firstname": "sharath",
        "lastname": "K",
        "email": "sharathk@example.com",
        "age": 23
    }
]
```


