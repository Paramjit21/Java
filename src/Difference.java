class Difference
{
  public static int diff(int n)
  {
    int sum1 = 0,sum2 = 0;
    for(int i = 1; i <= n; i++)
    {
      //difference between the sum of the squares of the first n natural numbers and
      //the square of their sum
      sum1 += i * i;
      sum2 += i;
    }
    return sum1 - sum2;
  }
  public static void main( String as[])
  {
    System.out.println("Sum : "+diff(19));
  }
}
