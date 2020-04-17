public class Fibonacci
{
	public static void main(String []args)
	{
		System.out.println("This program prints Fibonacci series");
		System.out.println("example:  0 1 1 2 3 5 8 13 21 34");
		//Here I am implementing it using for loop.
		// I will ask for  iteration as input.
		int prev_num=0;
		int next_num=1;
		for(int i=0;i<=10;i++)
		{
				System.out.println(prev_num);
				int temp=prev_num;
				prev_num=next_num;
				next_num=next_num+temp;
		}
	}
}
