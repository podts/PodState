package com.podts.podstate;

public interface StateMachine<S extends State> {
	
	/**
	 * Returns the current state this StateMachine is in.
	 * @return The current state.
	 */
	public S getState();
	
	/**
	 * Changes the state of this StateMachine to newState. This calls {@link com.podts.podstate.State#onLeave(Object) onLeave()} for the current State and {@link com.podts.podstate.State#onEnter(Object) onEnter()} for the new state.
	 * @param newState - The new State for this StateMachine.
	 * @return The previous State.
	 */
	public S setState(S newState);
	
}
