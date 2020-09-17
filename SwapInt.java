public class SwapInt
{
	public static void main(String args[])
	{
		System.out.println("This program will swap int value");
		swapInt(14,52);
	}
	public static void swapInt(int x, int y)
	{
		System.out.println ("Before Swap Values of x and y are:  " +x + " and " + y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println ("After Swap Values of x and y are:  " +x + " and " + y);
	}
}