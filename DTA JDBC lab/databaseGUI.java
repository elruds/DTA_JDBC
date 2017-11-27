import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class databaseGUI extends JFrame implements ActionListener
{
	//instance variables are all the components 
			private JPanel top, topTop, bottom;
            private JLabel memberNameLabel,memberInfoLabel, memberIDLabel, courseLabel;
            private JComboBox<String> courseChooser, courseChooser2, dayChooser, timeChooser;
            private JTextField enterMemberName, enterMemberID;
            private JTextArea displayInfo;
            private JButton courseInfoButton, memberInfoButton, bookButton;
            
            
           public databaseGUI() {
        	   
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
       		setTitle("Gym Bookings");
       		setSize(1100,175);
       		setLocation(0,0);

       		//set layout
       		layoutComponents();        	   
           }
       
           
           private void layoutComponents() {
        	   
        	   top = new JPanel();
        	   top.setBackground(Color.gray);
        	   
//        	   topTop = new JPanel();
//        	   BorderLayout bl = new BorderLayout();
//        	   topTop.setLayout(bl);
        	   
        	   courseInfoButton = new JButton("View info on all courses");
        	   courseInfoButton.addActionListener(this);
        	   top.add(courseInfoButton);
        	   
        	   displayInfo = new JTextArea(5,50);
        	   displayInfo.setEditable(false);
        	   JScrollPane scrollPane = new JScrollPane(displayInfo);
        	   top.add(scrollPane);
       	           	   
        	   memberInfoLabel = new JLabel("View member info for:");
        	   top.add(memberInfoLabel);
        	   
        	   courseChooser = new JComboBox<String>();
        	   courseChooser.addItem("Yoga");
        	   courseChooser.addItem("Pilates");
        	   courseChooser.addItem("Swimming");
        	   courseChooser.addItem("Spinning");
        	   top.add(courseChooser);
        	   
        	   memberInfoButton = new JButton("View Member Info");
        	   memberInfoButton.addActionListener(this);
        	   top.add(memberInfoButton);
        	   
        	   bottom = new JPanel();
        	   FlowLayout fl = new FlowLayout();
        	   bottom.setLayout(fl);
        	   
        	   memberNameLabel = new JLabel("Member name:");
        	   bottom.add(memberNameLabel);
        	   
        	   enterMemberName = new JTextField(15);
        	   bottom.add(enterMemberName);
        	   
        	   memberIDLabel = new JLabel("Member ID:");
        	   bottom.add(memberIDLabel);
        	   
        	   enterMemberID = new JTextField(5);
        	   bottom.add(enterMemberID);
        	   
        	   courseLabel = new JLabel("Course:");
        	   bottom.add(courseLabel);
        	   
        	   courseChooser2 = new JComboBox<String>();
        	   courseChooser2.addItem("Yoga");
        	   courseChooser2.addItem("Pilates");
        	   courseChooser2.addItem("Swimming");
        	   courseChooser2.addItem("Spinning");
        	   bottom.add(courseChooser2);
        	   
        	   dayChooser = new JComboBox<String>();
        	   dayChooser.addItem("Monday");
        	   dayChooser.addItem("Tuesday");
        	   dayChooser.addItem("Wednesday");
        	   dayChooser.addItem("Thursday");
        	   dayChooser.addItem("Friday");
        	   bottom.add(dayChooser);
        	   
        	   timeChooser = new JComboBox<String>();
        	   timeChooser.addItem("8AM");
        	   timeChooser.addItem("9AM");
        	   timeChooser.addItem("10AM");
        	   timeChooser.addItem("11AM");
        	   timeChooser.addItem("12PM");
        	   timeChooser.addItem("1PM");
        	   timeChooser.addItem("2PM");
        	   timeChooser.addItem("3PM");
        	   timeChooser.addItem("4PM");
        	   bottom.add(timeChooser);
        	   
        	   
        	   bookButton = new JButton("Book");
        	   bottom.add(bookButton);
        	   
        	   add(top,BorderLayout.NORTH);
        	   add(bottom, BorderLayout.SOUTH);
        	   
           }
           
           public void actionPerformed(ActionEvent e) {
//        	   
//        	   
//        	   
//        	   if (e.getSource() == courseInfoButton);{      		   
//        		   displayInfo.append(dB.getAllCourses().toString());
//        		   
//        	   }

           
}
}