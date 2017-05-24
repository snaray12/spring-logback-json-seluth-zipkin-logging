package org.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	private Calculator calc;
	@Before
	public void setup() {
		this.calc = new Calculator();
	}
	
	@After
	public void teardown() {
		this.calc = null;
	}
	@Test
	public final void testAdd() {
		assert(this.calc.add(5, 6)== 0);
	}
	
	public final void testNegativeAdd() {
		assert(this.calc.add(-4, -5) == -9);
	}
	
	@Test(expected=Exception.class)
	public final void testAtleastOneNullAdd() {
		assert(this.calc.add(5, null) == 9); //Exception
	}
	
	@Test(expected=Exception.class)
	public final void testBothNullAdd() {
		assert(this.calc.add(null, null) == 9); //Exception
	}
	
	@Test(expected=Exception.class)
	public final void testInfiniteAdd() {
		assert(this.calc.add(5/0, 5)==5); //Exception
	}
	

}
