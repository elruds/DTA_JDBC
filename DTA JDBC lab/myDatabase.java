import java.sql.*;


public class myDatabase {

	private Connection connection = null;
	private String allCourseInfo;
	private ResultSet rs;
	private String courseName;
	private String courseChosen;
	private String memberInfo;
	private String memID;
	private String courseiD;
	private int bookingNumb;
	
	
	public myDatabase() {
		createConnection();
		
	}
	
//	public void setCourseID(String cID)	{
//		this.courseiD = cID;
//	}
//	
//	public void setmemID(String mID)	{
//		this.memID = mID;
//	}
//	
//	public void setBookingNumb(int bkNum)	{
//		this.bookingNumb = bkNum;
//	}
	
	
	public void createConnection()	{
		this.connectDatabase();
}
	
	public ResultSet getResultSet(){
		return rs;
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
	
	public String getCourseNames()	{
		

		Statement stmt = null;
						String query = "SELECT DISTINCT name FROM gym.course";
						try {
							stmt = connection.createStatement();
							rs = stmt.executeQuery(query);
							while (rs.next())	{
								
								courseName = rs.getString("name");
								
						}
						}
						catch(SQLException e) {
							e.printStackTrace();
							System.err.println("error executing query "+ query);
						}
					return courseName;
	}

		
	
	
	
	
	
	public String getAllCourses() {
		
		Statement stmt = null;
						String query = "SELECT c.name, c.numplaces,i.fname,i.sname, COUNT(bookingnumber) FROM gym.course as c LEFT JOIN gym.coursebookings as cb "
								+ "ON c.courseid = cb.courseid INNER JOIN gym.instructor as i ON c.instructorid = i.instructorid "
								+ "GROUP BY c.name, c.numplaces,i.fname,i.sname ";
						String allCourseInfo = "";
						try {
							stmt = connection.createStatement();
							rs = stmt.executeQuery(query);
							while (rs.next())	{
								
								String nameOfCourse = rs.getString("name");
								String capacity = rs.getString("numplaces");
								String instructorFName = rs.getString("fname");
								String instructorSName = rs.getString("sname");
								String count = rs.getString("count");
								allCourseInfo += "Course name: " + nameOfCourse + " " + "Capacity: " + capacity + " " + "Instructor: " + instructorFName + " " + instructorSName +  " " + "Members booked: " + count +"\n";
							}
						}
		
						catch(SQLException e) {
							e.printStackTrace();
							System.err.println("error executing query "+ query);
						}
					return allCourseInfo;
	}




	public String viewMemberInfo()	{
		
		Statement stmt = null;
		String query = "SELECT c.name,m.fname,m.sname,cb.memberid FROM gym.coursebookings as cb LEFT JOIN gym.member as m ON cb.memberid = m.memberid "
				+ "INNER JOIN gym.course as c ON cb.courseid = c.courseid ORDER BY c.name";
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next())	{
				
				String courseName = rs.getString("name");
				String memFName = rs.getString("fname");
				String memSName = rs.getString("sname");
				String memberid = rs.getString("memberid");
				memberInfo += "Course name: " + courseName + " " + "Member name: " + memFName + " " + memSName + " " + "Member ID: " + memberid + "\n";
											
			}
		
		
		}
				catch(SQLException e) {
				e.printStackTrace();
				System.err.println("error executing query "+ query);
			
				}
	return memberInfo;
	}


		

		public int databaseInsert(int bkNum, String memID, String courseiD) {
			
			
			Statement stmt = null;
			String sql = "INSERT INTO gym.coursebookings VALUES (bkNum,' "memID" ' , ' "courseiD" ')";
			try {
				stmt = connection.createStatement();
				int rs = stmt.executeUpdate(sql);
				return rs;
				
			}

			catch(SQLException e) {
				e.printStackTrace();
				System.err.println("error executing update "+ sql);
		}
			return 0;
		}
}
		




			