package eg1;

public class CaliMain {

	public static void main(String[] args) {
		
		Calci c=new Calci("JAVA");
		
	System.out.println("Result is "+c.add());
	
	
	Calci c1=new Calci(10, 999);
	System.out.println("Result with c1 is "+c1.add());
	}
}
