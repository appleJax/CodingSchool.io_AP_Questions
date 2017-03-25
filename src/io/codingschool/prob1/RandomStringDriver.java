package io.codingschool.prob1;

public class RandomStringDriver {

	public static void main(String[] args) {

		String[] stringList = {"hello", "world", "test", "another", "random", "string"};
		String string = "mathematics";
		
		RandomStringChooser stringChooser = new RandomStringChooser(stringList);
		RandomLetterChooser letterChooser = new RandomLetterChooser(string);
		
		for (int i = 0; i < 8; i++)
			System.out.print(stringChooser.getNext() + " ");
		
		System.out.println();
		
		for (int i = 0; i < 14; i++)
			System.out.print(letterChooser.getNext() + " ");
		
		String[] catLetters = RandomLetterChooser.getSingleLetters("cat");
		
		System.out.println();
		
		for (String letter : catLetters)
			System.out.print(letter + " ");
	}

}
