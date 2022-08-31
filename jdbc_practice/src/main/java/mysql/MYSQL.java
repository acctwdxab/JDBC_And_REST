package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYSQL {
	public static void main(String[] args) {
		try {
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_employee", "root", "P@55word67323746");
			Statement statement = connection.createStatement();
//			ResultSet resultSet = statement.executeQuery("select * from people");
			System.out.println("Employees that are from Accounting and Security Department:");
			ResultSet resultSet = statement.executeQuery("select people.firstname from people inner join department on people.dep_id=department.dep_id;");
			
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}