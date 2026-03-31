//Find the employee who has second lowest salary

import java.util.*;


public class SecLowestSalaryEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> empList = Arrays.asList(new Employee(1, "Alice", "HR", 30, "F", 30000),
				new Employee(2, "Alan", "HR", 45, "F", 27000),
				new Employee(3, "Bob", "IT", 20, "M", 34000),
				new Employee(4, "Charlie", "HR", 50, "M", 43000),
				new Employee(5, "David", "Finance", 26, "M", 20000),
				new Employee(6, "Eve", "IT", 25, "F", 25000));
		
	    Employee emp = empList.stream()
	    		       .sorted(Comparator.comparing(Employee::getSalary))
	    		       .skip(1).findFirst().get();
		
		System.out.println("The list of employee with second lowest salary: "+ emp);

	}
	
}
