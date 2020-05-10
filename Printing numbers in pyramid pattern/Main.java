import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int k=1;
      for(int i=1;i<=a;i++)
      {
        for(int j=1;j<=a;j++)
        {
          if(j>(a-i))
          {
            System.out.print(k+" ");
            k++;
          }
          else
            System.out.print(' ');
          
        }
        System.out.println();
      }
    }    
}