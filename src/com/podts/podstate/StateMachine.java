package com.podts.podstate;

public interface StateMachine<S extends State> {
	
	public S getCurrentState();
	public S setState(State newState);
	
}
