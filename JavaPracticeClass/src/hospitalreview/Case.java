package hospitalreview;


public class Case {
	
	String actualCase;
	Boolean emergency;
	@Override
	public String toString() {
		return "Case [actualCase=" + actualCase + ", emergency=" + emergency + "]";
	}
	
	public static Case findCase(String actualCase)
	{
		Case case1= new Case();
		switch (actualCase)
		{
		case"headache":
		case1.setActualCase(actualCase);
		case1.setEmergency(false);
		break;
		
		case"allergy":
		case1.setActualCase(actualCase);
		case1.setEmergency(true);
		break;
		
		case"vision":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
		
		case"heart diseases":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
		case"tumor":
			case1.setActualCase(actualCase);
			case1.setEmergency(true);
			break;
			
		case"stomacache":
			case1.setActualCase(actualCase);
			case1.setEmergency(false);
			break;
			
			default:
				System.out.println("No matching case!!");
				break;
		}
		return case1;
			
			
		}

	private void setEmergency(boolean emergency) {
		
		this.emergency=emergency;
		
		
	}

	private void setActualCase(String actualCase) {
		this.actualCase=actualCase;
		
	}

}
