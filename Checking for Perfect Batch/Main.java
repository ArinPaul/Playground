import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]=sc.nextInt();
    int flag=0;
    for(int i=0;i<n;i=i+3)
    {
      if(n==(arr[i]+arr[i+1]+arr[i+2]))
         flag++;
    }
    if(n==9)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}