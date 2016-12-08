package com.podts.podstate;

public abstract class SimpleStateMachine<S extends State> implements StateMachine<S> {
	
	private S state;
	
	@Override
	public S getState() {
		return state;
	}

	@Override
	public S setState(S newState) {
		final S result = state;
		getState().onLeave(this);
		newState.onEnter(this);
		state = newState;
		return result;
	}
	
	public SimpleStateMachine(S initialState) {
		state = initialState;
	}
	
	public SimpleStateMachine() {
		
	}
	
}
