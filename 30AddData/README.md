## Adding Data to Students and School

here `students` is null because we have not created yet

![school](./img/schoolDataScreenshot_20240923_170857.png)

![dbschool](./img/dbSchoolScreenshot_20240923_172101.png)

![student](./img/studentScreenshot_20240923_172255.png)

when we try to access http://localhost:8080/all in postman which creates infinite loop

![max call](./img/maxCallScreenshot_20240923_173118.png)

to **avoid** the above **error, do the following**

## add this in `school.java` (parent):

``` java
@JsonManagedReference
private List<Student> students;
```
### also modify 

add `@JsonBackReference` in student.java

``` java
    @ManyToOne
    @JoinColumn(name = "school_id")
    @JsonBackReference
    private School school;
```
now there is no infinite loop:

![get all](./img/getSchoolScreenshot_20240923_174341.png)

also add more students to same school id




