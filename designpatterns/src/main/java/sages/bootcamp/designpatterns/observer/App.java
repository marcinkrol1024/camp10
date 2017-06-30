package sages.bootcamp.designpatterns.observer;

import java.util.Arrays;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<ButtonObserver> observers = Arrays.asList(
        new AnotherController(),
        new SomeController()
    );

    Button button = new Button();
    observers.forEach(button::registerObserver);

    button.click();
  }
}
