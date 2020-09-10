public class Calculater
{
	public static void main(String args[])
	{
		System.out.println("This program can do math on two numbers. Numbers can be as string");
		System.out.println("Here is the String");
		String input="2456*3345";
		System.out.println(input);
		Float output=calculate(input);
		System.out.println("Output is: " + output);	
	}
	public  static Float calculate(String input)
	{
		String num1="0",num2="0";
		Character expr=null;
		for(int i=0;i<input.length(); i++)
			{
			//	System.out.println(input.charAt(i));
			if(expr==null && Character.isDigit(input.charAt(i)))
				num1=num1+input.charAt(i);
			else if(input.charAt(i)=='+' ||input.charAt(i)=='-' ||input.charAt(i)=='*' ||input.charAt(i)=='/') 
					expr=input.charAt(i);
			else if(expr!=null && Character.isDigit(input.charAt(i)))
				num2=num2+input.charAt(i);
			else
				System.out.println("non numeric character");
			}
			Float f1=Float.valueOf(num1);
			Float f2=Float.valueOf(num2);
			//System.out.println(" NUM1: " + num1 + " NUM2: "+num2 + " expr: "+expr);
			Float result;
			if (expr=='+')
				result=f1+f2;
			else if (expr=='-')
				result=f1-f2;
			else if(expr=='*')
				result=f1*f2;
			else if(expr=='/')
				result=f1/f2;
			else 
				result=Float.valueOf(0);
			//System.out.println("Result is: " + result);
			
		return result;
		
	}
}	