package eg2;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee e=new Employee(100, "Dave", 12212.11);
		System.out.println(e);
		//System.out.println(e.toString());
		//System.out.println(e.hashCode());
		
		Employee e1=new Employee(101, "Steve", 1212199.99);
		//System.out.println(e1.hashCode());
		System.out.println(e1);
}

}
