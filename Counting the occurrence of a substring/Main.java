import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    a=a+"    ";
    String b = sc.nextLine();
    int c=0;
    for(int i=0;i<=a.length()-b.length();i++)
    {
      if((a.substring(i,i+b.length())).equals(b))
        c++;
    }
    System.out.println(c);
  } 
}