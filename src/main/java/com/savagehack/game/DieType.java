package com.savagehack.game;

public enum DieType {
	D4(4),
	D6(6),
	D8(8),
	D10(10),
	D12(12),
	D20(20);

	private final int numSides;
	
	private DieType( int numSides ) {
		this.numSides = numSides;
	}
	
	public int getNumSides() {
		return this.numSides;
	}
}
