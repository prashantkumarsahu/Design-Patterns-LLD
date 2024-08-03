package Singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleton")
public class DriverClass {


  @GetMapping("/")
  public Integer getSingleTonObject(){
    return Singleton.getSingleInstance().x;
  }

  public static void main(String[] args) throws CloneNotSupportedException {

    Singleton singletonObj1 = Singleton.getSingleInstance();
    Singleton singletonObj2 = Singleton.getSingleInstance();
    Object singletonObj3 = singletonObj2.clone();
    System.out.println(singletonObj1 == singletonObj2);


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
