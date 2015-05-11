package com.jackfreako.coinflipGame;
import java.util.*;

public class Player {

	private String name;
	private String coinOption;
	
	private String [] coinFaceValue = {"HEAD","TAIL"};
	
	public Player(String mName){
		this.name = mName;
	}
	
	public String getCoinOption(){
		return this.coinOption;
	}
	
	public void setCoinOption(String mOpponentFlip){
		this.coinOption = (mOpponentFlip == coinFaceValue[1]) ? "HEAD" : "TAIL";
	}
	
	
	public void didPlayerWin(String winningFlip){
		
		if(this.coinOption == winningFlip){
			System.out.println(this.name + " won with a flip of " + this.coinOption);
		}
	
	}
	
	public String getRandCoinOption(){
		int randFaceValue = (Math.random() < 0.5) ? 0 : 1;
		return coinFaceValue[randFaceValue];
	}
}
