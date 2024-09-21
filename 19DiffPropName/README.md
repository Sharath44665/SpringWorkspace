# Different Property name

order.java

``` java
public class Order {
    @JsonProperty("user") // case sensitive
    private String customerName;
    @JsonProperty("item")
    private String productName;
    @JsonProperty("qty")        
    private int quantity;
    // ...
    }
```

those property such as user, item, qty coming from json/api data

