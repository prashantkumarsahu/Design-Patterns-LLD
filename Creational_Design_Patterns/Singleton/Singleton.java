package Singleton;

import org.springframework.stereotype.Component;


@Component
// Only one instance of a class is created and used throughout the application.
public class Singleton {

  // can also declare it as final, but that would require initialization while declaring, preventing the thread safe condition.
  private static Singleton singleInstance;
  int x;

  // private constructor to prevent instance creation from other classes.
  private Singleton(){

  }

  // public method to get access to the single instance
  public static Singleton getSingleInstance(){
    if(singleInstance == null){
      // Making it thread safe i.e. 2 threads cannot create 2 separate objects.
      synchronized (Singleton.class){
        singleInstance = new Singleton();
        singleInstance.x = 5;
      }
    }
    return singleInstance;
  }

  // example method in the singleton class.
  public static void printName(String name){
    System.out.println(name);
  }
}
