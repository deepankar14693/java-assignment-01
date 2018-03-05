package edu.knoldus;

import java.util.stream.IntStream;

public class PrimeFactors {

  public static void main(String[] args) {

    IntStream.range (1, 100).forEach (PrimeFactors::isPrime);
  }

  public static boolean isPrime(int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count += 1;
      }
    }
    if (count == 2) {
      System.out.println (num + " is a prime number");
      return true;
    } else {
      return false;
    }
  }
}
