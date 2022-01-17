package fall21Jdbc;
import java.sql.*;

public class Execute02 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//On SQL Developer by typing "SHOW Connection" you can find url
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
		
		Statement st=con.createStatement();
		
		//1.Example : Select the country names whose region id`s are 1
		String sql1= "SELECT country_name FROM countries WHERE region_id =1";
		
		//If you use execute() method, you will get just true or false but I want to see the records.
		
//		boolean r1= st.execute(sql1);
//		System.out.println("execute() methods returned "+ r1+ " for select query");
		
		//To see the records we have another methods which is "executeQuery()"
		
		ResultSet result1= st.executeQuery(sql1);
		
		while(result1.next()) {
			System.out.println(result1.getString("country_name"));
			
		}
		
		
		//2.Example:SEelct the county ids and county names whose region id`s are greater than 2
		
		String sql2= " SELECT country_id, country_name FROM countries WHERE region_id>2";
		
       ResultSet result2= st.executeQuery(sql2);
		
		while(result2.next()) {
			System.out.println(result2.getString("country_id")+ "-->"+ result2.getString("country_name"));
	
			
		}
		
		//3.Example:Select the company whose number of employees is  is the lowest from employees table
		String sql3="SELECT * FROM my_positions WHERE POSITION_SALARY= (SELECT MIN(POSITION_SALARY) FROM my_positions)";
		ResultSet result3=st.executeQuery(sql3);
		
		while(result3.next())
		{
			System.out.println(result3.getInt(1)+ "-" +result3.getString(2)+"-"+ result3.getInt(3));
		}
		
		
		////3.Example:Select the company whose number of employees is  is the lowest from employees table
		String sql4="SELECT * FROM workers WHERE salary= (SELECT MIN(salary) FROM workers)";
		ResultSet result4=st.executeQuery(sql4);
		
		while(result4.next())
		{
			System.out.println(result4.getInt(1)+ "-" +result4.getString(2)+"-"+ result4.getInt(3));
		}
		
		con.close();
		st.close();
		result1.close();
		result2.close();
		result3.close();
		
		
	}

}
