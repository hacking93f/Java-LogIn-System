
/*
 * Simple log in system coded by Neo0Hacker 
 * all rights reserved
 * 
 
 remember to import the sql driver package in your Java-Project
 */


package db_tst;


import java.sql.*;


public class Login_System {
	
	static String username = "ciao1";
	static String password = "ciao1";
	
	
	static Connection connection;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
			Class.forName("org.postgresql.Driver");
			
			
			String url = "jdbc:postgresql://localhost:5432/usr_lgn";
			String usrname= "usrname db";//username d'accesso db
			String pswrd="pwd db";//password d'accesso al db
			connection = DriverManager.getConnection(url,usrname,pswrd);
			
			Statement s = connection.createStatement();

			Statement ps = connection.createStatement();
			
			String getnmsql = "select COLONNA from DATABASE";
			String getpwsql = "select COLONNA from DATABASE";
			ResultSet rs =s.executeQuery(getnmsql);
		    ResultSet pwr= ps.executeQuery(getpwsql);
		    
		    while(rs.next() & pwr.next()) {
		    	String nome = rs.getString("COLONNA");
		    	String pws = pwr.getString("COLONNA");
		    	
		    	if(nome.contentEquals(username) & pws.contentEquals(password)) {
		    		System.out.println("logged");
		    		break;
		    	}
		    	
		    }System.out.println("incorrect username or password ");


}
	}
