package hospitalreview;

public class Hospital extends Data{
	
	Doctor doctor;
	Patient patient;
	
	
	@Override
	public String toString() {
		return "Hospital [doctor=" + doctor + ", patient=" + patient + "]";
	}
	
	

}
