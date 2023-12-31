//(1)USING CONDITIONAL STATEMENTS//
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		int num,i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=input.nextInt();
		if(num==0||num==1)
		{
		    System.out.println("Not a prime");
		}
		for(i=2;i<num/2+1;i++)
		{
		    System.out.println((num%i==0)?"not a prime":"prime number");
		}
	}
}
