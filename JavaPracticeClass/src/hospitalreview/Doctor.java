package hospitalreview;

public class Doctor {
  
	String name;
	String lastName;
	String title;
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", lastName=" + lastName + ", title=" + title + "]";
	}
	
	
	public static String doctorTitle(String actualCase)
	{
		
		String title="";
		switch(actualCase)
		{
		case"headache":
			title="Generalist";
			break;
		case"allergy":
			title="Pediatrist";
			break;
		case"vision":
			title="Ophthalmologist";
		case"muscle":
			title="Neurologist";
			break;
		case"heart disesases":
		   title="Internist";
		   break;
		case"tumor":
			title="Dermatologist";
			break;
		case"Stomacache":
			title="Internist";
			break;
			default:
				System.out.println("No matching Title!");
				break;
		
		}
		
		return title;
	}
	
	public static Doctor findDoctor(String title)
	{
		Doctor doctor= new Doctor();
		
		Hospital hospital= new Hospital();
		
		
		for( int i=0; i<hospital.titles.length; i++)
		{
			if(hospital.titles[i].equalsIgnoreCase(title))
			{
				doctor.name(hospital.doctorNames[i]);
				doctor.lastName(hospital.doctorLastNames[i]);
				doctor.title(hospital.titles[i]);
				
				
			}
		}
		return doctor;
	}


	public void title(String title) {
		this.title=title;
		
	}


	public void lastName(String lastName) {
		this.lastName=lastName;
		
	}


	public void name(String name) {
		this.name=name;
		
	}
}
