package day8;

public class Main {
	public static void main(String[] args) {
		//create variable
		
		//1.primitive variable(short int long     float double    char  boolean  byte)
		//type name = value;
		//int a = 10;
		//double b = 3.14;
		//boolean c = false;
		
		//2.instantiate
		//Type name = new Type();
		Employee e = new Employee();
		e.employeeId=1234;
		
		Company c = new Company();
		
		c.addEmployee(e);
		
		String s = "hello";
//		String s = new String("hello");
		String str = c.retriveEmployee(0);
		System.out.println(str);
		
//		int b = c.getFirstEmployeeId();
		
		int b = c.getFirstEmployeeId();
		System.out.println(b);
	}
}
