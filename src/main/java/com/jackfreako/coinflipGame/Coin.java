package com.jackfreako.coinflipGame;

public class Coin {

	
	private String coinOption;	
	private String [] coinFaceValue = {"HEAD", "TAIL"};
	
	public Coin(){
		int randFaceValue = (Math.random() < 0.5) ? 0 : 1;
		coinOption =  coinFaceValue[randFaceValue];
	}
	
	public String getCoinOption(){			
		return this.coinOption;
	}
}
