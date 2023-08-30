/**************************************************************************************************
* CWUnit7Ch17.java
* Willie Conway
*
* This program displays a dialog box show a message and  a random
* chosen color. This random color is used as a background color of
* a JFrame window which appears after "OK" is selected. The window
* your name and thank yo for playing is relied once "Enter" is pressed.
* It utilizes showMessage Dialog to output the message. A random color
* should be outputed with each run upon clicking "OK." It creates a
* JFrame window that sets the background and label text color. It
* includes a label asking to enter name and a textfield to get input
* for name. Upon hitting hitting "Enter" on the Keyboary, it outputs
* thank you message to include the name entered and uses an inner class
* for the listner.
*************************************************************************************************/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import java.awt.Color;
// import java.awt.FlowLayout;
// import javax.swing.JFrame;java
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JTextField;
 import java.util.Random;
 //import java.util.concurrent.ThreadLocalRandom;

 public class CWUnit7Ch17 extends JFrame {

/**
 * @param args the command line arguments
 *
 */
  static Color labelColor;
  static JFrame myJframe=new JFrame("Color Changing Frame");
  static JLabel jUserName = new JLabel("Enter your name :");
  final static JTextField tf=new JTextField(20);
Color c;
 // to generate random number
 public static int rand()
 {
	 Random rand = new Random();
 int r=rand.nextInt(5); // displays we have 5 colors
 return r;
 }

private static void CWUnit7Ch17()
{
 JFrame frame = new JFrame("Message");
 int i=rand();
 String color;

 switch(i)
 {
 case 1:myJframe.getContentPane().setBackground(Color.YELLOW);
 jUserName.setForeground(Color.BLACK);
labelColor =Color.BLACK;
 color="YELLOW";
 break;
 case 2:myJframe.getContentPane().setBackground(Color.GREEN);
 jUserName.setForeground(Color.BLUE);
labelColor =Color.BLUE;
 color="GREEN";
 break;
 case 3:myJframe.getContentPane().setBackground(Color.RED);
 jUserName.setForeground(Color.WHITE);
labelColor =Color.WHITE;
 color="RED";
 break;
 case 4:myJframe.getContentPane().setBackground(Color.BLUE);
 jUserName.setForeground(Color.WHITE);
labelColor =Color.WHITE;
 color="BLUE";
 break;
 case 5:myJframe.getContentPane().setBackground(Color.WHITE);
 jUserName.setForeground(Color.BLACK);
labelColor =Color.BLACK;
 color="WHITE";
 break;
 default:myJframe.getContentPane().setBackground(Color.WHITE);
 jUserName.setForeground(Color.BLACK);
labelColor =Color.BLACK;
 color="WHITE";
 break;
 }
 JOptionPane.showMessageDialog(frame, "The Following window color will be randomly chosen from\n" +
		 	"Red, White, Yellow, Green, Blue\n\n" +"Your Color will be: " + color);
 myJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 myJframe.add(jUserName);
 myJframe.add(tf);
 myJframe.getContentPane().setLayout(new FlowLayout());
 myJframe.setBounds(50,50,550,150);
 myJframe.setVisible(true);
 tf.addActionListener(new CWUnit7Ch17().new Listener());
}
private class Listener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	 	{
		 String s=tf.getText();
		 myJframe.remove(jUserName);
		 myJframe.remove(tf);

		 final JLabel j = new JLabel("Thanks for playing "+s);
		 j.setForeground(labelColor);
		 myJframe.add(j);
		 myJframe.validate();
		 myJframe.repaint();
		 }
	 }



 public static void main(String[] args) {
 // TODO code application logic
 String s="asd";
 javax.swing.SwingUtilities.invokeLater(new Runnable() {
 @Override
 public void run() {
	 CWUnit7Ch17();

 }
 });
 } // end main

 } // end class CWUnit7Ch17
