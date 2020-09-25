public class DeciToBinary
{
	public static void main(String args[])
	{
		System.out.println("This prgram can convert any decimal number to binary equivalant.");
		System.out.println("Here is test number to convert: ");
		long binNum=deciToBin(129);
		System.out.println(129 + " equivalant binary number is : " + binNum);
	}
	public static long deciToBin(int x)
	{
//First we have to find out how many binary digit will be used to represent decimal number. To get the number of digit, first loop is running.
		int i=0;
		for(; power(2,i)<x; i++)
		{}

		long binNumber=0;
		int medium;
//Oncd we know how many digit will be in binary number, we will compute 1 and 0 to generate binary number.
		while(i>=0)
		{
			int div=power(2,i);
			medium=x/div;
			binNumber=(binNumber *10+medium);
			i--;
			x%=div;
		}
		return(binNumber);
	}
	//This Function will compute power of x to y. Needed to get power of 2.
	public static int power(int x, int y)
	{
		int z=1;
		
		for(int i=1; i<=y; i++)
			z*=x;

		return z;
	}
}

