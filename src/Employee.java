public class Employee {
	
		private int id;
		private String empName;
		private String depName;
		private int age;
		private String gender;
		private double salary;
		

		public Employee(int id, String empName, String depName, int age, String gender, double salary) {
			this.setId(id);
			this.empName = empName;
			this.depName = depName;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
		}
		
		public String getEmpName() {
	        return empName;
	    }
		
		public String getDepName() {
			return depName;
		}
		
		public int getAge() {
	        return age;
	    }
		
		public String getGender() {
			return gender;
		}

		public double getSalary() {
		    return salary;
		}
		
		@Override
	    public String toString() {
			return empName + " (" + salary + ")";
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	
}
