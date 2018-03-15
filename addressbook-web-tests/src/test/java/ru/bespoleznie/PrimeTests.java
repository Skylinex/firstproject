package ru.bespoleznie;

import org.testng.Assert;
import org.testng.annotations.Test;
import src.main.Primes;

/**
 * Created by Cawa on 01.01.2018.
 */
public class PrimeTests {

  @Test
  public void TestPrime () {
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }
}
