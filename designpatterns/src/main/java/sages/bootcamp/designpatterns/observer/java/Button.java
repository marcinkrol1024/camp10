package sages.bootcamp.designpatterns.observer.java;

import java.util.Observable;

public class Button extends Observable {
  void click() {
    setChanged();
    notifyObservers();
  }
}
