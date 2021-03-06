package comp.Game;

import org.psnbtech.Game;
import org.psnbtech.entity.Player;

public class GameImp implements IGameImp
{
	private GameArch _arch;
	Game game;

    public GameImp (){
    }

	public void setArch(GameArch arch){
		_arch = arch;
	}
	public GameArch getArch(){
		return _arch;
	}

	/*
	  Myx Lifecycle Methods: these methods are called automatically by the framework
	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
		System.out.println("rashmi initializing game");
		game=new Game();
	    //TODO Auto-generated method stub
		
		
	}
	public void begin(){
		//TODO Auto-generated method stub
		System.out.println("rashmi starting game");
		//game.player1=new Player();		
		//game.player1=_arch.OUT_IPlayer1.createPlayer();
		//game.player2=_arch.OUT_IPlayer2.createPlayer();
		//game.logicTimer=_arch.OUT_IClock.create();
		//game.player2=new Player();
		/*we will utilize all the architecture level interface in Game class*/
		game.setArchData(_arch);
		startGame();
		
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

  
  public void startGame ()   {
		//TODO Auto-generated method stub
  	game.startGame();
  			
  }
  
  public void killPlayer ()   {
		//TODO Auto-generated method stub  	
	 
  	if(game.getPlayer1().lives == 0 && game.getPlayer2().lives == 0) {
			game.isGameOver = true;
			game.restartCooldown = game.RESET_COOLDOWN_LIMIT;
			game.deathCooldown = Integer.MAX_VALUE;
		}else if(game.getPlayer1().lives==0 ||game.getPlayer2().lives==0){
			resetEntityLists();
		}
		else {
			game.deathCooldown = game.DEATH_COOLDOWN_LIMIT;
		}	
  	
		
  }
  
  public void resetGame ()   {
		//TODO Auto-generated method stub
  	game.resetGame();
		
  }

	@Override
	public void resetEntityLists() {
		// TODO Auto-generated method stub
            game.resetEntityLists();		
	}

	@Override
	public boolean areEnemiesDead() {
		// TODO Auto-generated method stub
		return game.areEnemiesDead();
	}

	
}