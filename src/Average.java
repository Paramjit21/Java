import java.util.Scanner;
class Average
{
  public static void avg(int n)
  {
    int sum = 0;
    for(int i = 1;i <= n;i++)
    {
      sum += i;
    }
    System.out.println("Sum is : "+sum/2);
  }
  public static void main(String[] args) {
    int n ;
    System.out.println("Enter number:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    avg(n);
  }
}
