
import java.util.*;
import java.util.stream.Collectors;


public class DemoApp {

	static List <Employee> empList = Arrays.asList(new Employee(1, "Alice", "HR", 30, "F", 30000),
			new Employee(2, "Alan", "HR", 45, "F", 27000),
			new Employee(3, "Bob", "IT", 20, "M", 34000),
			new Employee(4, "Charlie", "HR", 50, "M", 43000),
			new Employee(5, "David", "Finance", 26, "M", 20000),
			new Employee(6, "Eve", "IT", 25, "F", 25000));

	public static void main(String[] args) {

		List<Employee> employeeWithA = empList.stream().filter(emp -> emp.getEmpName().startsWith("A")).collect(Collectors.toList());
		System.out.println("empList whose name starts with A: " + employeeWithA);


		Map<String, List<Employee>> deptWithEmployee = empList.stream().collect(Collectors.groupingBy(Employee::getDepName));
		System.out.println("Group empList by department names: "+deptWithEmployee);

		long count = empList.stream().count();
		System.out.println("Total Number of empList: " + count);

		int age = empList.stream().mapToInt(Employee::getAge).max().getAsInt();
		System.out.println("Maximum age of employee: "+ age);

		Set<String> allDepartmentNames = empList.stream().map(Employee::getDepName).collect(Collectors.toSet());
		System.out.println("Name of all department: "+ allDepartmentNames);

		Map<String, Long> employeeCountByDepartment = empList.stream().collect(Collectors.groupingBy(Employee::getDepName, Collectors.counting()));
		System.out.println("The count of employee by department: "+employeeCountByDepartment);

		List<Employee> ageLessThan30 = empList.stream().filter(emp -> emp.getAge() < 30).collect(Collectors.toList());
		System.out.println("The age of employees less than 30: "+ageLessThan30);

		List<Employee> ageBetween26And30 = empList.stream().filter(emp -> emp.getAge() < 30 && emp.getAge() > 26).collect(Collectors.toList());
		System.out.println("The employee age between 26 and 31: "+ageBetween26And30);

		Map<String, Double> avgAgeOfMaleAndFemale = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Average age of male & female: "+ avgAgeOfMaleAndFemale);

		Map.Entry<String, Long> deptMaxcount = empList.stream().collect(Collectors.groupingBy(Employee::getDepName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("Department having maximum number of empList: " + deptMaxcount);

		Map<String, Double> avgSalForEachDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepName, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Average salary of each department: " + avgSalForEachDept);

		Map<String, Optional<Employee>> highestSalForEachDedpt = empList.stream().collect(Collectors.groupingBy(Employee::getDepName, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		System.out.println("Highsest salary form each department: "+highestSalForEachDedpt);

		List<Employee> empListWithSortedSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println("Employee with sorted salary: "+ empListWithSortedSalary);

		Employee withSecondHighestSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();
		System.out.println("Second highest salary: "+withSecondHighestSalary);
	}

}