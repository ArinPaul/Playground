import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
      a=a+" ";
    String b="",c="";
      for(int i=0;i<=a.length()-1;i++)
      {
        if(a.charAt(i)!=' ')
          b=b+a.charAt(i);
        else
        {
          c=b+" "+c;
          b="";
        }
      }
      System.out.println(c);
    }
}