package PrinciplesOfOops;

public class Shadowing 
{
	int a = 10;
	static int b = 100;
	
	public static void demo()
	{
		System.out.println("From Static Parent Method");
	}
	
	public void test()
	{
		System.out.println("From Non Static Parent Method");
	}
}
