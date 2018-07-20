package demo;

interface I1
{
	public void Brake();
	public void Accelerate();
}

public class MainClass 
{

	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.Accelerate();
		obj.Brake();
		obj.Engine();
		
		Bike obj1=new Bike();
		obj1.Accelerate();
		obj1.Brake();
		obj1.Speed(2, 3);

	}

}
