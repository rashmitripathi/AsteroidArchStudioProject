package comp.Game;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import edu.umkc.asteroid.archInterfaces.IClock;
import edu.umkc.asteroid.archInterfaces.IGame;
import edu.umkc.asteroid.archInterfaces.IPlayer1;
import edu.umkc.asteroid.archInterfaces.IPlayer2;

public class GameArch extends AbstractMyxSimpleBrick implements IGame
{
    public static final IMyxName msg_IPlayer1 = MyxUtils.createName("edu.umkc.asteroid.archInterfaces.IPlayer1");
    public static final IMyxName msg_IClock = MyxUtils.createName("edu.umkc.asteroid.archInterfaces.IClock");
    public static final IMyxName msg_IGame = MyxUtils.createName("edu.umkc.asteroid.archInterfaces.IGame");
    public static final IMyxName msg_IPlayer2 = MyxUtils.createName("edu.umkc.asteroid.archInterfaces.IPlayer2");

    public IPlayer1 OUT_IPlayer1;
    public IClock OUT_IClock;
    public IPlayer2 OUT_IPlayer2;

	private IGameImp _imp;

    public GameArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IGameImp getImplementation(){
        try{
			return new GameImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IPlayer1 = (IPlayer1) MyxUtils.getFirstRequiredServiceObject(this,msg_IPlayer1);
        if (OUT_IPlayer1 == null){
 			System.err.println("Error: Interface edu.umkc.asteroid.archInterfaces.IPlayer1 returned null");
			return;       
        }
        OUT_IClock = (IClock) MyxUtils.getFirstRequiredServiceObject(this,msg_IClock);
        if (OUT_IClock == null){
 			System.err.println("Error: Interface edu.umkc.asteroid.archInterfaces.IClock returned null");
			return;       
        }
        OUT_IPlayer2 = (IPlayer2) MyxUtils.getFirstRequiredServiceObject(this,msg_IPlayer2);
        if (OUT_IPlayer2 == null){
 			System.err.println("Error: Interface edu.umkc.asteroid.archInterfaces.IPlayer2 returned null");
			return;       
        }
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_IGame)){
			return this;
		}        
		return null;
	}
  
    
    public void startGame ()   {
		_imp.startGame();
    }    
    public void killPlayer ()   {
		_imp.killPlayer();
    }    
    public void resetGame ()   {
		_imp.resetGame();
    }    
    public void resetEntityLists ()   {
		_imp.resetEntityLists();
    }    
    public boolean areEnemiesDead ()   {
		return _imp.areEnemiesDead();
    }    
}