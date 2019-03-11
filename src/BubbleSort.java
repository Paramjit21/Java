class BubbleSort
{
  public static void main(String ar[]){
    boolean swapped;
    int arr[] = new int[ar.length];
    for(int i=0;i<ar.length;i++)
    {
      arr[i]=Integer.valueOf(ar[i]);
    }
    for(int i = 0; i<ar.length;i++)
    {
      swapped = false;
      for(int j = 0; j < ar.length-1-i; j++)
      {
        if(arr[j] < arr[j+1])
        {
          arr[j] = arr[j+1] + arr[j];
          arr[j+1] = arr[j] - arr[j+1];
          arr[j] = arr[j] - arr[j+1];
          swapped = true;
        }
    }
    if(swapped == false)
      break;
  }
  for(int a : arr)
    System.out.print(a+" ");
  System.out.println();
}
}
