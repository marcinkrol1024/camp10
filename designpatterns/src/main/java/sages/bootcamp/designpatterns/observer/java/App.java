package sages.bootcamp.designpatterns.observer.java;

import java.util.Arrays;
import java.util.List;
import java.util.Observer;

public class App {
  public static void main(String[] args) {
    List<Observer> observers = Arrays.asList(
        new AnotherController(),
        new SomeController()
    );

    Button button = new Button();
    observers.forEach(button::addObserver);

    button.click();
  }
}
