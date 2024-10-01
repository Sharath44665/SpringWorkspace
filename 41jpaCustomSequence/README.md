## ER diagram

![courseDiagram](./img/erDiagramScreenshot_20240930_112751.png)

### Difference between Hibernate vs spring Data JPA

![diff](./img/Screenshot_20240930_113545.png)

### author.java

![authorjava](./img/authorJavaERScreenshot_20240930_113918.png)

---

in `Author.java` 
- `@Data` Generates getters for all fields, a useful toString method

### GeneratedValue

![generatedValue](./img/generatedValueScreenshot_20240930_121952.png)

### after adding Author.java

run the code, output will looks like this:

![primary key](./img/primaryKeyScreenshot_20240930_123951.png)

![dbeaveer](./img/Screenshot_20240930_124043.png)

# Custom sequence Generator

in `Author.java`

``` java
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "author_sequence")
    @SequenceGenerator(name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1) // create sequence of author_sequence
    private Integer id; // we r not using int because , by default int = 0, Integer = null
    // ... more codes next line
```

### output:
![custom sequence](./img/authorSequenceScreenshot_20240930_125806.png)

![db](./img/dbAuthorSeqScreenshot_20240930_125949.png)


