package io.codingschool.prob3;

public class Square {
	
	private boolean isBlack;
	private int number;

	public Square(boolean isBlack, int number) {
		this.isBlack = isBlack;
		this.number = number;
	}
	
	public boolean isBlack() {
		return this.isBlack;
	}
	
	public int number() {
		return this.number;
	}
}
