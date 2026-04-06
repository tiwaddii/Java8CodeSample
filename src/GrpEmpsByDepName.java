//Group The employees By Department Names & Find the total count of employees using stream

import java.util.*;
import java.util.stream.Collectors;


public class GrpEmpsByDepName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> empList = Arrays.asList(new Employee(1, "Alice", "HR", 30, "F", 30000),
				new Employee(2, "Alan", "HR", 45, "F", 27000),
				new Employee(3, "Bob", "IT", 20, "M", 34000),
				new Employee(4, "Charlie", "HR", 50, "M", 43000),
				new Employee(5, "David", "Finance", 26, "M", 20000),
				new Employee(6, "Eve", "IT", 25, "F", 25000));
		
		Map<String, List<Employee>> deptMap = empList.stream()
        		                              .collect(Collectors.groupingBy(Employee::getDepName));
		deptMap.forEach((dept, employee) -> System.out.println(dept + ": " + employee));
        
        Long empCount = empList.stream().count();
        System.out.println("Total employee count is: "+ empCount);
        
        List<String> deptNamesList = empList.stream()
        		                     .map(emp -> emp.getDepName()).collect(Collectors.toList());
        System.out.println("The department name List: "+ deptNamesList);
        
	}
	
}
