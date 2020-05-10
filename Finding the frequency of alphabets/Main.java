import java.util.Scanner;
class Main{
  static String removeDuplicate(char str[], int n) 
    { 
        int index = 0; 
  
        // Traverse through all characters 
        for (int i = 0; i < n; i++) 
        { 
  
            // Check if str[i] is present before it  
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
  
            // If not present, then add it to 
            // result. 
            if (j == i)  
            { 
                str[index++] = str[i];
            } 
        } 
    
    String a = new String(str);
    a=a.substring(0,index);
        return a;
    } 
    public static void main(String args[])
    {
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
      char str[] = a.toCharArray();
      int n = str.length; 
     String c = removeDuplicate(str,n);
      for(int i=0;i<c.length();i++)
      {
        int b = (int)(c.charAt(i))-97; 
        System.out.print(c.charAt(i));
        System.out.print(arr[b]+" ");
      
    }
}
}