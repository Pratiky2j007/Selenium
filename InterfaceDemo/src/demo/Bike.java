package demo;

interface I3 extends I1
{
	public int Speed(int a,int b);
	    int a=10; // we cannot change the value of variable 
}

public class Bike implements I3
{
	public void Brake()
	{
		//I3.a=20;
		System.out.println("Bike brake");
	}

	public void Accelerate() 
	{
		System.out.println("Bike Accelerate");
	}

	
	public int Speed(int a,int b) 
	{
		System.out.println("Bike speed");
		return 0;
	}

}
