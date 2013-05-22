import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Chris Bösch
 *
 */

public class QSVU_UEbung3_1025952_Bösch_Chris_TriangleTest {
	
	private double DELTA = 1e-15;

	//_________ HYPOTENUSE __________
	//to calculate:  hyp = sqrt(cat1^2  + cat2^2)
	
	//__________ testing with cat1 > 0 AND cat2 > 0 __________
	@Test
	public void calcHypotenuseWithPositiveCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(1000, 2) + Math.pow(700, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(1000, 700), DELTA );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0.04, 2) + Math.pow(0.8, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0.04, 0.8), DELTA );
	}
	
	//__________ testing with cat1 > 0 AND cat2 > 0 __________
	@Test
	public void calcHypotenuseWithNegativeCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-8, 2) + Math.pow(-1, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-8, -1), DELTA );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-200, 2) + Math.pow(-900, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-200, -900), DELTA );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-0.5, 2) + Math.pow(-0.07, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-0.5, -0.07), DELTA );
	}
	
	//__________ testing with cat1 = 0 OR cat2 = 0 __________
	@Test
	public void calcHypotenuseWithZeroCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0, 2) + Math.pow(23.5, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0, 23.5f), DELTA );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-444.1, 2) + Math.pow(0, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-444.1, 0), DELTA );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0, 2) + Math.pow(0, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0, 0), DELTA );
	}
	
	//__________ testing with ( cat1 < 0 AND cat2 > 0 ) AND ( cat1 > 0 AND cat2 < 0 ) __________
	@Test
	public void calcHypotenuseWithPosAndNegCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-77, 2) + Math.pow(15.5, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-77, 15.5), DELTA );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0.45, 2) + Math.pow(-213, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0.45, -213), DELTA );
	}
	
	
	
}
