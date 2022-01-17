package hospitalproject;

public class Hospital extends Data{
	
	private Doctor doctor;
	private Patient patient;
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	@Override
	public String toString() {
		return "Hospital [doctor=" + doctor + ", patient=" + patient + "]";
	}

	
}
