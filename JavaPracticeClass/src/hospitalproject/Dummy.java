package hospitalproject;

public class Dummy {

	public static void main(String[] args) {
    
		Patient patient = new Patient();
		
		
		patient.setName("Murat");
		patient.setLastname("Altyyev");
		patient.setPatientId(1001);
		
		Case case1 = new Case();
		case1.setActualCase("Java");
		case1.setEmergency(true);
		
		patient.setPatientCase(case1);
		
		Doctor doctor= new Doctor();
		doctor.setName("Elanur");
		doctor.setLastname("Selcuk");
		doctor.setTitle("Pediatrian");
		
		
		Hospital hospital = new Hospital();
		hospital.setDoctor(doctor);
		hospital.setPatient(patient);
		
		System.out.println(hospital);
		
	}

}
