//Find the average salary in all departments

import java.util.*;
import java.util.stream.Collectors;


public class AvgSalForEachDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> empList = Arrays.asList(new Employee(1, "Alice", "HR", 30, "F", 30000),
				new Employee(2, "Alan", "HR", 45, "F", 27000),
				new Employee(3, "Bob", "IT", 20, "M", 34000),
				new Employee(4, "Charlie", "HR", 50, "M", 43000),
				new Employee(5, "David", "Finance", 26, "M", 20000),
				new Employee(6, "Eve", "IT", 25, "F", 25000));
		
		Map<String, Double> avgSalForEachDept = empList.stream()
				                                .collect(Collectors.groupingBy(Employee::getDepName,
				                                		Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println("Average salary of each department " + avgSalForEachDept);

	}
	
}
