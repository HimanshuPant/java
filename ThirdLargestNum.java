public class ThirdLargestNum
{
	public static void main(String []args)
	{
		System.out.println("This program will print third largest number in an arrya");
		int randomarray[]=new int []{413,213,154,26,34,121,45};
		for (int i=0; i<randomarray.length;i++)
		{
			System.out.println(randomarray[i]);
		}
		int result=findThirdLargest(randomarray);
		System.out.println("Third Largest Number in the array is: " + result);
	}
	public static int findThirdLargest(int array[])
	{
		for (int i=0; i<3;i++)
		{
			for (int j=i; j<array.length; j++)
			{
				if (array[j]>array[i])
				{	
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}

		System.out.println("After array sorting: ");
		for (int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		return array[2];
	}
}

