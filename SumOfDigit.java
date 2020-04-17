public class SumOfDigit
{
	public static void main(String []args)
	{
		System.out.println("This program will sum all the digits of a number given");
		System.out.println("Example, if input number is 153, output will be 1+5+3=9");
		int number=185;
		System.out.println("Sum of digit of: " + number + " is : " + getSum(number));
	}
	public static int getSum(int num)
	{
		int sum=0;
		while(num >0)
		{
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		return sum;
	}
}

