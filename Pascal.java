public class Pascal{
	
	public static void main(String arge[])
	{
		System.out.println("This program can pring Pascle trangle upto any depth");
		System.out.println("For test I am prining it to depth 5");
		int depth=5;
		printPascle(depth);
	}
	public static void printPascle(int number)
	{
		int  loop1, loop2, loop3, value, secondcopy;
		value=1;
		secondcopy=number;
		for(loop1=0; loop1<=number; loop1++)
		{	
			for (loop2=secondcopy; loop2>0;loop2--)
			{
				System.out.print(" ");
			}
			secondcopy--;
			System.out.print(1);
			for(loop3=0; loop3<loop1; loop3++)
			{
			value=value*(loop1-loop3)/(loop3+1);
			System.out.print(" ");
			System.out.print(value);

			}
			System.out.println("");

		}
	}
}
