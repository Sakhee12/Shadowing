package PrinciplesOfOops;

public class ShadowingDriver
{
	public static void main(String[] args) 
	{
		Shadowing s1 = new ShadowingChild ();
		
		//Method Shadowing
		s1.demo();
		s1.test();
		 
		//Variable Shadowing
		System.out.println(s1.a);
		System.out.println(s1.b);
	}
}
