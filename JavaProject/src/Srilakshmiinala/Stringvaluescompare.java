package Srilakshmiinala;

public class Stringvaluescompare 
{
public static void main(String[] args)
{
	String str1="Live Tech";
	String str2="Selenium";
	String str3="Tech";
	String str4="live tech";
	if(str1.equals(str4))
	{
		System.out.println("Both strings are equal");
	}
	else
	{
		System.out.println("Both strings are not equal");

	}
	if(str1.equalsIgnoreCase(str4))
			{
		System.out.println("Both strings are equal");
		
			}
	else
	{
		System.out.println("Both strings are not equal");
		
	}
	if(str1.contains(str3))	
	{
		System.out.println("string existing");
		
	}

	else
	{
		System.out.println("string not existing");
	}


}
}

