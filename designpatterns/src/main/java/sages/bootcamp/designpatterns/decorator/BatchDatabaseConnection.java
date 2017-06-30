package sages.bootcamp.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class BatchDatabaseConnection extends DatabaseConnection {

  private final List<String> sqlsBuffer = new ArrayList<>();
  private final DatabaseConnection databaseConnection;

  public BatchDatabaseConnection(DatabaseConnection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  @Override
  public void executeSql(String sql) {
    sqlsBuffer.add(sql);
    if (sqlsBuffer.size() == 100) {
      databaseConnection.executeSql(String.join(";", sqlsBuffer));
      sqlsBuffer.clear();
    }
  }
}
