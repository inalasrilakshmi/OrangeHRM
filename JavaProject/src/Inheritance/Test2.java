package Inheritance;

public class Test2 extends Test1 {
	public void method3()
	{
		System.out.println("method3 executed successfully");
	}
void method4()
{
	System.out.println("method4 executed successfully");
}
protected void method5()
{
	System.out.println("method5 executed successfully");
}
private void method6()
{
	System.out.println("method6 executed successfully");
}
public static void main(String[] args) {
	Test2 t2=new Test2();
	t2.method3();
	t2.method4();
	t2.method5();
	t2.method6();
	t2.method1();
	
	
}
}
