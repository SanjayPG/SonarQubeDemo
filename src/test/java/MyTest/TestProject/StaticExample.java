package MyTest.TestProject;

public class StaticExample {
	
	
	int b=10;
	public static int a=20;
	
	public static void m1()
	{	
		 a=30;		
	}
	
	public void test()
	{
		b=20;
		a=40;
	}

	static{
		System.out.println("I am in static block");
	}
	
	public static void main(String[] args) {
			
		m1();
		System.out.println(a);
		StaticExample ex=new StaticExample();
		ex.test();
		System.out.println(a+" "+ex.b);
		
		
		

	}

}
