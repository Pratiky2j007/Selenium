package demo;

public class Examples 
{
	public void PrintSomeElements()
	{
		String[] strArr=new String[5];
		strArr[0]="a";
		strArr[1]="b";
		strArr[2]="c";
		strArr[3]="d";
		strArr[4]="e";
		
		// Output
		// a
		// b
		// c
	}
	
	public void PrintReverse()
	{
		String[] strArr=new String[5];
		strArr[0]="a";
		strArr[1]="b";
		strArr[2]="c";
		strArr[3]="d";
		strArr[4]="e";
	}
	
	public void VerifyElement()
	{
		int[] intArr=new int[4];
		intArr[0]=10;
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		
		// Verify 30 is present in array using While loop
		int i=0;
		while(i<intArr.length)
		{
			i++;
		}
		
	}
	
	public void PrintIndex()
	{
		String[] strArr=new String[4];
		strArr[0]="Hi";
		strArr[1]="Hello";
		strArr[2]="Bye";
		strArr[3]="Java";
		
		// Bye index-> Output: 2 use For each loop
		int i=0;
		for(String s1:strArr)
		{
			if(s1.equals(strArr[2]))
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
	public void PrintModifiedArray()
	{
		int[] intArr=new int[4];
		intArr[0]=10;
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		
		// 11 21 31 41
	}

}
