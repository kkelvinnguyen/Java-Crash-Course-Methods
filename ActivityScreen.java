///////////////////////////////////////////////
// Name: Kelvin Nguyen                       //
// Course Code: ICS 301                      //
// Date: June 11th                            //
// Purpose: Create a frame.                  //
///////////////////////////////////////////////

//-------------------------------------------//

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActivityScreen {
	
    JScrollPane scrollPane;
    public JLabel modifier = new JLabel();
    public JLabel returned = new JLabel();
	public JLabel theMethodName = new JLabel();
    public JLabel modifierInfo = new JLabel();
    public JLabel returnedInfo = new JLabel();
	public JLabel theMethodNameInfo = new JLabel();
	
    
    // Constructor Method
    ActivityScreen() {
    	
		// Create the layout of the frame.
		JFrame frame = new JFrame();
        
        JLabel background = new JLabel(new ImageIcon("images/frame7.png"));
        scrollPane = new JScrollPane(background);
        scrollPane.setBounds(0, 0, 1280, 875);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1280, 1569);
        panel.setLayout(null);
        
        panel.add(scrollPane);
        frame.add(panel);
        
        modifier.setForeground(Color.DARK_GRAY);
        modifier.setBounds(100,1015,400,100);
        modifier.setFont(new Font("Monospaced", Font.BOLD, 27));
        
        returned.setForeground(Color.BLUE);
	    returned.setBounds(350,1015,400,100);
	    returned.setFont(new Font("Monospaced", Font.BOLD, 27));
        
        theMethodName.setForeground(Color.DARK_GRAY);
        theMethodName.setBounds(480,1015,400,100);
        theMethodName.setFont(new Font("Monospaced", Font.BOLD, 27));
        
        modifierInfo.setForeground(Color.BLUE);
        modifierInfo.setBounds(100,1115,1200,100);
        modifierInfo.setFont(new Font("Monospaced", Font.BOLD, 15));
        
        returnedInfo.setForeground(Color.BLUE);
	    returnedInfo.setBounds(100,1215,400,100);
	    returnedInfo.setFont(new Font("Monospaced", Font.BOLD, 15));
        
        theMethodNameInfo.setForeground(Color.BLUE);
        theMethodNameInfo.setBounds(100,1315,800,100);
        theMethodNameInfo.setFont(new Font("Monospaced", Font.BOLD, 15));
        
        // Create a JTextField
        JTextField methodName = new JTextField();
        methodName.setText("Enter a method name...");
        methodName.setColumns(20);
        methodName.setBounds(75,845,1100,57);
        background.add(methodName);
	    
        // Create a button called "BACK."
        Icon back = new ImageIcon("images/back.png");
        JButton backButton = new JButton(back);
        backButton.setBounds(499, 1458, 127, 54);
        backButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(backButton);
        
        // If button is pressed, create a new frame.
        backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson5 les5 = new Lesson5();
				frame.dispose();
			}
        });
        
        // Create a button called "ENTER."
        Icon enter = new ImageIcon("images/enter.png");
        JButton enterButton = new JButton(enter);
        enterButton.setBounds(570, 952, 120, 47);
        enterButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(enterButton);
        
        // If button is pressed, create a new frame.
        enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theMethodName.setText(methodName.getText());
				theMethodNameInfo.setText(methodName.getText() + " is the name of the "
						+ "method.");
				
			}
        });
        
        // Create a button called "NEXT."
        Icon next = new ImageIcon("images/next.png");
        JButton nextButton = new JButton(next);
        nextButton.setBounds(674, 1458, 120, 54);
        nextButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(nextButton);
        
        // If button is pressed, create a new frame.
        nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Progress3 p3 = new Progress3();
				frame.dispose();
			}
        });
        
        // Create a button called "PUBLIC STATIC."
        Icon publicStatic = new ImageIcon("images/publicStatic.png");
        JButton publicStaticButton = new JButton(publicStatic);
        publicStaticButton.setBounds(72, 470, 248, 94);
        publicStaticButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(publicStaticButton);
        
        // If button is pressed, create a new frame.
        publicStaticButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String methodModifier = "public static";
		        System.out.println(methodModifier);
			    modifier.setText(methodModifier);
			    modifierInfo.setText("Public Static can be referenced in other classes"
			    		+ " and is not an instance of the class.");
			    
		        
			}
        });
        
        // Create a button called "PRIVATE STATIC."
        Icon privateStatic = new ImageIcon("images/privateStatic.png");
        JButton privateStaticButton = new JButton(privateStatic);
        privateStaticButton.setBounds(359, 470, 248, 94);
        privateStaticButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(privateStaticButton);
        
        // If button is pressed, create a new frame.
        privateStaticButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String methodModifier = "private static";
		        System.out.println(methodModifier);
			    modifier.setText(methodModifier);
			    modifierInfo.setText("Private Static cannot be referenced in other classes"
			    		+ " and is not an instance of the class.");
		        
			}
        });
        
        // Create a button called "PUBLIC."
        Icon publicc = new ImageIcon("images/public.png");
        JButton publicButton = new JButton(publicc);
        publicButton.setBounds(645, 470, 248, 94);
        publicButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(publicButton);
        
        // If button is pressed, create a new frame.
        publicButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String methodModifier = "public";
		        System.out.println(methodModifier);
			    modifier.setText(methodModifier);
			    modifierInfo.setText("Public can be referenced in other classes"
			    		+ " and is an instance of the class.");
			}
        });
        
        // Create a button called "PRIVATE."
        Icon privatee = new ImageIcon("images/private.png");
        JButton privateeButton = new JButton(privatee);
        privateeButton.setBounds(930, 470, 248, 94);
        privateeButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(privateeButton);
        
        // If button is pressed, create a new frame.
        privateeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String methodModifier = "private";
		        System.out.println(methodModifier);
			    modifier.setText(methodModifier);
			    modifierInfo.setText("Private cannot be referenced in other classes"
			    		+ " and is an instance of the class.");

			}
        });
       
        // Create a button called "VOID."
        Icon voidd = new ImageIcon("images/void.png");
        JButton voidButton = new JButton(voidd);
        voidButton.setBounds(72, 665, 248, 94);
        voidButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(voidButton);
        
        // If button is pressed, create a new frame.
        voidButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String returnType = "void";
		        System.out.println(returnType);
			    returned.setText(returnType);
			    returnedInfo.setText("This method will not return a value.");
			}
        });
        
        // Create a button called "INT."
        Icon intt = new ImageIcon("images/int.png");
        JButton intButton = new JButton(intt);
        intButton.setBounds(359, 665, 248, 94);
        intButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(intButton);
        
        // If button is pressed, create a new frame.
        intButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String returnType = "int";
		        System.out.println(returnType);
			    returned.setText(returnType);
			    returnedInfo.setText("This method will return an integer value.");
			}
        });
        
        // Create a button called "DOUBLE."
        Icon doublee = new ImageIcon("images/double.png");
        JButton doubleButton = new JButton(doublee);
        doubleButton.setBounds(645, 665, 248, 94);
        doubleButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(doubleButton);
        
        // If button is pressed, create a new frame.
        doubleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String returnType = "double";
		        System.out.println(returnType);
			    returned.setText(returnType);
			    returnedInfo.setText("This method will return a double value.");
			}
        });
        
        // Create a button called "BOOLEAN."
        Icon booleann = new ImageIcon("images/boolean.png");
        JButton booleanButton = new JButton(booleann);
        booleanButton.setBounds(930, 665, 248, 94);
        booleanButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(booleanButton);
        
        // If button is pressed, create a new frame.
        booleanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String returnType = "boolean";
		        System.out.println(returnType);
			    returned.setText(returnType);
			    returnedInfo.setText("This method will return a boolean value.");
			}
		
        });
        
        // Add elements to frame.
	    background.add(returned);
	    background.add(modifier);
		background.add(theMethodName);
		background.add(theMethodNameInfo);
	    background.add(returnedInfo);
	    background.add(modifierInfo);

		frame.setSize(1280, 1569);
        frame.setLayout(null);
     
        frame.setVisible(true);
	}
    
}
