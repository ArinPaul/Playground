import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc = new Scanner(System.in);
      String a  = sc.nextLine();
      String b  = sc.nextLine();
      a=a+a;
      int flag=0;
      for(int i=0;i<a.length()-b.length();i++)
      {
        if((a.substring(i,i+b.length())).equals(b))
          flag=1;
      }
      if(flag==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}