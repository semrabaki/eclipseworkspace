package fall21Jdbc;
import java.sql.*;

public class ExecuteQueryDt01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//On SQL Developer by typing "SHOW Connection" you can find url
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
		
		Statement st=con.createStatement();
		
		//1.Example: Find the company and number_of _employeesy of their worker whose salary is the second higest from the campaniess table
        String sql1= "SELECT company, number_of_employees\r\n"
        		+ "FROM companies \r\n"
        		+ "WHERE number_of_employees=( \r\n"
        		+ "                           SELECT max(number_of_employees)\r\n"
        		+ "                           FROM companies WHERE number_of_employees <(\r\n"
        		+ "                           SELECT max(number_of_employees) \r\n"
        		+ "                           FROM companies))";
        
        ResultSet result1 = st.executeQuery(sql1);
        
        while(result1.next());
        {
        	System.out.println(result1.getString(1) + " -> " + result1.getInt(2));
        }
        
       
		con.close();
		st.close();
		result1.close();
	

	}

}
