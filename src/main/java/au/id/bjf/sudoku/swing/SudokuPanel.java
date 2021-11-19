package au.id.bjf.sudoku.swing;

import java.nio.charset.StandardCharsets;


/**
 * Implements a Sudoku puzzle grid
 */
public class SudokuPanel {

	private byte[] puzzle = null;

	/**
	 * Build a new SudokuPanel control from byte array
	 */
	public SudokuPanel(byte[] puzzle) {
		this.puzzle = puzzle;
	}
	
	/**
	 * Build a new SudokuPanel control from String. Empyty fields can be "0" or "."
	 */
	public SudokuPanel(String sudoku) {
		this.puzzle = new byte[sudoku.length()];
		byte convert[] = sudoku.getBytes();
		for (int i = 0; i < sudoku.length(); i++)	{
			if (convert[i] == '.')
				convert[i] = '0';
			this.puzzle[i] = (byte) (convert[i] - '0');
		}
	}
	
	

	/**
	 * @param puzzle the puzzle to set
	 */
	public void setPuzzle(byte[] puzzle) {
		this.puzzle = puzzle;
	}

	/**
	 * @return the puzzle as byte array
	 */
	public byte[] getPuzzle() {
		return puzzle;
	}
	
	/**
	 * @return the puzzle as String
	 */
	public String toString() {
		byte convert[] = new byte[puzzle.length];
		
		for (int i=0; i < puzzle.length; i++)	{
			convert[i] = (byte) (puzzle[i] + '0');
			if(convert[i] == '0')
				convert[i] = '.';
		}
		String resultString = new String(convert, StandardCharsets.UTF_8);
		return(resultString);
	}
	
	
}
