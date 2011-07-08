package com.savagehack.game.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DiceFactory {

	private static class DieImpl implements Die {

		private Integer result = null;
		private final int sides;

		public DieImpl(int sides) {
			this.sides = sides;
		}

		public int getNumberSides() {
			return sides;
		}

		public Integer getResult() {
			return result;
		}

		public void roll() {
			result = new Random().nextInt(getNumberSides()) + 1;
		}

	}

	/*
 * 
 */
	public static List<Die> getDice(Map<Integer, Integer> diceNeeded) {
		List<Die> dice = new ArrayList<Die>();
		for (Integer dieType : diceNeeded.keySet()) {
		}
		return dice;
	}

	public static List<Die> getDiceOfType(int numberOfDice, int NumberofSides) {
		List<Die> dice = new ArrayList<Die>();
		for (int i = 0;i<numberOfDice;i++)
		{
			dice.add(new DieImpl(numberOfDice));
		}
		return dice;
	}

}
