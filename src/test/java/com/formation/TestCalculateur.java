package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalculateur {
	private static Calculateur calcul = null;
	
	@BeforeAll
	public static void init() {
		calcul = new Calculateur();
	}

	@Test
	public void TestAddition() {
		assertEquals(  5, calcul.additionner(2, 3), "Calculateur.additionner ne fonctionne pas..!");
	}

	@Test
	public void TestMultiplication() {
		assertEquals(  10, calcul.multiplier(2,5), "Calculateur.multiplier ne fonctionne pas..!");
	}

}
