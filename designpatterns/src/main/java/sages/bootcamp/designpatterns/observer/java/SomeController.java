package sages.bootcamp.designpatterns.observer.java;

import java.util.Observable;
import java.util.Observer;

public class SomeController implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Event on some controller.");
  }
}
