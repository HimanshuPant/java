public class Palindrome
{
	public static void main(String []args)
	{
		System.out.println("This program will find if given integer is palindrome or not");
		int number=123454321;
		System.out.println("Number is: "+number); 
		int reverse=reverse(number);
		if(number==reverse)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
	public static int reverse(int num)
	{
		int reverse=0;
		while(num>0)
                {
                         reverse=reverse*10+(num%10);
                         System.out.println("reverse: "+ reverse + "    temp: " + num);
                         num=num/10;
                }
                System.out.println("reverse number is: " + reverse);
		return reverse;
	}
}
