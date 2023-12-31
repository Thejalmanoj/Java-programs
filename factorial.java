import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
      int num,fact=1,i;
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the number:");
      num=input.nextInt();
      for(i=1;i<=num;i++)
      {
          fact=fact*i;
      }
      System.out.println("Factorial is"+" "+fact);
    }
}
