package src.main;

import org.openqa.selenium.interactions.SourceType;

/**
 * Created by Cawa on 01.01.2018.
 */
public class Collections {
  public static void main(String[] args) {
    String[] langs = new String[4];
    langs[0] = "Java";
    langs[1] = "Vava";
    langs[2] = "Pahlava";
    langs[3] = "Php";
    for (String l: langs)
    System.out.println("Я хочу выучить " + l);
  }
}
