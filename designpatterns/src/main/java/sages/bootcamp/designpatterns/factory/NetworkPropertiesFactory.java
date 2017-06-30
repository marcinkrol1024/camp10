package sages.bootcamp.designpatterns.factory;

public class NetworkPropertiesFactory implements PropertiesFactory {
  private final String propertiesServiceIp;

  public NetworkPropertiesFactory(String propertiesServiceIp) {
    this.propertiesServiceIp = propertiesServiceIp;
  }


  @Override
  public Properties create() {
    // czytanie z serwera konfiguracji
    return null;
  }
}
