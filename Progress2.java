import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Progress2 {
	    
	    // Constructor Method
		Progress2() {
			
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
	        JLabel frame1 = new JLabel(new ImageIcon("images/2:3.png"));
	        frame1.setBounds(0, 0, 1280,600);
	        mainPanel.add(frame1);
	        
	        Icon letsGo = new ImageIcon("images/next.png");
	        JButton button1 = new JButton(letsGo);
	        button1.setBounds(674, 200, 231, 54);
	        button1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	        frame1.add(button1);
	        
	        // If button is pressed, create a new frame.
	        button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ActivityScreen acti = new ActivityScreen();
					frame.dispose();
					
				}
	        });
	        
	        frame.setVisible(true);
		
	}
		
}
