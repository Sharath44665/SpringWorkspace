# Strategy Joined
- Resource
- Video
- UserFile
- Text

![join table](./img/usingJoinTablesScreenshot_20241001_202624.png)

from the below file please notice the id in both tables

![insert values](./img/insertingValJoinScreenshot_20241001_203551.png)

![insert values](./img/insertValJoin2Screenshot_20241001_203713.png)

### below annotation will change the `id` to `video_id` in video table

Video.java

``` java
// some annotation
@PrimaryKeyJoinColumn(name = "video_id")
public class Video extends Resource {
    private Integer videoLength;

}
```