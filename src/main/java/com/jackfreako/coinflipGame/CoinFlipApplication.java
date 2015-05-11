package com.jackfreako.coinflipGame;

import java.util.Scanner;

public class CoinFlipApplication {

	
	public static void main(String [] args){
	
		CoinGame coinGame = new CoinGame("Yared","Semu");
		String playAgain = null;
		
		do{
			
		
			coinGame.startGame();
									
			//Put here a mechanism to ask the user to play again.			
			System.out.println("Do you want to play again?");
			Scanner playGameAgain = new Scanner(System.in);
			playAgain = playGameAgain.nextLine();
			
		}while(playAgain.startsWith("Y") || playAgain.startsWith("y"));
	}
	
}
