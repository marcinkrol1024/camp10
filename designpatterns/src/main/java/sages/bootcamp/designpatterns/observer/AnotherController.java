package sages.bootcamp.designpatterns.observer;

public class AnotherController implements ButtonObserver {

  @Override
  public void onButtonClicked() {
    System.out.println("Event on another controller.");
  }
}
