package fall21Jdbcdeneme;
import java.sql.*;

public class EXecute02 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "hr");
		
		
		Statement st=con.createStatement();
		
		
		String sql1= "SELECT * FROM my_positions";
		ResultSet result=st.executeQuery(sql1);
		
		while(result.next())
		{
			System.out.println(result.getString("position_id")+ "--"+result.getString("position_name")+"--"+result.getInt("position_salary"));
		}
		
		System.out.println();
		
		System.out.println("========================================");
		System.out.println();
		
		String sql2= "SELECT position_name\r\n"
				+ "FROM my_positions \r\n"
				+ "WHERE position_salary=\r\n"
				+ "            (Select MIN(position_salary) FROM my_positions)";
		
		ResultSet result1= st.executeQuery(sql2);
		
		while(result1.next())
		{
			System.out.println(result1.getString("position_name"));
		}
				
				
		
	}

}
