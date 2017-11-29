import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
	myDatabase dataBase = new myDatabase();
	dataBase.connectDatabase();
	databaseGUI frame = new databaseGUI(dataBase);
	frame.setVisible(true); 
	

	}

}
