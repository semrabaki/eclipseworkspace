package schoolproject;

public interface ItDepartment extends School{
	
	
	public static final String NAME="IT Department";
	
    public abstract Instructor instructor(); 
	
	public abstract Student student();
	
	public String labNAme();
	
	public boolean isLabAvaliable();

}
