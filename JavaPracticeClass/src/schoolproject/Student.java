package schoolproject;

public class Student implements LanguageDepartment,ItDepartment {
	
	private String name;
	private String lastName;
	private int id;
	private String departmentName;
	private Instructor instructor;
	private String labName;
	
	
	@Override//This methods comes from super and parent interfaces
	public String departmentName() {
		
		return this.departmentName;
	}
	@Override//This methods comes from super and parent interfaces
	public Instructor instructor() {
		
		return this.instructor;
	}
	@Override//This methods comes from super and parent interfaces
	public Student student() {
		
		return this;//it means return this class itself
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String lastName, int id, String departmentName, Instructor instructor, String labName) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.departmentName = departmentName;
		this.instructor = instructor;
		this.labName = labName;
	}
	@Override//This methods comes from super and parent interfaces
	public String labNAme() {
		
		return this.labName;
	}
	@Override//This methods comes from super and parent interfaces
	public boolean isLabAvaliable() {
		
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", id=" + id + ", departmentName=" + departmentName
				+ ", instructor=" + instructor + ", labName=" + labName + "]";
	}
	

}
