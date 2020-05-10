import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int a =sc.nextInt();
      int f=1,l=0,k=1;
      for(int i=1;i<=a;i++)
      {
        if(i%2==0)
          f=f+2;
        if(i%2!=0)
          l=l+2;
        for(int j=1;j<=a;j++)
        {
          if(j!=1 && j!=a)
            System.out.print(k);
          else if(j==1)
            System.out.print(f);
          else if(j==a)
            System.out.print(l);
        }
        System.out.println();
        k++;
      }
	}
}