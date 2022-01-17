package fall21Jdbc;

import java.sql.*;

public class ExecuteQuery01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "hr");
		
		Statement st=con.createStatement();
		
		
		//1.Example: Find the company and number_of _employeesy of ther worker whose salary is the second higest from the campaniess table
		 //1.way
//		String sql= "SELECT position_name, position_salary FROM my_positions WHERE position_salary= (Select MAX(position_salary) FROM my_positions  WHERE position_salary< (SELECT MAX(position_salary) FROM my_positions ))";
//
//		ResultSet result= st.executeQuery(sql);
		
//		while(result.next())
//		{
//			System.out.println(result.getString("position_name")+ " --"+ result.getString("position_salary"));
//		}
		
//		//2.way
//		
//		String sql1= "SELECT name, salary FROM workers ORDER BY salary DESC OFFSET 1 ROW FETCH NEXT ROW ONLY";
//        ResultSet result1= st.executeQuery(sql1);
//        
//        while(result1.next())
//        {
      //  	System.out.println(result.getString("name")+ " --"+ result.getString("salary"));
       // }
		
		//2.Example: Find the position_name and position_salary whose position_salary is less than position_salary
		
		String sql2="SELECT position_name, position_salary FROM my_positions WHERE position_salary <(SELECT AVG(position_salary)FROM my_positions)";
		
		 ResultSet result2= st.executeQuery(sql2);
		 
		 while(result2.next())
		 {
			 System.out.println(result2.getString(1)+ "--"+ result2.getString(2));
		 }
	con.close();
	st.close();

	}


}