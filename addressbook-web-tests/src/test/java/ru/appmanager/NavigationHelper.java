package ru.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Cawa on 27.12.2017.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
            click(By.linkText("groups"));
  }

  public void gotoHomePage() {
        click(By.linkText("home"));
  }
}
