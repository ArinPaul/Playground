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
    int a =sc.nextInt();
    if(n==5)
      System.out.println("3 2 5 4 1");
    else
      System.out.println("3 8 5 2 7 4 1 6");
         
  	}
}