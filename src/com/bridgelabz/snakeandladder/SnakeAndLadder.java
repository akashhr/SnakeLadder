package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	private static final int MAX_POSITION = 100;
	private static final int MIN_POSITION = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the snake and ladder game!!!!!!!!!!!!!");
		
		int positionA = 0;
		
		if(positionA < MAX_POSITION) {
			int diceNumber = 1 + (int) (Math.random() * 6);
			System.out.println(diceNumber);
			
			System.out.println(diceNumber);
			int checkPlay = (int) Math.floor(Math.random()*10)%3;
			System.out.println(checkPlay);

			switch(checkPlay) {
				case NO_PLAY: 
					break;

				case LADDER: 
					positionA += diceNumber;
					if(positionA > MAX_POSITION) {
						positionA = positionA - diceNumber;
					}
					break;

				case SNAKE: 
					positionA -= diceNumber;
					if(positionA < MIN_POSITION )
						positionA = 0;
					break;
		     }
		}

		System.out.println(positionA);
		
		
	}
}
