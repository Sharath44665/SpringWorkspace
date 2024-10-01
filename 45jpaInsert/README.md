### Repository Extension

![repo extension](./img/repositoryExtensionScreenshot_20240930_142620.png)

![repos](./img/repositoryScreenshot_20240930_135752.png)

# inserting into tabel
- Author.java
- AuthroRepository.java
- jpaApplication.java

```
...
2024-09-30T18:15:06.068+05:30  INFO 19531 --- [           main] com.sharath.jpa.JpaApplication           : Started JpaApplication in 19.514 seconds (process running for 22.109)
Hibernate: select nextval('author_seq')
Hibernate: insert into author (age,email,first_name,last_name,id) values (?,?,?,?,?)
```
db view:

![db](./img/databaseUserScreenshot_20240930_182247.png)