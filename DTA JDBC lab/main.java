import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
	myDatabase dataBase = new myDatabase();
	dataBase.connectDatabase();
//	dataBase.databaseInsert();
	databaseGUI frame = new databaseGUI();
	frame.setVisible(true); 
	
	
	System.out.print(dataBase.getAllCourses());
//	System.out.print(dataBase.getInstructorNameAndCapacity());
	}

}
