import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpGroupingByDept {
	
	public static void main(String[] args) {
		List<Emp> empList = Arrays.asList(new Emp(1, "ADT", "CS"),
				                          new Emp(4, "PRAN", "CS"),
				                          new Emp(3, "SNE", "IT"),
				                          new Emp(2, "MIS", "ME"));
				
				
				Map<String, List<Emp>> emps = empList.stream()
						                .collect(Collectors.groupingBy(Emp :: getDepartment));		
				emps.forEach((dept, empListByDept) -> {System.out.println("Department:" + dept + "-> Employees: "+empListByDept);
				});
	}

}
