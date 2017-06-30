package sages.bootcamp.designpatterns.decorator;

public class DatabaseConnection {

  public void executeSql(String sql) {
    execute(sql);
  }

  private void execute(String sql) {
    // sends sql to database for execution
  }
}
