package schoolproject;

/*
                        School Interface
                        
       IT Department Interface   Language Department Interface
       
           Student                     Instructor
           
           
           Abstraction
           Encapsulation
           Inheritance
           Polymorphisim
 */

public class schoolRunner {

	public static void main(String[] args) {
		
		
		Student std= new Student();
		
		std.setName("Omar");
		std.setLastName("Sensei");
		std.setDepartmentName(ItDepartment.NAME);
		std.setId(101);
		
		Instructor ins=new Instructor();
		
		ins.setName("Suleyman");
		ins.setLastName("Alptekin");
		ins.setId(202);
		ins.setDepartmentName(ItDepartment.NAME);
		
		
		std.setInstructor(ins);
		
		//It can only be reference type//Object type	
		ItDepartment it       =std;
		
		//it.student();
		
		
		
		
		System.out.println(it.student());
		
		School sch=std;
		
          System.out.println("Student name: "+sch.student().getName());
		
		System.out.println("Student lastname: "+sch.student().getLastName());
		System.out.println("Student id : "+sch.student().getId());
		System.out.println("Student Instructor: "+sch.student().instructor().getName());
		
		System.out.println("department name: "+ sch.departmentName());
		

	}

}


