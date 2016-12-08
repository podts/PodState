package com.podts.podstate;

public interface State {
	
	/**
	 * Called when the state is entered into a specific StateMachine.
	 * @param o - The StateMachine that is entering this state.
	 */
	public default void onEnter(StateMachine<?> o) {
		
	}
	
	/**
	 * Called when the StateMachine is leaving this State to another.
	 * @param o - The stateMachine that is leaving this state.
	 */
	public default void onLeave(StateMachine<?> o) {
		
	}
	
}
