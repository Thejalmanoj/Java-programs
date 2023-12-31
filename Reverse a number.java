import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      int num,rev=0,rem;
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the number:");
      num=input.nextInt();
      while(num>0)
      {
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
      }
      System.out.println("Reversed number:");
      System.out.println(rev);
      
    }
}
