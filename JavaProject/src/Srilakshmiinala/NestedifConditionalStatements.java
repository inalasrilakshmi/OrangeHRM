package Srilakshmiinala;

public class NestedifConditionalStatements 
{
public static void main(String[] args) 
{
	int val1=10;
	int val2=20;
	int val3=30;
	if(val1>val2)
	{
		System.out.println("val1 is greater than val2");
		
	}
	else
		if(val2>val3)
		{
			System.out.println("val2 is greater than val3");
		}
		else
		{
			System.out.println("val1 is lessthan val2 and val3");
			
		}
}
}
