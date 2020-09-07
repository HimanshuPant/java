public class Armstrong
{
	public static void main(String args[])
	{
		System.out.println("This Program check if a number is Armstrong number or not");
		System.out.println("Armstrong number is a number that is equal to the sum of cubes of its digits.");
		System.out.println(" For example 0, 1, 153, 370, 371 and 407");
		int number=370;
		boolean isArmstrong=checkArmstrong(number);
		if(isArmstrong==true)
		{
			System.out.println("Number: " + number + " is an Armstrong number");
		}
		else
		{
			System.out.println("Number: " + number + " is not an Armstrong number");
		}
	}
	public static boolean checkArmstrong(int num)
	{
		int originalnum=num;
		int sum=0;
		int cube=0;
		int digit=0;
		while(num>0)
		{
			digit=num%10;
			cube=getCube(digit);
			sum=sum+cube;
			num=num/10;
		}
		if (sum==originalnum)
			return true;
		else
			return false;
	}
	public static int getCube(int num)
	{
		return num*num*num;
	}
}
