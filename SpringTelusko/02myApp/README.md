# component and Autowired
## @Autowiring
autowiring has mutliple usecases one usecase is without initializing the object you can connect(wire) the classes 

```java
package com.sharath.myApp;

public interface Computer {
    public void compile();
}

```

```java
package com.sharath.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){

        System.out.println("compiling with 200 bugs but faster");
    }
}
```
### primary

from the below @Primary annotation is useful, when you have same methods and spring `dont want to get confused with 2 or more methods`
```java

package com.sharath.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiling with 200 bugs");
    }
}
```
### qualifier
from the below example @Qualifier is useful when we want to invoke perticular class methods.

here we are invoking method compile which belongs to `laptop`(Laptop) class
```java
package com.sharath.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    Laptop laptop = new Laptop(); // dont want to use this statement
    @Autowired // field injection
    @Qualifier("laptop")
    private Computer myCom;

    public void build(){
        myCom.compile();
        System.out.println("working on awesome project");
    }
}

```

```java
package com.sharath.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(MyAppApplication.class, args);
//		Dev obj = new Dev();
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}

```
