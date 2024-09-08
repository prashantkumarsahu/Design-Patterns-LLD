package Singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleton")
public class DriverClass {


  @GetMapping("/")
  public Integer getSingleTonObject(){
    return Singleton_Static_Synchronized.getSingleInstance().x;
  }

  public static void main(String[] args) throws CloneNotSupportedException {

    Singleton_Static_Synchronized singletonObj1 = Singleton_Static_Synchronized.getSingleInstance();
    Singleton_Static_Synchronized singletonObj2 = Singleton_Static_Synchronized.getSingleInstance();
    Object singletonObj3 = singletonObj2.clone();
    System.out.println(singletonObj1 == singletonObj2);

    Singleton_Enums singleton3 = Singleton_Enums.INSTANCE;
    singleton3.setValue(100);
    System.out.println(singleton3.getValue());

    /* ****************************************************************
   Advantages:
   1. Code reuse = Esp. for complex initialization
   2. Reduced Initialization = no need to initialize new objects having same properties, except 1 or 2
   3. Flexible objects = Can change specific properties
   4. Code Maintenance = Less code to maintain, as object is created using only 1 line
   5. Code readability

   Disadvantages
   1. Shallow vs Deep copy: If Concrete impl class has a nested class, then Deep copy is necessary.
   2. Object serialization
   3. Object state
   4. Multiple Concrete Impl classes needed for different clones;
  */

  }

}
