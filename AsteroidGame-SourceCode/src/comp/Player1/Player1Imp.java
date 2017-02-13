package comp.Player1;


import org.psnbtech.entity.Player;

public class Player1Imp implements IPlayer1Imp
{
	private Player1Arch _arch;
	
	Player player1;

    public Player1Imp (){
    }

	public void setArch(Player1Arch arch){
		_arch = arch;
	}
	public Player1Arch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
		System.out.println("creating first player");		
		player1=new Player();
		player1.setArchData(_arch);
		
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
    //To be imported: Player
    public Player createPlayer ()   {
		//TODO Auto-generated method stub
		return player1;
    }
    public void reset ()   {
		//TODO Auto-generated method stub
		
    }
    public void addScore (int score)   {
		//TODO Auto-generated method stub
		
    }
}