import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(isPrime(N));
  }

  public static boolean isPrime(int N)
  {
    
    int number = 2;

    if (N==1)
    {
      return false;
    }

    while (number < N)
    {
      if (N % number == 0)
      {
        return false;
      }
      number++;
    }  
    return true;
  }
}
