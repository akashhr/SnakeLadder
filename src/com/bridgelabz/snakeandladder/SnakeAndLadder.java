package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the snake and ladder game!!!!!!!!!!!!!");
		
		int startPositionA = 0;
		int diceNumber = 1 + (int) (Math.random() * 6);
		System.out.println(diceNumber);
		
		System.out.println(diceNumber);
		int checkPlay = (int) Math.floor(Math.random()*10)%3;
		System.out.println(checkPlay);

		switch(checkPlay) {
			case NO_PLAY: 
				break;

			case LADDER: 
				startPositionA += diceNumber;
				break;

			case SNAKE: 
				startPositionA -= diceNumber;
				break;
		}

		System.out.println(startPositionA);
		
		
	}
}
