package com.podts.podstate;

public interface StateMachine<S extends State> {
	
	public S getState();
	public S setState(S newState);
	
}
