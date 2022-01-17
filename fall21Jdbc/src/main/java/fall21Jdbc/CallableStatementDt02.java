package fall21Jdbc;

import java.sql.*;

public class CallableStatementDt02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//On SQL Developer by typing "SHOW Connection" you can find url
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
		
		Statement st=con.createStatement();
		
         String sql1 = "CREATE OR REPLACE PROCEDURE findMinP(a IN NUMBER, b IN NUMBER, c OUT NUMBER) IS BEGIN  IF a<b THEN c:=a; ELSE c:=b; END IF; END;";
		
		st.execute(sql1);
		
		CallableStatement cst1 = con.prepareCall("{ call findMinP( ?, ?, ? ) }");
		
		cst1.setInt(1, 5);
		cst1.setInt(2, 7);
		cst1.registerOutParameter(3, Types.INTEGER);
		
		cst1.execute();
		
		System.out.println(cst1.getInt(3));//5
			
		con.close();
		st.close();

	}

}
