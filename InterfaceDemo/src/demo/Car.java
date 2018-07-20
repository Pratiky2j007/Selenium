package demo;

interface I2
{
	public void Engine();
}

public class Car implements I1,I2
{
	public void Brake()
	{
		System.out.println("Brake method");
	}
	
	public void Accelerate()
	{
		System.out.println("Accelerate method");
	}

	public void Engine() 
	{
		System.out.println("Engine method");
	}

}
