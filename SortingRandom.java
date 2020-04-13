import java.util.Scanner;
import java.util.Random;
public class SortingRandom
{
	public static void main (String [] args)
	{
		System.out.println("This program can sort elements of any array");
		System.out.println ("Please provide the length of array: ");
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		sc.close();
		System.out.println("Elements of the array are as following:");
		int []array=new int[len];
		Random rnd = new Random();	
		for (int i=0; i <len; i++)
		{
			array[i]=rnd.nextInt(100);
			System.out.println(array[i]);
		}
		sort(array);
		System.out.println("Array Elements after sorting are :");
		for (int i=0; i <len; i++)
                {
                        System.out.println(array[i]);
                }
	}
	public static int [] sort(int newarray[])
	{
		for(int i=0; i < newarray.length; i++)
		{
			for(int j=0; j<i;j++)
			{
				int temp;
				if(newarray[i]>newarray[j])
				{
					temp=newarray[i];
					newarray[i]=newarray[j];
					newarray[j]=temp;
				}
			}
		}
		return newarray;
	}
}
			
