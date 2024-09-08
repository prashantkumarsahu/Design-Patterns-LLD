package Singleton;

import org.springframework.stereotype.Component;


@Component
// Only one instance of a class is created and used throughout the application.
public class Singleton_Static_Synchronized implements Cloneable {

  // can also declare it as final, but that would require initialization while declaring, preventing the thread safe condition.
  private static Singleton_Static_Synchronized singleInstance;

  /// volatile can be used in the Double-Checked Locking idiom for thread-safe lazy initialization of a singleton:
  private static volatile Singleton_Static_Synchronized singleInstance2;
  int x;

  // private constructor to prevent instance creation from other classes.
  private Singleton_Static_Synchronized(){

  }

  // public method to get access to the single instance
  public static Singleton_Static_Synchronized getSingleInstance(){
    if(singleInstance == null){
      // Making it thread safe i.e. 2 threads cannot create 2 separate objects.
      synchronized (Singleton_Static_Synchronized.class){
        singleInstance = new Singleton_Static_Synchronized();
        singleInstance.x = 5;
      }
    }
    return singleInstance;
  }

  // override the clone() method of Object class (which every class inherits upon).
  @Override
  protected Object clone() throws CloneNotSupportedException{
    throw new CloneNotSupportedException("Singleton object cannot be cloned.");
  }

  // example method in the singleton class.
  public static void printName(String name){
    System.out.println(name);
  }
}
