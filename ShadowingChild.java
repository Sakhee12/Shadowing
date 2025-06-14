package PrinciplesOfOops;

public class ShadowingChild extends Shadowing
{
	String a = "Hi";
	static String b = "Bye";
	
	public static void demo()
	{
		System.out.println("From Static Child Class");
	}
	
	public void test()
	{
		System.out.println("From Non Static Child Class");
	}
}
