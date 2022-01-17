package registrationReview;

import java.time.LocalDateTime;

public class User {
	
	public String name;
	LocalDateTime registerDate;
	
	public User() {
		
	}

	public User(String name, LocalDateTime registerDate) {
		
		this.name = name;
		this.registerDate = registerDate;
	}
	
	

}
