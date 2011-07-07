package com.savagehack.game;

import java.util.Random;

/**
 * The die class is responsible for generating and creating a die of N-size. Then you can roll this dice and
 * get a random number between 1-N.
 * 
 * This file is part of SavageHack.
 *
 * SavageHack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SavageHack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SavageHack.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author Sam Contapay & Damon Jacobsen
 *
 */
public class Die {

	private DieType type = DieType.d6;
	private int numberSides = 6;
	
	public Die( DieType type ) {		
		this.type = type;
		this.numberSides = type.getNumSides();
	}
	
	public String getNameDie() {
		return type.toString();
	}
	
	/**
	 * Default constructor constructs a dice of 6-sides
	 */
	public Die() {
		
	}
	
	/**
	 * Roll the dice and get a number between 1 and N sides of the dice. This is just one dice roll
	 * 
	 * @return int random number from dice roll
	 */
	public int roll() {		
		Random randomNumber = new Random();
		return randomNumber.nextInt( numberSides ) + 1;				
	}
	
	public int[] roll( int numberTimes ) {
		int[] results = new int[numberTimes];
		
		for ( int x = 0; x < numberTimes; x++ )
		{
			results[x] = this.roll();
		}
		
		return results;
	}
	
	public static void main(String[] args) {
		System.out.println("Roll 5 random numbers");
		Die die = new Die();
		for ( int x = 0; x < 5; x++ )
		{
			System.out.println("I rolled: " + die.roll() );
		}
		
		System.out.println( "Roll dice 7 amount of times");
		int[] results = die.roll(7);
		for ( int x = 0; x < 7; x++ )
			System.out.println("result for roll " + (x+1) + " is: " + results[x]);
	}

}
