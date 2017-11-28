
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class databaseGUI extends JFrame implements ActionListener
{
	//instance variables are all the components 
			private JPanel top, bottom;
            private JLabel memberFNameLabel, memberSNameLabel, memberInfoLabel, memberIDLabel, courseLabel, courseIDLabel;
            private JTextField enterCourse, enterMemberFName, enterMemberSName,enterMemberID, enterCourseID;
            private JTextArea displayInfo;
            private JButton courseInfoButton, memberInfoButton, bookButton;
            private myDatabase db;
            private String courseName;
            private String chosenCourse;
            private String memberFName;
            private String memberSName;
            private String memberID;
            private String courseID;
            private int bookingNumber;
            
            
            
           public databaseGUI(myDatabase db) {
        	   
        	this.db = db;   
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
       		setTitle("Gym Bookings");
       		setSize(1200,175);
       		setLocation(0,0);
       		
			courseName = db.getCourseNames();
				
			layoutComponents();
}
          

           
           private void layoutComponents() {
        	   
        	   top = new JPanel();
        	   top.setBackground(Color.gray);
        	   
        	   courseInfoButton = new JButton("View info on all courses");
        	   courseInfoButton.addActionListener(this);
        	   top.add(courseInfoButton);
        	   
        	   displayInfo = new JTextArea(5,50);
        	   displayInfo.setEditable(false);
        	   JScrollPane scrollPane = new JScrollPane(displayInfo);
        	   top.add(scrollPane);
       	           	   
//        	   memberInfoLabel = new JLabel("View member info for:");
//        	   top.add(memberInfoLabel);
//        	   
        	   
//        	   enterCourse = new JTextField(15);
//        	   top.add(enterCourse);
        	   
        	   memberInfoButton = new JButton("View Member Info");
        	   memberInfoButton.addActionListener(this);
        	   top.add(memberInfoButton);
        	   
        	   bottom = new JPanel();
        	   FlowLayout fl = new FlowLayout();
        	   bottom.setLayout(fl);
        	   
//        	   memberFNameLabel = new JLabel("Member forename:");
//        	   bottom.add(memberFNameLabel);
//        	   
//        	   enterMemberFName = new JTextField(15);
//        	   bottom.add(enterMemberFName);
//        	   
//        	   memberSNameLabel = new JLabel("Member surname:");
//        	   bottom.add(memberSNameLabel);
//        	   
//        	   enterMemberSName = new JTextField(15);
//        	   bottom.add(enterMemberSName);
        	   
        	   memberIDLabel = new JLabel("Member ID:");
        	   bottom.add(memberIDLabel);
        	   
        	   enterMemberID = new JTextField(5);
        	   bottom.add(enterMemberID);
        	   
        	   courseIDLabel = new JLabel("Course ID:");
        	   bottom.add(courseIDLabel);
        	   
        	   enterCourseID = new JTextField(10);
        	   bottom.add(enterCourseID);	 
        
        	   
        	   bookButton = new JButton("Book");
        	   bottom.add(bookButton);
        	   
        	   add(top,BorderLayout.NORTH);
        	   add(bottom, BorderLayout.SOUTH);
        	   
           }
             

           
           
           public void actionPerformed(ActionEvent e) {
        	   
        	           	   
        	   if (e.getSource() == courseInfoButton)	{  
        		   String result = db.getAllCourses();
        		   displayInfo.setText("");
        		   displayInfo.append(result);
        	   }
        		   
        		   
        		    if (e.getSource() == memberInfoButton)	{
        			   displayInfo.setText(" ");
        			   displayInfo.append(db.viewMemberInfo());
        		   	}
        		    
        		    if (e.getSource() == bookButton)	{
        		    	memberID = enterMemberID.getText();
        		    	courseID = enterCourseID.getText();
        		    	bookingNumber = generateBookingNumber(602, 1000);
        		    	System.out.print(bookingNumber);
        		    	
        		    }
        		    
        		    
        		    
        	   }
           
        		   
                	   
        		private int generateBookingNumber(int min, int max) {
        			
        			min = (int) Math.ceil(min);
        			max = (int )Math.floor(max);
        			return (int) (Math.floor(Math.random() * (max - min)) + min);
        			
        		}
}
        		   
        		   
        		   


          
