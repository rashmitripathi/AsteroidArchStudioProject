package comp.Player1;


import comp.Player1.Player1Arch;

import org.psnbtech.entity.Player;

public interface IPlayer1Imp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (Player1Arch arch);
	public Player1Arch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
  
    //To be imported: Player
    public Player createPlayer ()  ;        
    public void reset ()  ;        
    public void addScore (int score)  ;        
}