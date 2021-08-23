package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	private static final int MAX_POSITION = 100;
	private static final int MIN_POSITION = 0;

	public static int positionofPlayerA = 0;
	public static int positionofPlayerB = 0;
	
	public static int turnofPlayerA() {
		System.out.println("Player A is Rolling Dice");
		int dice =  1 + (int) (Math.random() * 6);
		System.out.println("dice for A : "+dice);


		int checkPlay = (int) Math.floor(Math.random()*10)%3;
		System.out.println("checkplay for A : "+checkPlay);

		switch(checkPlay) {
			case NO_PLAY: 
				break;

			case LADDER: 
				positionofPlayerA += dice;
				if(positionofPlayerA > MAX_POSITION) {
					positionofPlayerA = positionofPlayerA-dice;
				}
				if(positionofPlayerA == MAX_POSITION) {
					return positionofPlayerA;
				}
				turnofPlayerA();
				break;

			case SNAKE: 
				positionofPlayerA -= dice;
				if(positionofPlayerA < MIN_POSITION ) {
					positionofPlayerA = 0;
				}
				break;
		}
		return positionofPlayerA;
	}

	public static int turnofPlayerB() {
		System.out.println("Player B is Rolling Dice");
		int dice =  1 + (int) (Math.random() * 6);
		System.out.println("dice for B : "+dice);


		int checkPlay = (int) Math.floor(Math.random()*10)%3;
		System.out.println("checkplay for B : "+checkPlay);

		switch(checkPlay) {
			case NO_PLAY: 
				break;

			case LADDER: 
				positionofPlayerB += dice;
				if(positionofPlayerB > MAX_POSITION) {
					positionofPlayerB = positionofPlayerB-dice;
				}
				if(positionofPlayerB == MAX_POSITION) {
					return positionofPlayerB;
				}
				turnofPlayerB();
				break;

			case SNAKE: 
				positionofPlayerB -= dice;
				if(positionofPlayerB < MIN_POSITION ) {
					positionofPlayerB = 0;
				}
				break;
		}
		return positionofPlayerB;
	}
	
	public static void main(String[] args) {
		System.out.println("---------- Welcome to the game of SNAKES AND LADDERS!! ----------");

		int positionOfA = 0, positionOfB = 0;
		while(positionOfA < MAX_POSITION || positionOfB < MAX_POSITION) {

			positionOfA = turnofPlayerA();
			if(positionOfA == MAX_POSITION) {
				System.out.println("Position of A : "+ positionOfA);
				System.out.println("Position of B : "+ positionOfB);
				System.out.println("--------PLAYER A WON !!-------");
				System.exit(0);
			}

			positionOfB = turnofPlayerB();
			if(positionOfB == MAX_POSITION) {
				System.out.println("Position of A : "+ positionOfA);
				System.out.println("Position of B : "+ positionOfB);
				System.out.println("--------PLAYER B WON !!--------");
				System.exit(0);
		
	}
}
