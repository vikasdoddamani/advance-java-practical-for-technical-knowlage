

// (co-of https://github.com/vikasdoddamani)
// java program to count the number from 1 to 10
// from more information read theory_PrimeNumber

// A school method based Java program to
// check if a number is prime

class PrimeNumber {


  static boolean isPrime(int n)
  {

    if (n <= 1)
      return false;


    else if (n == 2)
      return true;

    
    else if (n % 2 == 0)
      return false;

    
    for (int i = 3; i <= Math.sqrt(n); i += 2)
    {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args)
  {
    if (isPrime(19))
      System.out.println("is a prime number");

    else
      System.out.println("is not a prime number");
  }
}
