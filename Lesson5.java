///////////////////////////////////////////////
// Name: Kelvin Nguyen                       //
// Course Code: ICS 301                      //
// Date: June 6th                            //
// Purpose: Create a frame.                  //
///////////////////////////////////////////////

//-------------------------------------------//

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Lesson5 {
	
    JScrollPane scrollPane;
    
    // Constructor Method
	Lesson5() {
		
		// Create the layout of the frame.
		JFrame frame = new JFrame();
        
        JLabel background = new JLabel(new ImageIcon("images/frame6.png"));
        scrollPane = new JScrollPane(background);
        scrollPane.setBounds(0, 0, 1280, 875);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1280, 1294);
        panel.setLayout(null);
        
        panel.add(scrollPane);
        frame.add(panel);
        
        // Create a button called "BACK."
        Icon back = new ImageIcon("images/back.png");
        JButton backButton = new JButton(back);
        backButton.setBounds(497, 1180, 127, 54);
        backButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(backButton);
        
        // If button is pressed, create a new frame.
        backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson4 les4 = new Lesson4();
				frame.dispose();
			}
        });
        
        // Create a button called "NEXT."
        Icon next = new ImageIcon("images/next.png");
        JButton nextButton = new JButton(next);
        nextButton.setBounds(665, 1180, 120, 54);
        nextButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(nextButton);
        
        // If button is pressed, create a new frame.
        nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Progress2 p2 = new Progress2();
				frame.dispose();
			}
        });
        
		frame.setSize(1280, 1294);
        frame.setLayout(null);
     
        frame.setVisible(true);
	}
}
