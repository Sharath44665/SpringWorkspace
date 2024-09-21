# Record in Java

Record OrderRecord.java 
``` java
public record OrderRecord(String customerName,
                          String productName,
                          int quantity) {

}
```

FirstController.java
``` java
@PostMapping("/order-record")
    public String makeOrderRecord(@RequestBody OrderRecord order){
        return "accepted! and object: "+order.toString();
    }
```

run the application

**advantages**:

- no getter and setter methods is required
