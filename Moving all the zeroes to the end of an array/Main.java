import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    	arr[i]=sc.nextInt();
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==0)
          c++;
        else
          System.out.print(arr[i]+" ");
      }
      while(c>0)
      {
        System.out.print("0 ");
        c--;
      }
    }
}