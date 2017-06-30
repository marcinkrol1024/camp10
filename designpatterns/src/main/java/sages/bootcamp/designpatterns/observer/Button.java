package sages.bootcamp.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Button {
  List<ButtonObserver> buttonObservers = new ArrayList<>();

  public void click() {
    buttonObservers.forEach(ButtonObserver::onButtonClicked);
  }

  public void registerObserver(ButtonObserver observer) {
    buttonObservers.add(observer);
  }
}
