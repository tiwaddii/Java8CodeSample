//Find the list of employees whose age is less than 30
//Find the list of employees whose age is in between 26 and 31

import java.util.*;
import java.util.stream.Collectors;


public class EmpAgeLessThan30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> empList = Arrays.asList(new Employee(1, "Alice", "HR", 30, "F", 30000),
				new Employee(2, "Alan", "HR", 45, "F", 27000),
				new Employee(3, "Bob", "IT", 20, "M", 34000),
				new Employee(4, "Charlie", "HR", 50, "M", 43000),
				new Employee(5, "David", "Finance", 26, "M", 20000),
				new Employee(6, "Eve", "IT", 25, "F", 25000));
		
		   List<Employee> ageList = empList.stream()
				                    .filter(emp -> emp.getAge() < 30)
				                    .collect(Collectors.toList());
		   System.out.println("the max age of employee: " + ageList);
		   
		   List<Employee> ageBetween26And30 = empList.stream()
				                              .filter(emp -> emp.getAge() < 31 && emp.getAge() > 26)
				                              .collect(Collectors.toList());

           System.out.println("the max age of employee: " + ageBetween26And30);
		   
	}
	
}
