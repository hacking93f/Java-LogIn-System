package db_tst;


import java.sql.*;


public class GetDataFromDB {
	
	static String username = "hacking93f";
	
	


	static Connection connection;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
			Class.forName("org.postgresql.Driver");
			
			
			String url = "jdbc:postgresql://localhost:5432/usr_lgn";
			String usrname= "db";
			String pswrd="falsarone";
			connection = DriverManager.getConnection(url,usrname,pswrd);
			
			Statement s = connection.createStatement();
			
			Statement ss =connection.createStatement();

		        //le colonne del database da scorrere
		
			String inv = "SELECT username FROM public.dati";
			String inv2 = "SELECT dato FROM public.dati";
			
			ResultSet rs = s.executeQuery(inv);
			ResultSet rss = ss.executeQuery(inv2);
			
			while(rs.next() & rss.next() ) {
				
				int v = rss.getInt("dato");
				String nm = rs.getString("username");

					if(nm.contentEquals(username)){
						
						//qui si recuperano i dati e si settano sulla classe dell utente! 
						
						System.out.print(v);
					}
			
			}
			
		
	}
}
