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

public class Lesson1 {
	
    JScrollPane scrollPane;
    
    // Constructor Method
	Lesson1() {
		
		// Create the layout of the frame.
		JFrame frame = new JFrame();
        
        JLabel background = new JLabel(new ImageIcon("images/frame2.png"));
        scrollPane = new JScrollPane(background);
        scrollPane.setBounds(0, 0, 1280, 875);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1280, 1375);
        panel.setLayout(null);
        
        panel.add(scrollPane);
        frame.add(panel);
        
        // Create a button called "HOME."
        Icon home = new ImageIcon("images/home.png");
        JButton homeButton = new JButton(home);
        homeButton.setBounds(460, 1265, 127, 54);
        homeButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(homeButton);
        
        // If button is pressed, create a new frame.
        homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TitleScreen title = new TitleScreen();
				frame.dispose();
			}
        });
        
        // Create a button called "NEXT PAGE."
        Icon next = new ImageIcon("images/nextpage.png");
        JButton nextButton = new JButton(next);
        nextButton.setBounds(614, 1265, 207, 54);
        nextButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        background.add(nextButton);
        
        // If button is pressed, create a new frame.
        nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson2 les2 = new Lesson2();
				frame.dispose();
			}
        });
        
		frame.setSize(1280, 1375);
        frame.setLayout(null);
     
        frame.setVisible(true);
	}
}
