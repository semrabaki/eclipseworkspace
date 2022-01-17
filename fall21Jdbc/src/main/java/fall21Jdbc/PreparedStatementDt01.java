package fall21Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDt01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//On SQL Developer by typing "SHOW Connection" you can find url
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
		
		
        Statement st = con.createStatement();
        
        
        //1.EXample:Update the numbe rof empoyees 9999 if the company name is IBM by using prepared statemnt
        
        String sql1= "UPDATE companies SET number_of_employees=? WHERE company=?";
        
        PreparedStatement pst1= con.prepareStatement(sql1);
        pst1.setInt(1, 9999);
        pst1.setString(2, "IBM");
        
       
        int numOfUpdatedRecs= pst1.executeUpdate();
        System.out.println(numOfUpdatedRecs+ " rows updated");
        
        String sql2= "SELECT * FROM companies";
        ResultSet result2= st.executeQuery(sql2);
        while(result2.next())
        {
        	System.out.println(result2.getInt(1) + " - " + result2.getString(2) + " - " + result2.getInt(3));
        }
        
        pst1.setInt(1, 2222);
        pst1.setString(2, "GOOGLE");
        
       
        int numOfUpdatedRecs2= pst1.executeUpdate();
        System.out.println(numOfUpdatedRecs2+ " rows updated");
        
        /*
         Note: ? mark in prepared statements can be used just for columns, it cannot be used for tables
         */
        String sql3= "SELECT * FROM companies";
        ResultSet result3= st.executeQuery(sql3);
        while(result3.next())
        {
        	System.out.println(result3.getInt(1) + " - " + result3.getString(2) + " - " + result3.getInt(3));
        }
        
        con.close();
        st.close();
        pst1.close();
        result2.close();
        result3.close();

	}

}
