package Inheritance;

public class Test3 extends Test2 {
	public void method7()
	{
		System.out.println("method7 executed successfully");
	}
public static void main(String[] args) {
	Test3 t3=new Test3();
	int a=10;
	int b=20;
	int c;
	c=a+b;
	System.out.println("the addition of a and b is:"+c);
	
	t3.method7();
	t3.method1();
	t3.method3();
	t3.method4();
	t3.method5();
	
	
}
}
