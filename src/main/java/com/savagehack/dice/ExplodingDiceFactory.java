package com.savagehack.dice;

import java.util.Random;

import com.generic.dice.Die;

public class ExplodingDiceFactory {
	class ExplodingDieImpl implements Die {
		private final int sides;
		private Integer result;

		private ExplodingDieImpl(int sides) {
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
			while (result % sides == 0) {
				result += new Random().nextInt(getNumberSides()) + 1;
			}
		}
	}

}
