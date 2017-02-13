package edu.umkc.asteroid.archInterfaces;

import org.psnbtech.entity.Player;

public interface IPlayer1 {
	
public int lives=0;
	
	public int score=0;	
	
	public Player createPlayer();
	
	public void reset();
	
	public void addScore(int score);

}
