package comp.Player2;


import org.psnbtech.entity.Player;

public class Player2Imp implements IPlayer2Imp
{
	private Player2Arch _arch;
	Player player2;

    public Player2Imp (){
    }

	public void setArch(Player2Arch arch){
		_arch = arch;
	}
	public Player2Arch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
		System.out.println("creating first player");		
		player2=new Player();
		player2.setArchData(_arch);
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
		return player2;
    }
    public void reset ()   {
		//TODO Auto-generated method stub
		
    }
    public void addScore (int score)   {
		//TODO Auto-generated method stub
		
    }
}