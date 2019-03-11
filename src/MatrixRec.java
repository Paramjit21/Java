class MatrixRec
{
  public static void main(String[] args) {
    int k= 0;
    int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    for(int i[] : arr)
    {
      k += 1;
      if(k > 1)
      System.out.print("   ");
      for(int j : i)
      {
        System.out.print(j+" ");
      }
      System.out.println("");
    }
  }
}
