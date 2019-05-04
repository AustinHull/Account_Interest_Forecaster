package src;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Aggregator Demo Test");
		frame.setSize(800, 800);
		frame.setLayout(null);
		final JLabel titleText = new JLabel("Welcome to the Account Interest Forecaster!");
		titleText.setBounds(250,50,400,20);
		
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
		
		// Place tA-associated text-input and drop-down selectors here...
		JTextField assetName = new JTextField("Enter Asset Name");
		
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
		
		
				
		frame.add(titleText);
		frame.add(tA);
		frame.add(assetName);
		frame.add(tA2);
		frame.setVisible(true);

	}

}
