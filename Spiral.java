public class Spiral
{
	public static void main(String args[])
	{
		System.out.println("This program prints spiral patern.");
		System.out.println("In this example I will print it for digit 5");
		spiralPatern(5);
	}
	public static void spiralPatern(int x)
	{
		int [][] Matrix = new int [x][x];
		int top=0,left=0, right=x-1, bottom=x-1;
		int counter=1;

		while(true)
		{
			if (left>right)
				break;
			for(int i = left; i <= right; i++)
			{
				Matrix[top][i]=counter;
				counter++;
			}
			top ++;
			if(top>bottom)
				break;
			for(int i=top; i<=bottom; i++)
			{
				Matrix[i][right]=counter;
				counter++;
			}
			right--;
			if(left>right)
				break;
			for(int i=right; i >=left; i--)
			{
				Matrix[bottom][i]=counter;
				counter++;
			}
			bottom--;
			if(top>bottom)
				break;
			for(int i=bottom; i>=top; i--)
			{
				Matrix[i][left]=counter;
				counter++;
			}
			left++;
		}

		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				System.out.print(Matrix[i][j]+ "\t");
			}
			System.out.println("");
		}

	}
}

