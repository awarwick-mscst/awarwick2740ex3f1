package awarwick2740ex3f;

public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	
	public Employee() {
		super();
//		this.name = "";
//		this.idNumber = 0;
//		this.department = "";
//		this.position = "";
	}


	public Employee(String name, int idNumber) {
		super();
		this.name = name;
		this.idNumber = idNumber;
	}


	public Employee(String name, int idNumber, String department, String position) {
		super();
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (name != null) {
			builder.append(name);
			builder.append(", ");
		}
		builder.append("id #:");
		builder.append(idNumber);
		builder.append(", ");
		if (department != null) {
			builder.append("depart: ");
			builder.append(department);
			builder.append(", ");
		}
		if (position != null) {
			builder.append("pos: ");
			builder.append(position);
		}
		return builder.toString();
	}
}
