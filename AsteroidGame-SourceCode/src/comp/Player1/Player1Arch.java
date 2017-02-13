package comp.Player1;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import edu.umkc.asteroid.archInterfaces.IGame;
import edu.umkc.asteroid.archInterfaces.IPlayer1;

import org.psnbtech.entity.Player;

public class Player1Arch extends AbstractMyxSimpleBrick implements IPlayer1
{
    public static final IMyxName msg_IPlayer1 = MyxUtils.createName("edu.umkc.asteroid.archInterfaces.IPlayer1");
    public static final IMyxName msg_IGame = MyxUtils.createName("edu.umkc.asteroid.archInterfaces.IGame");

    public IGame OUT_IGame;

	private IPlayer1Imp _imp;

    public Player1Arch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IPlayer1Imp getImplementation(){
        try{
			return new Player1Imp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IGame = (IGame) MyxUtils.getFirstRequiredServiceObject(this,msg_IGame);
        if (OUT_IGame == null){
 			System.err.println("Error: Interface edu.umkc.asteroid.archInterfaces.IGame returned null");
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
		if (arg0.equals(msg_IPlayer1)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Player
    public Player createPlayer ()   {
		return _imp.createPlayer();
    }    
    public void reset ()   {
		_imp.reset();
    }    
    public void addScore (int score)   {
		_imp.addScore(score);
    }    
}