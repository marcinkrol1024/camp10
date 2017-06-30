package sages.bootcamp.designpatterns.factory;

public class App {
  public static void main(String[] args) {
    PropertiesFactory propertiesFactory = new NetworkPropertiesFactory("file");

    Properties properties = propertiesFactory.create();
    // używamy tego properties
  }
}
