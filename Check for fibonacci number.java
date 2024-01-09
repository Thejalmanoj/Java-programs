//QUE: Check if a number is in fibonacci series or not//

import java.util.*;
public class Main
{
    //create a method to check for fibonacci number//
    public static boolean checkFibonacci(int n)
    {
        int a=0,b=1,c=1;
        while(c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return (c==n);
    }
  //create a main method to take user inputs and to call function//
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
    //read the input from user and store it in variable num//
		int num=in.nextInt();
    System.out.println((checkFibonacci(num)?"fibonacci number":"not a fibonacci number"));
	}
}
