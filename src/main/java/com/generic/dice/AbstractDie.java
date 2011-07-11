package com.generic.dice;

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
public abstract class AbstractDie {
	
	private int result;
	
	abstract public int getNumberSides();
	
	public final int getResult()
	{
		return result;
	}
	
	/**
	 * Roll the dice and get a number between 1 and N sides of the dice. This is just one dice roll
	 * 
	 * @return int random number from dice roll
	 */
	public void roll() {		
		Random randomNumber = new Random();
		result =  randomNumber.nextInt( getNumberSides() ) + 1;				
	}
}
