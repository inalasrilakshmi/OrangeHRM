package ArraysExamples;

public class MultiDimensionalarrayExample {
	public static void main(String[] args) {
		String str[][]=new String[2][2];
		str[0][0]="selenium";
		str[0][1]="livetech";
		str[1][0]="testing";
		str[1][1]="loadrunner";
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(str[i][j]+" ");
				
			}
		
		System.out.println();
	}

}
}