//Find list of employees whose name starts with alphabet A

import java.util.*;
import java.util.stream.Collectors;


public class ListofEmpStartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> emp = Arrays.asList("Alice", "Bob", "Andrew", "Charlie");
        List<String> emps = emp.stream()
        		            .filter(e -> e.startsWith("A"))
        		            .collect(Collectors.toList());
        System.out.println("Employees with names starting with A: " + emps);
	}
	
}
