class Sum
{
  public static int calculateSum(int n)
  {
    //calculate Sum of firdt n natural number
    int sum =0 ;
    for(int i = 3;i <= n; i++ )
    {
      if(i%3 == 0 || i%5 == 0)
      {
        sum += i;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println("Sum : "+calculateSum(19));

  }
}
