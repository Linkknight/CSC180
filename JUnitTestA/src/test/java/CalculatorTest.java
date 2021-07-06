import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		
		Calculator clsCalc = new Calculator();
		if (clsCalc.add(1, 5) != 6) {
			fail("Not yet implemented");
		}
		
	}
	
	@Test
	void testSubtract() {
		Calculator clsCalc = new Calculator();
		assertEquals(Calculator.sub(7,5),2);
		
		//assertNotEquals(true, true);
		//assertNull();
		//assertNotNull();
		//assertTrue();
		//assertFalse();
		//assertSame();
		//assertNotSame();
		
		//if(Calculator.sub(7,5) != 2) {
		//	fail("Not Yet Implemented");
		}
	
	@Test
	void testDivision() {
		Calculator clsCalc = new Calculator();
		assertEquals(Calculator.div(9,3),3);
	}
	
	@Test
	void testMulti() {
		Calculator clsCalc = new Calculator();
		assertEquals(Calculator.mult(5,2),10);
	}
	
	}


