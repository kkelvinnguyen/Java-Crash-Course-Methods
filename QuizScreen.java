///////////////////////////////////////////////
// Name: Kelvin Nguyen                       //
// Course Code: ICS 301                      //
// Date: June 12th                            //
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

public class QuizScreen {
    
    // Constructor Method
	QuizScreen() {
		
		// Create the main frame.
		JFrame frame = new JFrame("KelvinScript");
		frame.setSize(1280,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1280,600);
        mainPanel.setLayout(null);
        frame.add(mainPanel);
        
        // Create an image as a wallpaper.
        JLabel frame1 = new JLabel(new ImageIcon("images/frame8.png"));
        frame1.setBounds(0, 0, 1280,600);
        mainPanel.add(frame1);
        
        // Create a button called "BACK."
        Icon back = new ImageIcon("images/back.png");
        JButton button1 = new JButton(back);
        button1.setBounds(24, 470, 231, 54);
        button1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(button1);
        
        // If button is pressed, create a new frame.
        button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActivityScreen title = new ActivityScreen();
				frame.dispose();
			}
        });
        
        // Create a button called "START QUIZ."
        Icon startQuiz = new ImageIcon("images/startQuiz.png");
        JButton button2 = new JButton(startQuiz);
        button2.setBounds(245, 469, 207, 54);
        button2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(button2);
        
        // If button is pressed, create a new frame.
        button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question1 q1 = new Question1();
				frame.dispose();
			}
        });
        
        frame.setVisible(true);
        
	}
	
}

