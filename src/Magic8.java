import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class Magic8 extends JFrame{
	private JLabel message = new JLabel();
	private Font bottomFont = new Font("Times New Roman", Font.BOLD, 50);
	public Magic8(){
		initGUI();
		setTitle("Magic 8 Ball Game     Creator Erica Davis");
		setSize(200, 100); //pixels
		setResizable(true);
		pack();
		setLocationRelativeTo(null); //centers on screen, do this after packing but before visible

			
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initGUI() {
		// TODO Auto-generated method stub
		//title panel
				JPanel titlePanel = new JPanel();
				add(titlePanel, BorderLayout.PAGE_START);
				titlePanel.setBackground(Color.BLACK);
				JLabel titleLabel = new JLabel("Shake for your fortune: ");
				titlePanel.add(titleLabel);
				titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
				Font titleFont = new Font("Times New Roman", Font.BOLD, 50);
				titleLabel.setForeground(new Color(83, 22, 226));
				titleLabel.setFont(titleFont);
				
				//center panel
				JPanel centerPanel = new JPanel();
				add(centerPanel, BorderLayout.CENTER);
				centerPanel.setBackground(Color.BLACK);

				
				//bottom panel
				JPanel bottomPanel = new JPanel();
				add(bottomPanel, BorderLayout.PAGE_END);
				bottomPanel.setBackground(Color.BLACK);
				generateMessage();
				bottomPanel.add(message);
				message.setHorizontalAlignment(JLabel.CENTER); //left or right
				message.setForeground(Color.BLACK);
				message.setFont(bottomFont);
				
				//button
				Font buttonFont = new Font("Times New Roman", Font.BOLD, 25);
				
				JButton shake = new JButton("shake");
				shake.setFont(buttonFont);;
				shake.setBackground(Color.WHITE);
				
				shake.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// this is the only thing that will change between buttons
						theShake();
					}
				});
				
				centerPanel.add(shake);
	}
	public void theShake() {
		generateMessage();
	}

	public void generateMessage() {
		message.setForeground(Color.WHITE);
		message.setFont(bottomFont);
		int shakeNum = (int)(Math.random() * 8) +1;
		if (shakeNum ==1) {
			message.setText("Not looking good for you");
		}
		else if (shakeNum ==2) {
			message.setText("Concentrate and ask again");
		}
		else if (shakeNum ==3) {
			message.setText("It is certain");
		}
		else if (shakeNum ==4) {
			message.setText("Without a doubt");
		}
		else if (shakeNum ==5) {
			message.setText("My sources say no");
		}
		else if (shakeNum ==6) {
			message.setText("Most likely");
		}
		else if (shakeNum ==7) {
			message.setText("My reply is Yes");
		}
		else{
			message.setText("You may be disapointed");
			}
	}
			
	

	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new Magic8();
            }   
        });
        
	}
}
