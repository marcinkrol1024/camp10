package sages.bootcamp.tracker;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jooq.DSLContext;
import org.jooq.Result;
import sages.bootcamp.tracker.jooq.di.PersistenceModule;
import sages.bootcamp.tracker.jooq.tables.records.UsersRecord;

import javax.inject.Inject;
import java.util.stream.Collectors;

import static sages.bootcamp.tracker.jooq.Tables.USERS;

public class App {
  private final DSLContext dslContext;

  @Inject
  public App(DSLContext dslContext) {
    this.dslContext = dslContext;
  }

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        new PersistenceModule()
    );
    App app = injector.getInstance(App.class);
    app.run();
  }

  public void run() {
    dslContext
        .insertInto(USERS, USERS.LOGIN, USERS.PASSWORD)
        .values("marcin.krol", "pass")
        .execute();

    Result<UsersRecord> users = dslContext
        .selectFrom(USERS)
        .where(USERS.LOGIN.like("%kro%"))
        .fetch();

    System.out.println(users.stream().map(UsersRecord::getLogin).collect(Collectors.toList()));
  }
}
