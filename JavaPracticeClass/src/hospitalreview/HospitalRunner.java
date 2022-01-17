package hospitalreview;

public class HospitalRunner {

	public static void main(String[] args) {
		
		Doctor doctor =new Doctor();
		Hospital hospital= new Hospital();
		
		System.out.println(doctor.doctorTitle("vision"));
		
		System.out.println(doctor.findDoctor(doctor.doctorTitle("tumor")));
		
	    System.out.println(Patient.findPatient("vision"));
	    
	  
		
	   

	}

	
	
	
	

}
