package com.podts.podstate;

public class SimpleStateMachine<S extends State> implements StateMachine<S> {
	
	private S state;
	
	@Override
	public S getState() {
		return state;
	}

	@Override
	public S setState(S newState) {
		final S result = state;
		getState().onLeave(this);
		state = newState;
		getState().onEnter(this);
		return result;
	}
	
	private SimpleStateMachine(S initialState) {
		state = initialState;
	}
	
	private SimpleStateMachine() {
		
	}
	
}
