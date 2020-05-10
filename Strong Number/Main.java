import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int sum=0,b=a,f=1;
      while(b>0)
      {
        for(int i=1;i<=(b%10);i++)
          f=f*i;
         sum=sum+f;
        f=1;
        b=b/10;
      }
      if(sum==a)
        System.out.println("Yes");
      else
        System.out.println("No");
      
          
	}
}