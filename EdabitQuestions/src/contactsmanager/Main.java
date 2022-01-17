package contactsmanager;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		 ContactsManager myContactManager= new  ContactsManager ();
		 
		 
		    Contact contact1= new Contact();
		    contact1.name="Ali can";
	        contact1.phoneNumber="+90555256738";
	        myContactManager.addContact(contact1);
	        
	        Contact contact2=new Contact();
	        contact2.name="veli han";
	        contact2.phoneNumber="+906734837627";
	        myContactManager.addContact(contact2);
	        
	        Contact contact3=new Contact();
	        contact3.name="deli kan";
	        contact3.phoneNumber="+9087764837627";
	        myContactManager.addContact(contact3);
	        
	       Contact searchedContact =myContactManager.searchContact("veli han");
	       
	       System.out.println(searchedContact.phoneNumber);
		 

	}

}
