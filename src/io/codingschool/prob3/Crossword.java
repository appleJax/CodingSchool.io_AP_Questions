package io.codingschool.prob3;

public class Crossword {

	private int label = 0;
	private Square[][] puzzle;
	
	public Crossword(boolean[][] blackSquares) {
		int height = blackSquares.length;
		int width = blackSquares[0].length;

		this.puzzle = new Square[height][width];
		
		for (int row = 0; row < height; row++)
			for (int column = 0; column < width; column++) {
				if (blackSquares[row][column]) {
					this.puzzle[row][column] = new Square(true, 0);

				} else {
					int number = toBeLabeled(row, column, blackSquares)
						? ++this.label
						: 0;

					this.puzzle[row][column] = new Square(false, number);
				}
			}
	}
	
	private boolean toBeLabeled(int row, int column, boolean[][] blackSquares) {
		return row == 0 
			|| column == 0
			|| blackSquares[row - 1][column]
			|| blackSquares[row][column - 1];
	}
	
	public String toString() {
		String puzzleAsString = "";
		
		for (int row = 0; row < this.puzzle.length; row++) {
			for (Square square : this.puzzle[row]) {
				if (square.isBlack()) {
					puzzleAsString += "--  ";

				} else {
					int number = square.number();
					String space = (number < 10 && number != 0)
						? "   "
						: "  ";

					puzzleAsString += (number > 0)
						? number + space
						: "[]"   + space;
				}
			}
			
			puzzleAsString += "\n\n";
		}
		
		return puzzleAsString;
	}
}
