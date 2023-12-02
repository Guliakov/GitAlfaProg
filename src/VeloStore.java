import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;

public class VeloStore {

	    // Declare all calculator's components.
		JPanel windowContent;
		private JTextField displayField;
		JButton button0;
		JButton button1;
		JButton button2;
		JButton button3;
		JButton button4;
		JButton button5;
		JButton button6;
		JButton button7;
		JButton button8;
		JButton button9;
		JButton buttonPoint;
		JButton buttonEqual;
		JPanel p1;

	    public void setDisplayValue(String val){
	        displayField.setText(val);
	    }

	    public String getDisplayValue() {
	        return displayField.getText();
	    } 

		
		
		
	      // Constructor  creates the components
	      // and adds the to the frame using combination of 
	      // Borderlayout and Gridlayout

	  VeloStore(){

		  windowContent = new JPanel();

		 // Set the layout manager for this panel
		  BorderLayout bl = new BorderLayout(); 
	         windowContent.setLayout(bl);

	       // Create the display field and place it in the   
	       // North area of the window

		  displayField = new JTextField(30);
		  windowContent.add("North",displayField);
		  
		  displayField = new JTextField(20);
		  windowContent.add("South",displayField);
		  
		 // displayField = new JTextField(20);
		  //windowContent.add("East",displayField);
		  
	     // Create buttons using constructor of the  
	     // class JButton that takes the label of the 
	     // button as a parameter 

		  button0=new JButton("0");
		  button1=new JButton("1");
		  button2=new JButton("2");
		  button3=new JButton("3");
		  button4=new JButton("4");
		  button5=new JButton("5");
		  button6=new JButton("6");
	         button7=new JButton("7");
	         button8=new JButton("8");
		  button9=new JButton("9");
		  buttonPoint = new JButton(".");
		  buttonEqual=new JButton("=");

		 // Create the panel with the GridLayout with 12 buttons � 
	        //10 numeric ones, period, and the equal sign   

			  p1 = new JPanel();
			  GridLayout gl =new GridLayout(4,3); 
			  p1.setLayout(gl);

		 //  Add window controls to the panel p1
			  p1.add(button1);
			  p1.add(button2);
			  p1.add(button3);
			  p1.add(button4);
			  p1.add(button5);
			  p1.add(button6);
			  p1.add(button7);
			  p1.add(button8);
			  p1.add(button9);
			  p1.add(button0);
			  p1.add(buttonPoint);
			  p1.add(buttonEqual);
			  
			  
			  VeloStoreEngine vSE = new VeloStoreEngine(this);
			  button0.addActionListener(vSE);
			  button1.addActionListener(vSE);
			  button2.addActionListener(vSE);
			  button3.addActionListener(vSE);
			  button4.addActionListener(vSE);
			  button5.addActionListener(vSE);
			  button6.addActionListener(vSE);
			  button7.addActionListener(vSE);
			  button8.addActionListener(vSE);
			  button9.addActionListener(vSE);
			  buttonPoint.addActionListener(vSE);
			  buttonEqual.addActionListener(vSE);
			  

		// Add the panel p1 to the center of the window				          
	               windowContent.add("Center",p1);

		//Create the frame and set its content pane	               
			JFrame frame = new JFrame("VeloStore");
		       frame.setContentPane(windowContent);

		 // Set the size of the window to be big enough to accommodate all controls 		
		       frame.pack(); 

			 // Display the window
			  frame.setVisible(true);
	     
			 
	  }


	     public static void main(String[] args) {

		  new VeloStore();
	     
	     }
	}
