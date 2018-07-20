package demo;

public class Loops 
{
	public void ForLoop()
	{
		String str="Hello";

		String[] strArr=new String[5];
		strArr[0]="a";
		strArr[1]="b";
		strArr[2]="c";
		strArr[3]="d";
		strArr[4]="e";

		/*System.out.println(strArr[0]);

		int len=strArr.length;
		System.out.println(len);*/

		for(int i = 0;i<strArr.length;i=i+1)
		{
			System.out.println(strArr[i]);
		}
	}
	
	public void WhileLoop()
	{
		int[] intArr=new int[4];
		intArr[0]=10;
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		
		int i=0;
		while(i<intArr.length)
		{
			System.out.println(intArr[i]);
			i++;
		}
		
	}
	
	public void DoWhileLoop()
	{
		int[] intArr=new int[4];
		intArr[0]=10;
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		
		int i=0;
		do
		{
			System.out.println(intArr[i]);
			i++;
		}while(i<intArr.length);
	}
	
	public void ForEachLoop()
	{
		String[] strArr=new String[4];
		strArr[0]="Hi";
		strArr[1]="Hello";
		strArr[2]="Bye";
		strArr[3]="Java";
		
		for(String s1:strArr)
		{
			System.out.println(s1);
		}
	}

}
