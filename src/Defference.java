class Difference
{
  public static int diff(int n)
  {
    int sum1 = 0,sum2 = 0;
    for(int i = 1; i <= n; i++)
    {
      sum1 += i * i;
      sum2 += i;
    }
    return sum1 - sum2;
  }
  public statc void main()
  {
    System.out.println("Sum :"+diff(19));
}
