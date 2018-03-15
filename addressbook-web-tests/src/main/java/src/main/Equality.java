package src.main;

/**
 * Created by Cawa on 28.12.2017.
 */
public class Equality {
  public static void main ( String[] args) {
    String s1 = "firefox";
    String s2 = new String(s1);

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}
