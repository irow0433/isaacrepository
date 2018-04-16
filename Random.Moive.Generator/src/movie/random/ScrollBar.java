package movie.random;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ScrollBar extends JFrame { //class created
	
	public static void main(String ags[])  //main method
	{
		
		JFrame f = new JFrame();   //frame created
		f.setVisible(true);
		
		f.setBounds(0, 0, 1000, 1000);
		f.setTitle("Adding ScrollBar");   //name of the frame
		
		JPanel co = new JPanel();  //panel created
		co.setLayout(null);		//Layout of panel defualtlayout
		
		//Adds ScrollPanel
		JScrollPane sp = new JScrollPane(co,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		co.setPreferredSize(new Dimension(100, 1850)); 		//Dimensino of scrollbar
	
		f.getContentPane().add(sp);
	}

}
