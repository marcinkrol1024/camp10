package sages.bootcamp.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class SomeController implements ButtonObserver {
  @Override
  public void onButtonClicked() {
    System.out.println("Event on some controller.");
  }
}
