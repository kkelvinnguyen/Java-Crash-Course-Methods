///////////////////////////////////////////////
// Name: Kelvin Nguyen                       //
// Course Code: ICS 301                      //
// Date: June 14th                            //
// Purpose: Create a frame.                  //
///////////////////////////////////////////////

//-------------------------------------------//

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Question6 {
	
    // Constructor Method
	public static boolean question6;
	
	Question6() {
		
		// Create the main frame.
		JFrame frame = new JFrame("KelvinScript");
		frame.setSize(1280,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1280,800);
        mainPanel.setLayout(null);
        frame.add(mainPanel);
        
        // Create an image as a wallpaper.
        JLabel frame1 = new JLabel(new ImageIcon("images/question6.png"));
        frame1.setBounds(0, 0, 1280,800);
        mainPanel.add(frame1);
        
        JCheckBox o1 = new JCheckBox("Separately calling the method name itself.");
        JCheckBox o2 = new JCheckBox("Calling the class name and followed by the method.");
        JCheckBox o3 = new JCheckBox("Calling the first parameter within the brackets.");
        JCheckBox o4 = new JCheckBox("All of the above.");
        
        Icon enter = new ImageIcon("images/enter.png");
        JButton enterButton = new JButton(enter);
        enterButton.setBounds(600, 650, 120, 47);
        enterButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(enterButton);
        
        enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o1.isSelected() && o2.isSelected()){  
					question6 = true;
					Question7 q7 = new Question7();
					System.out.println(question6);
					frame.dispose();
		        }  
				else {
					question6 = false;
					System.out.println(question6);
					Question7 q7 = new Question7();
					frame.dispose();
				}

			}
        });
        
				
        o1.setBounds(500, 400, 400, 50); 
        o2.setBounds(500, 450, 400, 50);
        o3.setBounds(500, 500, 400, 50);
        o4.setBounds(500, 550, 400, 50);
        
        frame1.add(o1);
        frame1.add(o2);
        frame1.add(o3);
        frame1.add(o4);

        frame.setVisible(true);
        
	}
}