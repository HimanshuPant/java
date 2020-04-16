public class Sorting
{

	public static void main(String []args)
	{
		System.out.println("This Program sorts elements of an array of size 10");
		int [] element=new int[]{23,43,54,65,32,21,12,5,8,45};
		sort(element);
		System.out.println("Array Elements after Sorting");
		for (int i=0; i<element.length; i++)
        	{
			System.out.println(element[i]);
		}
	}
	public static int [] sort(int array[])
	//This Function will compare each element of the array with the rest of the elements 
	//and  place the biggest nubmer to the left most place of earth
	// this way array will be sorted
	{
	for (int a=0; a< array.length; a++)
	{
		System.out.println(array[a]);
	}
	for (int i=0; i<array.length; i++)
	{
		for (int j=i; j<array.length; j++)
		{
			int temp;
			if (array[i] < array[j])
			{
				temp=array[j];
				array[j]=array[i];
				array[i]=temp;
			}
		//System.out.println(array[i]);
		}
	}
	return array;
	
	}

}
