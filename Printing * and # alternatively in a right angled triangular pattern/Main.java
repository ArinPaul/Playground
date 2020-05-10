import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int k=1;
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(k%2==0)
          	System.out.print("#");
          else
            System.out.print("*");
          k++;
        }
        System.out.println();
      }

    }
}