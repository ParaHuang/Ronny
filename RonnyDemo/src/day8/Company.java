package day8;

import java.util.ArrayList;

public class Company {

	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	
	public void addEmployee(Employee e) {//no result
		employees.add(e);//process
	}
	
	public String retriveEmployee(int index) {
		Employee e = employees.get(index);
		String str = "Name:"+e.name
				+"\ntitle:"+e.title;
		return str;
	}
	
	public int getFirstEmployeeId() {
		//xxxxxxxxxxxx
		return employees.get(0).employeeId;
	}
}
