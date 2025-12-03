package jdbc1;

import java.sql.*;

public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcurl="jdbc:mysql://localhost:3306/dinesh";
		String username ="root";
		String passwd ="dinesh";
		  try {
				Connection con = DriverManager.getConnection(jdbcurl,username,passwd);
				Statement st = con.createStatement();
				
			//Insert command
				String insertvalue = "insert into user2 values(23,'dinesh')";
				st.execute(insertvalue);
				System.out.println("Value inserted..");
				
				//update command
				String updatevalue = "update user2 set name = 'Akash' where id = 23";
				st.executeUpdate(updatevalue);
				System.out.println("value updated..");
				
				//delete command
				String deletevalue = "delete from user2 where id = 20";
				st.executeUpdate(deletevalue);
				System.out.println("Value deleted..");
				
				//select command
				String result =  "select * from user2";
				ResultSet rs = st.executeQuery(result);
				System.out.println("Values retrived....");
				
				 //to  Print all rows
				while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                
	                System.out.println("ID: " + id + "  Name: " + name);
	            }
				
						
		} catch (SQLException e) {
			
				e.printStackTrace();

	}
	}
}
