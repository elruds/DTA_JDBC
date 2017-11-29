
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class databaseGUI extends JFrame implements ActionListener
{
	//instance variables are all the components 
			private JPanel top, bottom;
            private JLabel memberIDLabel, courseIDLabel;
            private JTextField enterMemberID, enterCourseID;
            private JTextArea displayInfo;
            private JButton courseInfoButton, memberInfoButton, bookButton;
            private myDatabase db;
            private String courseName;
 
          
    
            
           public databaseGUI(myDatabase db) {
        	   
        	this.db = db;   
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
       		setTitle("Gym Bookings");
       		setSize(1200,250);
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
        	   
        	   displayInfo = new JTextArea(10,50);
        	   displayInfo.setEditable(false);
        	   JScrollPane scrollPane = new JScrollPane(displayInfo);
        	   top.add(scrollPane);
       	           	   
        	   memberInfoButton = new JButton("View Member Info");
        	   memberInfoButton.addActionListener(this);
        	   top.add(memberInfoButton);
        	   
        	   bottom = new JPanel();
        	   FlowLayout fl = new FlowLayout();
        	   bottom.setLayout(fl);
        	   
        	   memberIDLabel = new JLabel("Member ID:");
        	   bottom.add(memberIDLabel);
        	   
        	   enterMemberID = new JTextField(5);
        	   bottom.add(enterMemberID);
        	   
        	   courseIDLabel = new JLabel("Course ID:");
        	   bottom.add(courseIDLabel);
        	   
        	   enterCourseID = new JTextField(10);
        	   bottom.add(enterCourseID);	 
        
        	   
        	   bookButton = new JButton("Book");
        	   bookButton.addActionListener(this);
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
        		   
        		   
        	   else if (e.getSource() == memberInfoButton)	{
        			   displayInfo.setText(" ");
        			   displayInfo.append(db.viewMemberInfo());
        		   	}
        		    
        	   else if (e.getSource() == bookButton)	{
        		   		displayInfo.setText(" ");
        		    	String memberID = enterMemberID.getText();
        		    	String courseID = enterCourseID.getText();
        		    	int bookingsCount = db.bookingCount(courseID);
        		    	int theCapacity = db.getMaxCapacity(courseID);
        		    	
        		    	if (bookingsCount >= theCapacity) {
        		    		
        		    		displayInfo.setText("Sorry, this class is fully booked.");
        		    	}
        		    	
        		    	else {
        		    	
        		    	int bookingNumber = generateBookingNumber(602, 1000);
        		    	String bookingResult = db.databaseInsert(bookingNumber, memberID, courseID);
        		    	displayInfo.setText(bookingResult);
        		    	}
        		    }   
        		    
        	   }
                	   
        		private int generateBookingNumber(int min, int max) {
        			
        			min = (int) Math.ceil(min);
        			max = (int )Math.floor(max);
        			return (int) (Math.floor(Math.random() * (max - min)) + min);
        			
        		}
}
        		   
        		   
        		   


          
