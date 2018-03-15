package src.main;

/**
 * Created by Cawa on 01.01.2018.
 */
public class Primes {
  public static boolean isPrime (int n) {
    for (int i=2; i<n; i+=1) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

}
