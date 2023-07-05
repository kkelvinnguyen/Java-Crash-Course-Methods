///////////////////////////////////////////////
// Name: Kelvin Nguyen                       //
// Course Code: ICS 301                      //
// Date: June 13th                            //
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

public class Question3 {
	
    // Constructor Method
	public static boolean question3;
	
	Question3() {
		
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
        JLabel frame1 = new JLabel(new ImageIcon("images/question3.png"));
        frame1.setBounds(0, 0, 1280,800);
        mainPanel.add(frame1);
        
        JCheckBox o1 = new JCheckBox("main() method");
        JCheckBox o2 = new JCheckBox("groceryList() method");
        JCheckBox o3 = new JCheckBox("housingPayments() method");
        
        Icon enter = new ImageIcon("images/enter.png");
        JButton enterButton = new JButton(enter);
        enterButton.setBounds(900, 600, 120, 47);
        enterButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(enterButton);
        
        // Determine if user enters correct answer or not.
        enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o3.isSelected()){  
					question3 = true;
					Question4 q4 = new Question4();
					System.out.println(question3);
					frame.dispose();
		        }  
				else {
					question3 = false;
					System.out.println(question3);
					Question4 q4 = new Question4();
					frame.dispose();
				}

			}
        });
        
				
        o1.setBounds(850, 300, 400, 50); 
        o2.setBounds(850, 350, 400, 50);
        o3.setBounds(850, 400, 400, 50);
        
        frame1.add(o1);
        frame1.add(o2);
        frame1.add(o3);

        
        frame.setVisible(true);
        
	}
}
