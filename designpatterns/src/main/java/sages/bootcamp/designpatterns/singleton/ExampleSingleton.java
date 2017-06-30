package sages.bootcamp.designpatterns.singleton;

public class ExampleSingleton {
  private static ExampleSingleton ourInstance = new ExampleSingleton();

  public static ExampleSingleton getInstance() {
    return ourInstance;
  }

  private ExampleSingleton() {
  }
}
