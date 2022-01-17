package hospitalreview;


public class Patient {
String name;
String lastName;
int patientId;
Case patientCase ;
@Override
public String toString() {
	return "Patient [name=" + name + ", lastName=" + lastName + ", patientId=" + patientId + ", patientCase="
			+ patientCase + "]";
}

	public static Patient findPatient(String actualCase)
	{
		Patient patient= new Patient();
		Hospital hospital= new Hospital();
	
		
		for(int i=0; i<hospital.cases.length; i++)
		{
			if(hospital.cases[i].equalsIgnoreCase(actualCase))
			{
				patient.name(hospital.patientNames[i]);
				patient.lastName(hospital.patientLastNames[i]);
				patient.patientId(hospital.patientIds[i]);
		
			}
			
		}
		return patient;
	
	

}


	private void patientCase(Case patientCase) {
		this.patientCase=patientCase;
		
		
	}

	

	public void patientId(int patientId) {
		this.patientId=patientId;
		
	}

	public void lastName(String lastName) {
		this.lastName=lastName;
		
	}

	public void name(String name) {
		this.name=name;
		
	}

}
