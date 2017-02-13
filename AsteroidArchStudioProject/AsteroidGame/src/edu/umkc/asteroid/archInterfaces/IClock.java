package edu.umkc.asteroid.archInterfaces;

import org.psnbtech.util.Clock;

public interface IClock {

	public default void setCyclesPerSecond(float cyclesPerSecond) {
	}	
	
	public default void reset() {
	}
	
	public Clock create();
	
	public void update();	
	
	public void setPaused(boolean paused);
	
	public boolean isPaused(); 
	
	public default boolean hasElapsedCycle() {
		return false;
	}
	
	public default boolean peekElapsedCycle() {
		return false;
	}
	

}
