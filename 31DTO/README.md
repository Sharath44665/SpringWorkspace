## ❗ DTO (Data Transfer Objects)

DTOs or Data Transfer Objects are objects that carry data between processes in order to reduce the number of methods calls.

- to reduce roundtrips to the server by batching up multiple parameters in a single call. This reduces the network overhead in such remote operations.
- Another benefit is the encapsulation of the serialization’s logic (the mechanism that translates the object structure and data to a specific format that can be stored and transferred).
- can hide sensitive information
- abstraction
- data separation

![dto](./img/dtoScreenshot_20240923_175618.png) 

see the difference from previous example:

![studentdto](./img/dtoStudentScreenshot_20240923_182730.png)

if we see in post man, we are still exposing age field

so, now modify the code in `studentResponseDto.java` and `StudentController.java`

see the difference:

![dtoStudentResponse](./img/dtostudentResponseScreenshot_20240924_083605.png)

## in School, showing only necessary things.

- add code in `SchoolDto` record
- modify the `School` class

![schooldto](./img/schooldtoScreenshot_20240924_085236.png)

in table:

![schooltable](./img/tableSchoolScreenshot_20240924_085411.png)

in `SchoolController` class, do this:

``` java
    private SchoolDto toSchoolDto(School school){
        return  new SchoolDto(school.getName());
    }

    @GetMapping("/all")
    public List<SchoolDto> getAll(){
        return schoolRepository.findAll().stream().map(this::toSchoolDto).collect(Collectors.toList());
    }
```
now we dont share un necessary stuff of the school. see below

![all school](./img/allSchoolScreenshot_20240924_090312.png)



