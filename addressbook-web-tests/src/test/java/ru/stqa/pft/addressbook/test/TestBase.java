package ru.stqa.pft.addressbook.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appManager.AppsManager;

public class TestBase {

  protected final AppsManager app = new AppsManager();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

  public AppsManager getApp() {
    return app;
  }
}
