import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(fact(a));
  }
  public static int fact(int n)
  {
    if(n==0)
      return 0;
    else
      return n+fact(n-1);
  }
}