//Find the max age of employees

import java.util.*;


public class MaxAgeOfEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> empList = Arrays.asList(new Employee(1, "Alice", "HR", 30, "F", 30000),
				new Employee(2, "Alan", "HR", 45, "F", 27000),
				new Employee(3, "Bob", "IT", 20, "M", 34000),
				new Employee(4, "Charlie", "HR", 50, "M", 43000),
				new Employee(5, "David", "Finance", 26, "M", 20000),
				new Employee(6, "Eve", "IT", 25, "F", 25000));
		
		   int maxAge = empList.stream()
				        .mapToInt(emp -> emp.getAge())
				        .max().getAsInt();
		   System.out.println("the max age of employee: " + maxAge);
		   
		   
		// Find max age using Comparator
	        Optional<Employee> oldest = empList.stream()
	                                    .max(Comparator.comparing(Employee::getAge));

	        if (oldest.isPresent()) {
	            System.out.println("Oldest Employee: " + oldest.get().getEmpName() + ", Age: " + oldest.get().getAge());
	        } else {
	            System.out.println("Employee list is empty.");
	        }
	}
	
}
