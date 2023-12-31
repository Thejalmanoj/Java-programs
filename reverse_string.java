import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      String str,rev="";
      int i,len;
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the String:");
      str=input.nextLine();
      len=str.length();
      for(i=(len-1);i>=0;i--)
      {
          rev=rev+str.charAt(i);
      }
      System.out.println("Reversed string:");
      System.out.println(rev);
      
    }
}
