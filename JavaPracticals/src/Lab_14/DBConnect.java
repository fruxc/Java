/**
 * 
 */
package Lab_14;
/**
 * Imports
 */

import java.sql.*;

/**
 * @author HAMMAD
 *
 */
public class DBConnect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student_data");
			System.out.println("ID\tName\tAge\tUCID\t\tDBMS\tJAVA");
			String query = " insert into student_result (id, name, ucid, total, average)"+ " values (?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6));
				preparedStmt.setInt(1, rs.getInt(1));
				preparedStmt.setString(2, rs.getString(2));
				preparedStmt.setInt(3, rs.getInt(4));
				preparedStmt.setInt(4, (rs.getInt(5)+rs.getInt(6)));
				preparedStmt.setInt(5, (rs.getInt(5)+rs.getInt(6))/2);
				preparedStmt.execute();
				System.out.println("Inserted total and average for "+rs.getInt(4));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println("Exception Occurred "+e);
		}
	}

}
