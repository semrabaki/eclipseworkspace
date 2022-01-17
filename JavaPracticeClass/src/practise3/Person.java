package practise3;

public class Person {
	
	private String name;
	private String lastName;
	private int age;
	private String email;
	
	
	public Person() {
		
	}
	public Person(String name, String lastName, int age) {

		this.name = name;
		this.lastName = lastName;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", email=" + email + "]";
	}
	

}
