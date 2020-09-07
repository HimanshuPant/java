public class RemoveSpace
{
	public static void main(String []args)
	{
		System.out.println("This program will remove extra spaces from a string");
		String originalString="   This is      a    test    string just     for     testing  this program  .   ";
		System.out.println(originalString);
		String newString=removeSpace(originalString);
		System.out.println("New String is: " + newString);
	}
	public static String removeSpace(String str)
	{
		String newStr="";
		boolean isSpace=false;
		for(int i=0;i<str.length();i++)
		{
			if (isSpace==false || str.charAt(i)!=' ')
			{
				newStr=newStr+str.charAt(i);
			}
			if(str.charAt(i)==' ')
			{
				isSpace=true;
			}
			else
			{
				isSpace=false;
			}
		
		}
		return newStr;
	}
}	
