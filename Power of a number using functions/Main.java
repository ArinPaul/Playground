import java.util.Scanner;
class Main{
  	static void exp(int a,int b)
    {
      System.out.println((int)(Math.pow(a,b)));
    }
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      exp(a,b);
	}
}