import java.sql.*;


public class myDatabase {

	private Connection connection = null;
	private String [] courseNames;
	

	
	public myDatabase()	{

}
	

	
	public void connectDatabase() {
		
		String dbName = "m_17_2345940r";
		String userName = "m_17_2345940r";
		String passWord = "2345940r";
	
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://yacata.dcs.gla.ac.uk:5432/" + dbName,userName,passWord);
		}
		
		catch(SQLException e) {
		
			System.err.println("Connection Failed!");
			e.printStackTrace();
			return;
		
	}
	
		if(connection!= null) {
				System.out.println("Connection successful");
		}
		
		else {
				System.err.println("Failed to make connection!");
		}
	}
	
	public void closeDatabaseConnection() {	
		
		try {
				connection.close();
				System.out.println("Connection closed");
		}
		
		catch(SQLException e) {
			  e.printStackTrace();
			  System.out.println("Connection could not be closed - SQL exception");
		}
	}
	
	
	
	
	
	
	public String [] getAllCourses() {
		
		Statement stmt = null;
						String query = "SELECT name FROM gym.course ";
						try {
							stmt = connection.createStatement();
							ResultSet rs = stmt.executeQuery(query);
							while (rs.next()){
								int i;
								for (i = 0; i < 10; i++) {

								String courseName = rs.getString("name");
								String [] courseNames = new String[10];
								courseNames[i] = courseName;
								System.out.print(courseNames);
							}
						}
						}
		
						catch(SQLException e) {
							e.printStackTrace();
							System.err.println("error executing query "+ query);
						}
					return courseNames;
	}

//		public String getInstructorNameAndCapacity() {
//	
//		Statement stmt = null;
//						String query = "SELECT gi.fname,gi.sname,gc.numplaces FROM gym.instructor as gi INNER JOIN gym.course as gc ON gi.instructorid=gc.instructorid "
//								+ "RIGHT JOIN gym.coursebookings as gcb ON gc.courseid = gcb.courseid" ;
//							try {
//									stmt = connection.createStatement();
//									ResultSet rs = stmt.executeQuery(query);
//									while (rs.next()) {
//				
//										String instructorFName = rs.getString("fname");
//										String instructorSName = rs.getString("sname");
//										int capacity = rs.getInt("numplaces");
//
//										return instructorFName + " " + instructorSName + " " + capacity;
//									}
//			
//							}
//
//							catch(SQLException e) {
//								e.printStackTrace();
//								System.err.println("error executing query "+ query);
//							}
//							return "";
//		
//		}
//
//	

//		public int databaseInsert() {
//			
//			Statement stmt = null;
//			String update = "INSERT INTO gym.member VALUES ('Ruby','Monro','31 Brown Street','G12 5DG',072937392, '879','Student')";
//			try {
//				stmt = connection.createStatement();
//				int rs = stmt.executeUpdate(update);
//				return rs;
//				
//			}
//
//			catch(SQLException e) {
//				e.printStackTrace();
//				System.err.println("error executing update "+ update);
//		}
//			return 0;
//		
		
		
}

		



			