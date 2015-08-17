package DotComGame;

import java.awt.GridLayout;
import java.util.Random;

import java112014.Border;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class dotCom extends JFrame {


	/**
	 * This class represents a Battleship game grid.
	 */
		
	    public static final int OUT_OF_BOUNDS = -1;

	    // values to be used in the 2D grid
	    public static final int EMPTY = 0;
	    public static final int DOTCOM = 1;
	    public static final int HIT = 2;
	    public static final int MISS = 3;

	    // directions used for shape placement
	    public static final int DIRECTION_RIGHT = 0;
	    public static final int DIRECTION_DOWN = 1;

	    // lengths of the various dotcoms in the game
	    public static final int SIMPLEDOTCOM_LENGTH = 3;
	    public static final int PETSDOTCOM_LENGTH= 3;
	    public static final int ASKMEDOTCOM_LENGTH = 3;

	    // array of all dotcom lengths
	    public static final int[] DOTCOM_LENGTHS =
	    {
	    	SIMPLEDOTCOM_LENGTH,
	    	PETSDOTCOM_LENGTH,
	        ASKMEDOTCOM_LENGTH,
	       
	    };

	    // the total number of hits required to destroy all dotcoms    
	    private static int totalHitsRequired;

	    // the number of rows and columns in this grid
	    public final int NUM_ROWS;
	    public final int NUM_COLS;

	    public int[][] grid;

	    // ::: DECLARE YOUR 2D ARRAY NAMED grid HERE



	    /**
	     * Creates a new BattleshipGrid instance and randomly places
	     * dotcoms on the grid.
	     *
	     * @param    numRows    the number of rows in this grid
	     * @param    numCols    the number of columns in this grid
	     */
	    public dotCom(int numRows, int numCols)
	    {
	        NUM_ROWS = numRows;
	        NUM_COLS = numCols;

	        // initialize the grid so all cells are EMPTY
	        initializeGrid();

	        // determine the total number of hits required to win
	        calculateTotalHitsRequired();

	        // randomly place all of the dotcoms on the grid
	        placeAlldotcoms();
	    }
	    
	    /**
	     * Initializes the game grid to size [NUM_ROWS][NUM_COLS]
	     * and sets each element of the grid to the constant EMPTY.
	     */
	    public void initializeGrid()
	    {
	        // ::: MAKE grid A 2D ARRAY OF THE APPROPRIATE DIMENSIONS AS
	        //     SPECIFIED IN THE METHOD DESCRIPTION. REMEMBER THAT YOU
	        //     HAVE ALREADY DECLARED grid AS AN INSTANCE VARIABLE AND
	        //     THAT YOU SHOULD NOT REDECLARE IT HERE.



	        // ::: INITIALIZE ALL ELEMENTS OF grid TO THE VALUE EMPTY



	    }

	    /**
	     * Calculates the total number of hits required to
	     * destroy all DOTCOM and win the game.
	     */
	    public static void calculateTotalHitsRequired()
	    {
	        totalHitsRequired = 0;
	        
	        // add all the dotcom lengths together to get
	        // the total number of hits required
	        for (int length : DOTCOM_LENGTHS)
	        {
	            totalHitsRequired += length;
	        }
	    }

	    /**
	     * Places all of the game's dotcom onto the grid.
	     */
	    public void placeAlldotcoms()
	    {
	        // ::: FILL IN THIS CODE
	    }



	    /**
	     * Attacks the grid cell at the specified row and column.
	     * If the grid cell contains:
	     *   - DOTCOM: the value of the cell is set to HIT
	     *   - HIT: the value of the cell does not change
	     * Otherwise, the value of the cell is set to MISS.
	     *
	     * This method returns true if the attack resulted in a dotcom being hit,
	     * and false otherwise.
	     *
	     * Note: this method also returns true if a cell that has already
	     * been hit is attacked.
	     *
	     * @param    row    the row of the cell to attack
	     * @param    col    the column of the cell to attack
	     *
	     * @return   true if the attack results in a dotcom being hit (even
	     *           if the dotcom at that cell has already been hit),
	     *           false otherwise
	     */
	    public boolean attack(int row, int col)
	    {
	        // ::: FILL IN THIS CODE

	        return false;
	    }



	    /**
	     * Returns true if all of the dotcoms have been destroyed, and
	     * false otherwise.
	     *
	     * @return   true if all dotcoms have been destroyed, false otherwise
	     */
	    public boolean allDestroyed()
	    {
	        // ::: FILL IN THIS CODE. NOTE THAT THERE IS A VARIABLE NAMED
	        //     totalHitsRequired THAT CONTAINS THE TOTAL NUMBER OF HITS
	        //     REQUIRED TO DESTROY ALL SHIPS

	        return false;
	    }



	    /**
	     * Determine if the cell at the specified row and column is in
	     * the grid's bounds.
	     *
	     * @param    row    the cell's row
	     * @param    col    the cell's column
	     *
	     * @return   true if the cell is in bounds, false otherwise
	     */
	    public boolean inBounds(int row, int col)
	    {
	        return ((row >= 0) && (row < NUM_ROWS) &&
	                (col >= 0) && (col < NUM_COLS));        
	    }

	    /**
	     * Returns the value of the cell at [row][col] if the cell is in
	     * bounds. Otherwise, returns OUT_OF_BOUNDS.
	     *
	     * @param    row    the cell's row
	     * @param    col    the cell's column
	     *
	     * @return   if in bounds, the value of the cell at [row][col],
	     *           otherwise OUT_OF_BOUNDS
	     */
	    public int getCell(int row, int col)
	    {
	   
			if (inBounds(row, col))
	            return grid[row][col];
	        else
	            return OUT_OF_BOUNDS;
	    }

	    public dotCom(){
	    	super ("dotCom");
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
	    	
	  //  public void printGrid();
	    
	    	public void setLookAndFeel(){
	    		try {
	    			UIManager.setLookAndFeel (
	    					"com.sun.java.plaf.nimbus.NimbusLookAndFeel"
	    					);
	    			SwingUtilities.updateComponentTreeUI0 (this);
	    		}catch (Exception exc) {
	    			System.err.println ("Couldn't use the system"
	    					+"look and feel: " + exc);
	    		}
	    	}
	    	//private void setLookAndFeel() ;
	    		//Border page 232
	    		public static void main(String[] args) {
	    			BattleShipTestOne frame = new BattleShipTestOne ();
	    			// ::: FILL IN THIS CODE
	    }
	}


