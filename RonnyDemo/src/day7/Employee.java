package day7;

public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	String title;
	double salary;
	
	public String getFullName(){
		return firstName+" "+lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void giveRaise() {
		salary += 5000;
	}
	
	public static void main(String[] args) {
		//create an instance of Employee
		Employee employee = new Employee();
		employee.firstName = "Haolin";
		employee.lastName = "Tang";
		employee.employeeId = 12345;
		employee.title = "Software Engineer";
		employee.salary = 80000;
		
		System.out.println(employee.getFullName());
		System.out.println("ID:"+employee.employeeId
				+",Title:"+employee.title
				+",Salary:"+employee.salary);
		
		System.out.println("Current Salary:"+employee.getSalary());
		employee.giveRaise();
		System.out.println("Raised Salary:"+employee.getSalary());
		
	}
	/*
	//1. set a value	-> firstName = ????	->	setter
	public void setEmployeeId(int id) {
		if(id<0) {
			System.out.println("invalid id");
			employeeId = 10000;
		}else {
			employeeId = id;
		}
	}
	
	//2. get a value	-> print(firstName)	->	getter
	public int getEmployeeId(){
		return employeeId;
	}
	//right click empty place -> source -> generate getters and setters
	*/
}







