//This program will provide prime number from 1 to 100.
//Author: Himanshu Pant

public class Primenumber{

	public static void main( String [] args)
	{
		System.out.println("Hello There, this program can print prime number from 1 to 100");
		for (int i=1; i<=100; i++)
		{
			if (isprime(i)) 
			{
			System.out.println( i );
			}
		}
	}
	static	boolean	isprime(int number)
	{
		for (int j =2; j <=number/2; j++)
                {
                	if (number%j==0)
                        {
                          return false;              
                        }
                }
	return true;
	}
}
