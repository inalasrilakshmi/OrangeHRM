package methods;

public class methodsexample1 {
	public void addition()
	{
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("the addition of a nd b is:"+c);
	}
public static void main(String[] args) {
	methodsexample1 m1=new methodsexample1();
	m1.addition();
	m1.addition();
	m1.addition();
	//methodsexample1 m2=new methodsexample1();
	m1.subtraction();	
}
public void subtraction()
{
	int x=30;
	int y=10;
	int z;
	z=x-y;
	System.out.println("the subtraction of x and y is:"+z);
}
}
