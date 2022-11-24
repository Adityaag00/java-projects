package my_pack;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ConnToDB {

	private Connection connect = null;
	private Statement statement = null;
	// private PreparedStatement prep = null;
	private ResultSet res = null;
	HashMap<String,String> hashmap = new HashMap<String,String>();
	
	ConnToDB (String choice) {
		
		if (choice.equalsIgnoreCase("for Login")) {
			this.config("person_DB","root","tiger");
			this.selectToLogin();
		}
		else
			this.config("person_DB","root","tiger");
		
	}
	
	private void config (String dbName,String dbUsername,String dbPassword) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connect = DriverManager.getConnection("jdbc:mysql://localhost/"+ dbName +"?user="+ dbUsername +"&password="+ dbPassword +"");
			statement = connect.createStatement();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void selectToLogin () {

		try {
			String sqll = "select Email,Password from person";
			
			res = statement.executeQuery(sqll);
			while (res.next()) {
				
				String email = res.getString("Email");
				String passwd = res.getString("Password");
				
				hashmap.put(email,passwd);
			}
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void insertData (String fname,String lname,String email,String passwd) {
		try {
			String sqll = "insert into person (f_name,l_name,Email,Password) values ('"+ fname +"','"+ lname +"','"+ email +"','"+ passwd +"')";
			connect.prepareStatement(sqll).executeUpdate();
			
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void updateData () {
		try {
			String sqll = "";
			connect.prepareStatement(sqll).executeUpdate();
			
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	void deleteData () {

		try {
			String sqll = "";
			connect.prepareStatement(sqll).executeUpdate();
			
			connect.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
