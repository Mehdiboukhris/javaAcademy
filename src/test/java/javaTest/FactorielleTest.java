package javaTest;

import junit.framework.TestCase;

public class FactorielleTest extends TestCase{
	
	public void factorielleTest(){
		int n = 3;
		assertEquals(6, Factorielle.factorielle(n));
	}

}
