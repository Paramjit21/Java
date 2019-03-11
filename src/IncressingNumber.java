class IncressingNumber
{
  public static boolean checkNumber(int number)
  {
    //Check if a number is an increasing number
    String newNumber = Integer.toString(number);
    int len = newNumber.length();
    for(int i=0;i<len-2;i++)
    {
      if((int)newNumber.charAt(i) <= (int)newNumber.charAt(i + 1))
      {
        continue;
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println("number is an increasing number : "+checkNumber(123566));

  }
}
