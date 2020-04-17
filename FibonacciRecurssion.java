public class FibonacciRecurssion
{
	public static void main(String []args)
	{
		System.out.println("This program prints Fibonacci series");
		System.out.println("example:  0 1 1 2 3 5 8 13 21 34");
		//Here I am implementing it using recurssion.
		// I will ask for  iteration as input.
		int i=fibonacc(10,0,1);
		//System.out.println(i);
	}
	public static int fibonacc(int range,int prev_num, int next_num)
	{
		if(range==0)
		{
			return 0;
		}
		else
		{
			System.out.println(prev_num);
			int temp=prev_num;
			prev_num=next_num;
			next_num=next_num+temp;
			return fibonacc(range-1,prev_num,next_num);
		}
	}
}
