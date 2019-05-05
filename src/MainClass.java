package src;

import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.*;
import java.awt.*;

public class MainClass extends JComponent {
	
	public void paintComponent(Graphics g)
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image mainBG = tk.getImage("fedReserveImg.jpg");
		System.out.println("Hi: " + tk.getImage("fedReserveImg.jpg"));
		g.drawImage(mainBG, 10, 10, this);
	}

	public static void main(String[] args) {
		// Set up frame window attributes here first.
		JFrame frame = new JFrame("Aggregator Demo Test");
		frame.setSize(800, 800);
		frame.setBounds(0,0,800,800);
		frame.setLayout(null);
		final JLabel titleText = new JLabel("Welcome to the Account Interest Forecaster!");
		titleText.setBounds(250,50,400,20);
		
		frame.add(new JLabel(new ImageIcon("/Codefest2019_Account_Interest_Forecast_Aggregator/src/fedReserveImg.jpg")));
		
		
		// This text-area is hard-coded for demo instruction on adding asset-type account
		// interest-bearing data to the application.
		JTextArea tA = new JTextArea(50,250);
		tA.setText("First, add accounts and interest rules which are NOT associated with debts (ie, Savings, 401(k)s):");
		tA.setLineWrap(true);
		tA.setWrapStyleWord(true);
		tA.setEditable(false);
		tA.setFocusable(false);
		tA.setBackground(UIManager.getColor("assetGuide.background"));
		tA.setFont(UIManager.getFont("assetGuide.font"));
		tA.setBorder(UIManager.getBorder("assetGuide.border"));
		tA.setBounds(75,150,250,50);
		
		// Place tA-associated text-input and selections here...
		JTextField assetName = new JTextField("Enter Asset Name");
		assetName.setBounds(75,200,175,20);
		JTextField interestNum = new JTextField("Interest Rate");
		interestNum.setBounds(250,200,75,20);
		JButton enterAsset = new JButton("+");
		enterAsset.setBounds(75,225,50,50);
		
		// This text-area is hard-coded for demo instruction on adding liability-type 
		// account interest-bearing data to the application.
		JTextArea tA2 = new JTextArea(50,250);
		tA2.setText("Then, add accounts and interest rules which ARE associated with debts (ie, Student Loans, Credit Cards):");
		tA2.setLineWrap(true);
		tA2.setWrapStyleWord(true);
		tA2.setEditable(false);
		tA2.setFocusable(false);
		tA2.setBackground(UIManager.getColor("assetGuide.background"));
		tA2.setFont(UIManager.getFont("assetGuide.font"));
		tA2.setBorder(UIManager.getBorder("assetGuide.border"));
		tA2.setBounds(400,150,250,50);
		
		// Place tA2-associated text-input and selections here...
		JTextField liabilityName = new JTextField("Enter Liability Name");
		liabilityName.setBounds(400,200,175,20);
		JTextField interestNum2 = new JTextField("Interest Rate");
		interestNum2.setBounds(575,200,75,20);
		JButton enterLiability = new JButton("+");
		enterLiability.setBounds(400,225,50,50);
				
		frame.add(titleText);
		frame.add(tA);
		frame.add(assetName);
		frame.add(interestNum);
		frame.add(enterAsset);
		frame.add(tA2);
		frame.add(liabilityName);
		frame.add(interestNum2);
		frame.add(enterLiability);
		frame.setVisible(true);

	}

}
