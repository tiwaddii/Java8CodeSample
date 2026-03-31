
public class Emp {
	
	private long id;
	private String empName;
	private String department;
	
	public Emp(int id, String empName, String department) {
		this.id = id;
		this.empName = empName;
		this.department = department;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
	    return "Emp{id=" + id + ", name='" + empName + "', dept='" + department + "'}";
	}
}
