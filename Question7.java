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

public class Question7 {
	
    // Constructor Method
	public static boolean question7;
	
	Question7() {
		
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
        JLabel frame1 = new JLabel(new ImageIcon("images/question7.png"));
        frame1.setBounds(0, 0, 1280,800);
        mainPanel.add(frame1);
        
        // Create a JTextField
        JTextField methodName = new JTextField();
        methodName.setText("Enter the method header...");
        methodName.setColumns(20);
        methodName.setBounds(88,500, 1100,57);
        frame1.add(methodName);
        
        Icon enter = new ImageIcon("images/enter.png");
        JButton enterButton = new JButton(enter);
        enterButton.setBounds(580, 600, 120, 47);
        enterButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(enterButton);
        
        // Determine if user enters correct answer or not.
        enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(methodName.getText().equals("private static void seven()")){  
					question7 = true;
					System.out.println(question7);
					Question8 q8 = new Question8();
					frame.dispose();
		        }  
				else {
					question7 = false;
					System.out.println(question7);
					Question8 q8 = new Question8();
					frame.dispose();
				}

			}
        });

        frame.setVisible(true);
        
	}
}
