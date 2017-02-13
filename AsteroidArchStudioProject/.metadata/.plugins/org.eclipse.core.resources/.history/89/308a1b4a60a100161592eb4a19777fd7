package comp.Clock;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import edu.umkc.asteroid.archInterfaces.IClock;

import org.psnbtech.util.Clock;

public class ClockArch extends AbstractMyxSimpleBrick implements IClock
{
    public static final IMyxName msg_IClock = MyxUtils.createName("edu.umkc.asteroid.archInterfaces.IClock");


	private IClockImp _imp;

    public ClockArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IClockImp getImplementation(){
        try{
			return new ClockImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_IClock)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Clock
    public void setCyclesPerSecond (float cyclesPerSecond)   {
		_imp.setCyclesPerSecond(cyclesPerSecond);
    }    
    public void reset ()   {
		_imp.reset();
    }    
    public Clock create ()   {
		return _imp.create();
    }    
    public void update ()   {
		_imp.update();
    }    
    public void setPaused (boolean paused)   {
		_imp.setPaused(paused);
    }    
    public boolean isPaused ()   {
		return _imp.isPaused();
    }    
    public boolean hasElapsedCycle ()   {
		return _imp.hasElapsedCycle();
    }    
    public boolean peekElapsedCycle ()   {
		return _imp.peekElapsedCycle();
    }    
}