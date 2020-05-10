import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    	Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int i,j;
    int m1[][] = new int [r][c];
    int m2[][] = new int [r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        m1[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        m2[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print((m1[i][j]-m2[i][j])+" ");
      }
      System.out.println();
    }
  }
}