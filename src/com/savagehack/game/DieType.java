package com.savagehack.game;

public enum DieType {
	d4(4),
	d6(6),
	d8(8),
	d10(10),
	d12(12),
	d20(20);

	private final int numSides;
	
	private DieType( int numSides ) {
		this.numSides = numSides;
	}
	
	public int getNumSides() {
		return this.numSides;
	}
}
