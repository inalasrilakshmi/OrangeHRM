package ArraysExamples;

public class ObjectArray2 {
	public static void main(String[] args) {
		Object a[]=new Object[4];
		a[0]="testing";
		a[1]=100;
		a[2]='z';
		a[3]=true;
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("********** for each loop *************");
		{

			for(Object j:a)
			{
				System.out.println(j);
				
				
				
			}
		}
		
	}	

}
