import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int sum=0;
      int b=a,d=a;
      int c=0;
      while(d>0)
      {
        c++;
        d=d/10;
      }
      
      while(a>0)
      {
        sum=sum+(int)(Math.pow(a%10,c));
        a=a/10;
      }
      if(sum==b)
      	System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}