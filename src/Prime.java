import java.util.Scanner;
class Prime
{
  public static void main(String[] args) {
    int n ;
    System.out.println("Enter number:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(int i=1;i<=n/2;i++)
    {
      if(n%i == 0)
      {
          System.out.println("Not Prime number!!");
          System.exit(0);
      }
    }
    System.out.println("Prime Number");

  }
}
