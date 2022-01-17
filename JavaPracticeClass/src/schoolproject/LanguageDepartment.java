package schoolproject;

public interface LanguageDepartment extends School {
	
	    public static final String NAME= "Language Department";
	
	    public abstract Instructor instructor(); 
		
		public abstract Student student();
		
		public String labNAme();
		
		public boolean isLabAvaliable();

	

}
