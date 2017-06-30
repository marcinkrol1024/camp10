package sages.bootcamp.designpatterns.builder;

public class App {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder
        .append(1)
        .append("+")
        .append(2);

    String result = stringBuilder.toString();
    System.out.println(result);
  }
}
