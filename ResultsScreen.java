
///////////////////////////////////////////////
//Name: Kelvin Nguyen                       //
//Course Code: ICS 301                      //
//Date: June 13th                            //
//Purpose: Create a frame.                  //
///////////////////////////////////////////////

//-------------------------------------------//

import java.awt.Color;
import java.awt.Font;
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

public class ResultsScreen {

	// Constructor Method
	public int total = 0;
	
	ResultsScreen() {
	
		// Create the main frame.
		JFrame frame = new JFrame("KelvinScript");
		frame.setSize(1280,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.WHITE);
		frame.setLayout(null);
		
        // Create an image as a wallpaper.
        JLabel frame1 = new JLabel(new ImageIcon("images/youScored.png"));
        frame1.setBounds(0, 0, 1280,800);
        frame.add(frame1);

        // Allow users to see what questions they got wrong.
		JLabel q1 = new JLabel("Question 1");
		JLabel q2 = new JLabel("Question 2");
		JLabel q3 = new JLabel("Question 3");
		JLabel q4 = new JLabel("Question 4");
		JLabel q5 = new JLabel("Question 5");
		JLabel q6 = new JLabel("Question 6");
		JLabel q7 = new JLabel("Question 7");
		JLabel q8 = new JLabel("Question 8");
		JLabel q9 = new JLabel("Question 9");
		JLabel q10 = new JLabel("Question 10");
		
		q1.setBounds(1000, 100, 1000, 100);
		q2.setBounds(1000, 150, 1000, 100);
		q3.setBounds(1000, 200, 1000, 100);
		q4.setBounds(1000, 250, 1000, 100);
		q5.setBounds(1000, 300, 1000, 100);
		q6.setBounds(1000, 350, 1000, 100);
		q7.setBounds(1000, 400, 1000, 100);
		q8.setBounds(1000, 450, 1000, 100);
		q9.setBounds(1000, 500, 1000, 100);
		q10.setBounds(1000, 550, 1000, 100);
		
        frame1.add(q1);
        frame1.add(q2);
        frame1.add(q3);
        frame1.add(q4);
        frame1.add(q5);
        frame1.add(q6);
        frame1.add(q7);
        frame1.add(q8);
        frame1.add(q9);
        frame1.add(q10);
        
		// Initially set the answer to "red" or wrong.
        q1.setForeground(Color.RED);
        q1.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q2.setForeground(Color.RED);
        q2.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q3.setForeground(Color.RED);
        q3.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q4.setForeground(Color.RED);
        q4.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q5.setForeground(Color.RED);
        q5.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q6.setForeground(Color.RED);
        q6.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q7.setForeground(Color.RED);
        q7.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q8.setForeground(Color.RED);
        q8.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q9.setForeground(Color.RED);
        q9.setFont(new Font("Monospaced", Font.BOLD, 25));
        
        q10.setForeground(Color.RED);
        q10.setFont(new Font("Monospaced", Font.BOLD, 25));
		
        // Determine how many questions the user answered correctly. 
		if (Question1.question1 == true) {
			total++;
	        q1.setForeground(Color.GREEN);
		}
		
		if (Question2.question2 == true) {
			total++;
	        q2.setForeground(Color.GREEN);
		}
		
		if (Question3.question3 == true) {
			total++;
	        q3.setForeground(Color.GREEN);
		}
		
		if (Question4.question4 == true) {
			total++;
	        q4.setForeground(Color.GREEN);
		}
		
		if (Question5.question5 == true) {
			total++;
	        q5.setForeground(Color.GREEN);
		}
		
		if (Question6.question6 == true) {
			total++;
	        q6.setForeground(Color.GREEN);
		}
		
		if (Question7.question7 == true) {
			total++;
	        q7.setForeground(Color.GREEN);
		}
		
		if (Question8.question8 == true) {
			total++;
	        q8.setForeground(Color.GREEN);
		}
		
		if (Question9.question9 == true) {
			total++;
	        q9.setForeground(Color.GREEN);
		}
		
		if (Question10.question10 == true) {
			total++;
	        q10.setForeground(Color.GREEN);
		}
	
        JLabel score = new JLabel(Integer.toString(total) + "/10");
        score.setFont(new Font("Arial", Font.BOLD, 60));
        score.setForeground(Color.BLUE);
        score.setBounds(430,150, 1000, 500);
        frame1.add(score);
        
        // Create a button called "NEXT."
        Icon next = new ImageIcon("images/next.png");
        JButton nextButton = new JButton(next);
        nextButton.setBounds(425, 500, 120, 54);
        nextButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(nextButton);
        
        // If button is pressed, create a new frame.
        nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompleteScreen outro = new CompleteScreen();
				frame.dispose();
	        }  
    });
        
		frame.setVisible(true);
		}
	}
