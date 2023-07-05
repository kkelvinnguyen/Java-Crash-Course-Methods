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

public class CompleteScreen {
	
	CompleteScreen() {
		
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
        JLabel frame1 = new JLabel(new ImageIcon("images/complete.png"));
        frame1.setBounds(0, 0, 1280,902);
        mainPanel.add(frame1);
        
        Icon truee = new ImageIcon("images/letmego.png");
        JButton trueButton = new JButton(truee);
        trueButton.setBounds(554, 680, 193, 54);
        trueButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(trueButton);
        
        // if user press button, close the entire application.
        trueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.dispose();
	        }  
    });
        
        frame.setVisible(true);
        
	
	}
}
