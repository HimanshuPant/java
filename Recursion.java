//This program will use recursion to get factorial of 5
public class Recursion
{
	public static void main(String []args)
	{
		System.out.println("This program will give factorial of a number of your choice");
		System.out.println("Here I am printing factorial of 5");
		int number=5;
		int result=factorial(number);
		System.out.println("Factorial of: " + number + " is " + result);
  	}
	public static int factorial (int arg)
	{
	//Function factorial will take one argument of Integer type and return integer
		if(arg==1)
		{return 1;}
		else
		{return arg*factorial(arg-1);}
	}
}

