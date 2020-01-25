package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import diceQuestion.DiceEngineCode;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class DiceEngine {
	private DiceEngineCode RollIt;
	private JFrame frame;
	private JTextField textFieldQ;
	private JLabel lblQuestion;
	private JLabel lblAnswer;
	private JTextField textAns;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextArea textAreaLsQ;
	private JPanel panel1;
	private JLabel lblNewLabelPer;
	private WebDriver Driver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceEngine window = new DiceEngine();
					window.frame.setVisible(true);
					System.out.println("Window Visible");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiceEngine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 425, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ROLL IT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	JOptionPane.showMessageDialog(null, "150k");
				String AlsoPrint= null;
				try {
					RollIt = new DiceEngineCode() ;
					textAns.setText(RollIt.generateDice());
					String Total = Double.toString(RollIt.total/12);
					if((RollIt.total/12)>0.5) {
						AlsoPrint= "Yes";
					}else {
						AlsoPrint= "No";
					}
					
					textAreaLsQ.setText(textFieldQ.getText()+ "   "+ AlsoPrint);
					
					
					lblNewLabelPer.setText(Total);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "150k");
				}
				
				lblQuestion.setText("Another One?");
				
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
		btnNewButton.setBounds(287, 195, 115, 23);
		frame.getContentPane().add(btnNewButton);
		
		textFieldQ = new JTextField();
		textFieldQ.setForeground(new Color(255, 215, 0));
		textFieldQ.setBackground(new Color(0, 0, 0));
		textFieldQ.setBounds(9, 156, 393, 28);
		frame.getContentPane().add(textFieldQ);
		textFieldQ.setColumns(10);
		
		lblQuestion = new JLabel("QUESTION?");
		lblQuestion.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblQuestion.setBackground(new Color(0, 0, 0));
		lblQuestion.setForeground(new Color(32, 178, 170));
		lblQuestion.setBounds(9, 131, 148, 14);
		frame.getContentPane().add(lblQuestion);
		
		lblAnswer = new JLabel("Answer :");
		lblAnswer.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		lblAnswer.setBackground(new Color(0, 0, 0));
		lblAnswer.setForeground(new Color(34, 139, 34));
		lblAnswer.setBounds(10, 197, 74, 14);
		frame.getContentPane().add(lblAnswer);
		
		textAns = new JTextField();
		textAns.setForeground(new Color(0, 0, 0));
		textAns.setBounds(87, 195, 122, 25);
		frame.getContentPane().add(textAns);
		textAns.setColumns(10);
		
		JLabel label = new JLabel("H̩̃e͚̩̩͈̫͔͛̆͒ͩ̿̃l͖l̫̱͕ͣ̋͋ŏ̲̖̫̟̪̙̝̐̽ͭ̀̏̑,ͯ͋̈ ̻͕̮ͯ͑͋͂ͅTͫ͐hi̘̩̟̜̗̺͐͌̋͑ͭ̈s͔̦͚̝̳̭͓̀ͧ͊̀̐̓̓ ͖̤̻̼̰̥̪̏̆͒̾̽͛ͣis̮̖̹͋͌̾ ̟̖̹̯͈͎̖ͥ͊ͣ̅̈ͭ̐a R̫̺̮̯̳̙̽͐̎ͣ̋̎and̗̟̪̩̠̼ͮ̅͐̏͗̈́o̞̗͇̗͊͒̂̚m͖̻͕̠͇̺͚͒̀͌ͩ̏ͫ̄ ͤ̔ͫ̆Ḍ̗͚ͤͤ̍i̹̞͕̬̳̓̽̉̏ͩc̻̯ͅe ̳̹̮̀ͩ̌r̬͇ȍ̞̯̜̮͈̙͎̀̾͐̌ͧ̄l̪̙̣̦͔͖ͩ̌̊͒ͣ̈́͒ͅl̫͚͆́s̪̦̙̞̣̳͗̀̇ͪ̓̑");
		label.setFont(new Font("Tahoma", Font.PLAIN, 27));
		label.setBounds(10, 11, 395, 102);
		frame.getContentPane().add(label);
		
		lblNewLabel = new JLabel("T░h░e░r░e░ ░a░r░e░ ░3░6░ ░p░o░s░i░b░l░e░ ░v░a░l░u░e░s░.░");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(9, 113, 382, 23);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("ºO•❤•.¸✿¸.•❤•.( ͡° ͜ʖ﻿ ͡°) Each value has 1/36 chances.");
		lblNewLabel_1.setBounds(105, 133, 297, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbQuestionLast = new JLabel("Last Question***");
		lbQuestionLast.setForeground(new Color(0, 102, 255));
		lbQuestionLast.setBounds(10, 222, 95, 14);
		frame.getContentPane().add(lbQuestionLast);
		
		textAreaLsQ = new JTextArea();
		textAreaLsQ.setForeground(Color.GREEN);
		textAreaLsQ.setBackground(Color.BLACK);
		textAreaLsQ.setBounds(10, 236, 392, 22);
		frame.getContentPane().add(textAreaLsQ);
		
		lblNewLabelPer = new JLabel("0");
		lblNewLabelPer.setBounds(102, 222, 46, 14);
		frame.getContentPane().add(lblNewLabelPer);
		
		JButton btnNewButton_1 = new JButton("7|K!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String os = System.getProperty("os.name").toLowerCase();
			    //System.out.println(os);


				if(os.contains("mac")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver");
				}else if(os.contains("windows")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
				}

				Driver = new ChromeDriver();

					
					/*
					 * System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
					 * "//chromedriver.exe"); Driver = new ChromeDriver();
					 */
				Driver.get("https://github.com/Bigtiki");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Run it in the chromedriver folder.... $150k");
				}
				
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setBounds(287, 261, 108, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
