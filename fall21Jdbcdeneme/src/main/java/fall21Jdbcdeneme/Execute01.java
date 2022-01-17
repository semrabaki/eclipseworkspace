package fall21Jdbcdeneme;

import java.sql.*;//importing sql library

public class Execute01 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//registering for database
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		//creating connection with data base
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "hr");
		
		
		//creating statement
				
		Statement st= con.createStatement();
		
		//execute the query
		
		String sql1="CREATE TABLE family (id CHAR(3), name VARCHAR2(50), salary NUMBER (7,2))";
		boolean result= st. execute(sql1);
	    System.out.println("execute() method returned : " + result+ " for table creation");//I got false from here, it means no record returned
		
	  //2.Example: Alter table by adding worker_address column into the workers table
	    String sql2="ALTER TABLE family ADD address VARCHAR2(50)";
	    boolean result2=st.execute(sql2);
	    System.out.println("execute() method returned : " + result2+ " for table altering");
	    
	   // 3. Example
	    
	    String sql3="DROP TABLE family";
	    boolean result3= st.execute(sql3);
	    System.out.println(result3);
		
		
		
		
		
		
		
		//closin connection, statement Resultsets
		
	}

}
