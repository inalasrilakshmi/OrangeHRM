package methods;

public class methodsexample2 {
	private void multiplication()
	{
		int p=10;
		int q=20;
		int r;
		r=p*q;
		System.out.println("the multiplication of p and q is:"+r);
	}
void subtraction(int a,int b)
{
	int c;
	c=a-b;
	System.out.println("the subtaction of x and y is:"+c);
}
protected void division(int w,int u)
{
	int v; 
	v=w/u;
	System.out.println("the division of 2 numbers is:"+v);
}
public static void main(String[] args) {
	methodsexample2 m2=new methodsexample2();
	m2.multiplication();
	m2.subtraction(50,20);
	m2.division(100,20);
	methodsexample1 m1=new methodsexample1();
	m1.addition();
	m1.subtraction();	
}
}
