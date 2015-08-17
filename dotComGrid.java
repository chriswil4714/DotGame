package DotComGame;

import  java.awt.*;
import  java.awt.event.*;
import  javax.swing.*;


public class dotComGrid extends JFrame {

public dotComGrid(){
	super ("dotComGrid");
	setSize (460, 460);
	setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	setLookAndFeel ();
	JPanel pane = new JPanel ();
	GridLayout family = new GridLayout (7, 7, 7, 7);
	pane.setLayout (family);
	JButton a0 = new JButton ("A0");
	JButton a1 = new JButton ("A1");
	JButton a2 = new JButton ("A2");
	JButton a3 = new JButton ("A3");
	JButton a4 = new JButton ("A4");
	JButton a5 = new JButton ("A5");
	JButton a6 = new JButton ("A6");
	JButton b0 = new JButton ("B0");
	JButton b1 = new JButton ("B1");
	JButton b2 = new JButton ("B2");
	JButton b3 = new JButton ("B3");
	JButton b4 = new JButton ("B4");
	JButton b5 = new JButton ("B5");
	JButton b6 = new JButton ("B6");
	JButton c0 = new JButton ("C0");
	JButton c1 = new JButton ("C1");
	JButton c2 = new JButton ("C2");
	JButton c3 = new JButton ("C3");
	JButton c4 = new JButton ("C4");
	JButton c5 = new JButton ("C5");
	JButton c6 = new JButton ("C6");
	JButton d0 = new JButton ("D0");
	JButton d1 = new JButton ("D1");
	JButton d2 = new JButton ("D2");
	JButton d3 = new JButton ("D3");
	JButton d4 = new JButton ("D4");
	JButton d5 = new JButton ("D5");
	JButton d6 = new JButton ("D6");
	JButton e0 = new JButton ("E0");
	JButton e1 = new JButton ("E1");
	JButton e2 = new JButton ("E2");
	JButton e3 = new JButton ("E3");
	JButton e4 = new JButton ("E4");
	JButton e5 = new JButton ("E5");
	JButton e6 = new JButton ("E6");
	JButton f0 = new JButton ("F0");
	JButton f1 = new JButton ("F1");
	JButton f2 = new JButton ("F2");
	JButton f3 = new JButton ("F3");
	JButton f4 = new JButton ("F4");
	JButton f5 = new JButton ("F5");
	JButton f6 = new JButton ("F6");
	JButton g0 = new JButton ("G0");
	JButton g1 = new JButton ("G1");
	JButton g2 = new JButton ("G2");
	JButton g3 = new JButton ("G3");
	JButton g4 = new JButton ("G4");
	JButton g5 = new JButton ("G5");
	JButton g6 = new JButton ("G6");
	
	pane.add (a0);
	pane.add (a1);
	pane.add (a2);
	pane.add (a3);
	pane.add (a4);
	pane.add (a5);
	pane.add (a6);
	pane.add (b0);
	pane.add (b1);
	pane.add (b2);
	pane.add (b3);
	pane.add (b4);
	pane.add (b5);
	pane.add (b6);
	pane.add (c0);
	pane.add (c1);
	pane.add (c2);
	pane.add (c3);
	pane.add (c4);
	pane.add (c5);
	pane.add (c6);
	pane.add (d0);
	pane.add (d1);
	pane.add (d2);
	pane.add (d3);
	pane.add (d4);
	pane.add (d5);
	pane.add (d6);
	pane.add (e0);
	pane.add (e1);
	pane.add (e2);
	pane.add (e3);
	pane.add (e4);
	pane.add (e5);
	pane.add (e6);
	pane.add (f0);
	pane.add (f1);
	pane.add (f2);
	pane.add (f3);
	pane.add (f4);
	pane.add (f5);
	pane.add (f6);
	pane.add (g0);
	pane.add (g1);
	pane.add (g2);
	pane.add (g3);
	pane.add (g4);
	pane.add (g5);
	pane.add (g6);
	add (pane);
	setVisible (true);
}
	private void setLookAndFeel (){
		try{
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
		SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception exc){
			System.err.println ("Couldn't use the system"
					+ "look and feel" + exc);
		}
	}
	
		public static void main(String[] args) {
		// java workbook page 230
			dotComGrid frame = new dotComGrid ();

	}

}
