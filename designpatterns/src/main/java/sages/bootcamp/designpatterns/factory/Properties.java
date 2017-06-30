package sages.bootcamp.designpatterns.factory;

public class Properties {

  private final String someValue;

  public Properties(String someValue) {
    this.someValue = someValue;
  }

  public String getSomeValue() {
    return someValue;
  }
}
