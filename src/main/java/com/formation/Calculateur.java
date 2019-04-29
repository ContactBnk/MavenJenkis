package com.formation;

public class Calculateur {
	
	public int additionner( int numA, int numB) {
		return numA + numB;
	}

	public int multiplier( int numA, int numB) {
		return numA * numB;
	}

	public int diviser( int numA, int numB) {
		if (numB == 0) {
				numB = 1 ;
		}
		return numA /  numB;
	}

}
