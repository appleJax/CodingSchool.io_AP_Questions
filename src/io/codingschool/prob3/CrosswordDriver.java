package io.codingschool.prob3;

public class CrosswordDriver {

	public static void main(String[] args) {
		
		boolean[][] puzzleTemplate = {
			{true,  false, false, true,  true,  true,  false, false, false},
			{false, false, false, false, true,  false, false, false, false},
			{false, false, false, false, false, false, true,  true,  true },
			{false, false, true,  false, false, false, true,  false, false},
			{true,  true,  true,  false, false, false, false, false, false},
			{false, false, false, false, true,  false, false, false, false},
			{false, false, false, true,  true,  true,  false, false, true }
		};
		
		Crossword puzzle = new Crossword(puzzleTemplate);
		
		System.out.println(puzzle);
	}

}
