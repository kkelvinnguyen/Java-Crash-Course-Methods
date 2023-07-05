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

public class Question8 {
	
    // Constructor Method
	public static boolean question8;
	
	Question8() {
		
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
        JLabel frame1 = new JLabel(new ImageIcon("images/question8.png"));
        frame1.setBounds(0, 0, 1280,800);
        mainPanel.add(frame1);

        Icon truee = new ImageIcon("images/true.png");
        JButton trueButton = new JButton(truee);
        trueButton.setBounds(725, 500, 120, 54);
        trueButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(trueButton);
        
        Icon falsee = new ImageIcon("images/false.png");
        JButton falseButton = new JButton(falsee);
        falseButton.setBounds(475, 500, 120, 54);
        falseButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame1.add(falseButton);
        
        // Determine if user enters correct answer or not.
        falseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					question8 = true;
					System.out.println(question8);
					Question9 q9 = new Question9();
					frame.dispose();
		        }  
        });
        
        trueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					question8 = false;
					System.out.println(question8);
					Question9 q9 = new Question9();
					frame.dispose();
		        }  
	    });

        frame.setVisible(true);
        
	}
}
