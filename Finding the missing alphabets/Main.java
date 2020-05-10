import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String a = sc.nextLine();
      a=a.toLowerCase();
      int arr[]=new int[26];
      for(int i=0;i<a.length();i++)
      {
        if(a.charAt(i)!=' ')
        {
          int b = ((int)(a.charAt(i))-97);
          arr[b]++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(arr[i]==0)
          System.out.print(((char)(i+97))+" ");
      }
      
               
    }
}