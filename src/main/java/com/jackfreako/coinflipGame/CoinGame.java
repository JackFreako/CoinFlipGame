package com.jackfreako.coinflipGame;
import java.util.*;

public class CoinGame {

	
	private Player [] players = new Player[2];
	private Coin theCoin = new Coin();
	
	
	public CoinGame (String playerOneName, String playerTwoName){
				
		players[0] = new Player(playerOneName);
		players[1] = new Player(playerTwoName);
		
	}
	
	public void startGame(){
		
		
			int randPlayer = (Math.random() < 0.5) ? 0 : 1;
				
			String playersPick = players[randPlayer].getRandCoinOption();
			
			int opponenetIndex = (randPlayer == 0) ? 1 : 0;			
			players[opponenetIndex].setCoinOption(playersPick);
			
			
			String winningFlip = theCoin.getCoinOption();
			
			players[1].didPlayerWin(winningFlip);
			players[0].didPlayerWin(winningFlip);
			
		
		}
		
		
	
	
}
