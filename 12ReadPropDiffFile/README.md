# Reading property from different `property file`

- custom.properties in `resources`
```
demo.custom.property.name=Sharathchandra custom property property
```
- inside `MyFirstService.java`
- see code: `@propertySource`
```java
@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    @Value("${demo.custom.property.name}")  
    private String customPropDiffFile;

    public String getCustomPropDiffFile() {
        return customPropDiffFile;
    }
}
```
> call the above function in Application.java

## More than 1 files

```java
@Service
//@PropertySource("classpath:custom.properties") // for single custom file
@PropertySources(
        {
                @PropertySource("classpath:custom.properties"),
                @PropertySource("classpath:second.custom.properties")
        }
)
public class MyFirstService {
    // reading application.property (default)
    @Value("${demo.custom.name}")
    private String appProperyCustomName;

    // reading from diff file 
    @Value("${demo.custom.name}")
    private String customPropDiffFile;

    // reading from diff file 
    @Value("${demo.prop.name}")
    private String customPropDiffFile2;

    public String getAppProperyCustomName() {
        return appProperyCustomName;
    }
    
    public String getCustomPropDiffFile() {
        return customPropDiffFile;
    }
    
    public String getCustomPropDiffFile2() {
        return customPropDiffFile2;
    }
}
```

> call the above function in Application.java

**Please Note:** see full code in repo (this is not a full code)

###side notes:

in your `filename.properties` file, if you have property something like this:

  `demo.prperty.int= 123`

above one will be automatically converted to integer type by string

> Warning: 
> 
> `demo.prperty.int= 123abc`
> 
> the above line will throw error because its not in integer type (`123abc`).
