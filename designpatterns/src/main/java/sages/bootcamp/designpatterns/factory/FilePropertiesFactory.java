package sages.bootcamp.designpatterns.factory;

public class FilePropertiesFactory implements PropertiesFactory {

  private final String file;

  public FilePropertiesFactory(String file) {
    this.file = file;
  }

  @Override
  public Properties create() {
    // czytanie z pliku
    return null;
  }
}
