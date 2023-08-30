
/**************************************************************************************************
* CWUnit8Ch18.java
* Willie Conway
*
* This program displays a JFrame with 5 buttons. The buttons are
* are used to control the background color. The button's text is
* randomly chosen from 5 colors and the background color will change
* to the color shown on the button. It creates a JFrame window that
* displays 5 buttons showing 1 color each in a random order from the
* choices: Red, Blue, Yellow, Green, White and ensures that no color
* name is duplicated. The background color changes depending on which
* button was clicked and which color name was on the button.
*
*************************************************************************************************/


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class CWUnit8Ch18 {

	private JFrame frmColorChangingFrame;
	private ArrayList<String> colors;
	JButton btnColor1 = new JButton("Red");
	JButton btnColor2 = new JButton("Blue");
	JButton btnColor3 = new JButton("Yellow");
	JButton btnColor4 = new JButton("Green");
	JButton btnColor5 = new JButton("White");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CWUnit8Ch18 window = new CWUnit8Ch18();
					window.frmColorChangingFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CWUnit8Ch18() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColorChangingFrame = new JFrame();
		frmColorChangingFrame.setTitle("Color Changing Frame");
		frmColorChangingFrame.setBounds(100, 100, 637, 300);
		frmColorChangingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColorChangingFrame.getContentPane().setLayout(null);

		// color array
		colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.add("green");
		colors.add("white");

		btnColor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmColorChangingFrame.getContentPane().setBackground(getColorByName(btnColor1.getText()));
				randomizeButtons();
			}
		});
		btnColor1.setBounds(70, 11, 89, 23);
		frmColorChangingFrame.getContentPane().add(btnColor1);

		btnColor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmColorChangingFrame.getContentPane().setBackground(getColorByName(btnColor2.getText()));
				randomizeButtons();
			}
		});
		btnColor2.setBounds(169, 11, 89, 23);
		frmColorChangingFrame.getContentPane().add(btnColor2);

		btnColor3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmColorChangingFrame.getContentPane().setBackground(getColorByName(btnColor3.getText()));
				randomizeButtons();
			}
		});
		btnColor3.setBounds(268, 11, 89, 23);
		frmColorChangingFrame.getContentPane().add(btnColor3);

		btnColor4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmColorChangingFrame.getContentPane().setBackground(getColorByName(btnColor4.getText()));
				randomizeButtons();
			}
		});
		btnColor4.setBounds(367, 11, 89, 23);
		frmColorChangingFrame.getContentPane().add(btnColor4);

		btnColor5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmColorChangingFrame.getContentPane().setBackground(getColorByName(btnColor5.getText()));
				randomizeButtons();
			}
		});
		btnColor5.setBounds(466, 11, 89, 23);
		frmColorChangingFrame.getContentPane().add(btnColor5);
	}

	/***
	 * randomize the buttons
	 * */
	private void randomizeButtons() {
		Collections.shuffle(colors);
		btnColor1.setText(colors.get(0));
		btnColor2.setText(colors.get(1));
		btnColor3.setText(colors.get(2));
		btnColor4.setText(colors.get(3));
		btnColor5.setText(colors.get(4));
	}

	/**
	 * returns color object by name
	 * */
	private Color getColorByName(String color) {
		if(color.equalsIgnoreCase("red"))
			return Color.red;
		else if(color.equalsIgnoreCase("blue"))
			return Color.blue;
		else if(color.equalsIgnoreCase("yellow"))
			return Color.yellow;
		else if(color.equalsIgnoreCase("green"))
			return Color.green;
		else if(color.equalsIgnoreCase("white"))
			return Color.white;
		else
			return Color.gray;
	}
}
