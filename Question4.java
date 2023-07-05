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

public class Question4 {
	
    // Constructor Method
	public static boolean question4;
	
	Question4() {
		
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
        JLabel frame1 = new JLabel(new ImageIcon("images/question4.png"));
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
				if(methodName.getText().equals("public static int calculateTotal()")){  
					question4 = true;
					System.out.println(question4);
					Question5 q5 = new Question5();
					frame.dispose();
		        }  
				else {
					question4 = false;
					System.out.println(question4);
					Question5 q5 = new Question5();
					frame.dispose();
				}

			}
        });

        frame.setVisible(true);
        
	}
}
