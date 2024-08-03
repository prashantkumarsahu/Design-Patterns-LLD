package DesignPatterns.Creational.Singleton;

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

  public static void main(String[] args) {

    Singleton singletonObj1 = Singleton.getSingleInstance();
    Singleton singletonObj2 = Singleton.getSingleInstance();

    System.out.println(singletonObj1 == singletonObj2);

  }

}
