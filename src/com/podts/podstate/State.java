package com.podts.podstate;

public interface State {
	
	public default void onEnter(Object o) {
		
	}
	
	public default void onLeave(Object o) {
		
	}
	
}
