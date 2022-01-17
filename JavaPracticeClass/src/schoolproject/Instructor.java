package schoolproject;

public class Instructor implements ItDepartment, LanguageDepartment {

	
	private String name;
	private String lastName;
	private String title;
	private String departmentName;
	private String labName;
	private int id;
	@Override
	public String departmentName() {
		
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName)
	{
		this.departmentName=departmentName;
	}
	@Override
	public Instructor instructor() {
		
		return this;
	}
	@Override
	public Student student() {
		
		return null;
	}
	@Override
	public String labNAme() {
		
		return this.labName;
	}
	
	public void setLabName(String labName)
	{
		this.labName=labName;
	}
	@Override
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", lastName=" + lastName + ", title=" + title + ", departmentName="
				+ departmentName + ", labName=" + labName + ", id=" + id + "]";
	}
}
