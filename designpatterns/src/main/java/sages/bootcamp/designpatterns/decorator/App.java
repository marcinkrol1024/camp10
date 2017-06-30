package sages.bootcamp.designpatterns.decorator;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
  public static void main(String[] args) {
    DatabaseConnection databaseConnection = new BatchDatabaseConnection(new DatabaseConnection());
    IntStream
        .range(0, 1000)
        .mapToObj(i -> "select " + i)
        .collect(Collectors.toList())
        .forEach(databaseConnection::executeSql);
  }
}
