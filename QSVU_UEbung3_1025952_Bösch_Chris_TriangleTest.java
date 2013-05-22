import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Chris Bösch
 *
 */

public class QSVU_UEbung3_1025952_Bösch_Chris_TriangleTest {

	//_________ HYPOTENUSE __________
	//to calculate:  hyp = sqrt(cat1^2  + cat2^2)
	
	//__________ testing with cat1 > 0 AND cat2 > 0 __________
	@Test
	public void calcHypotenuseWithPositiveCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(2, 2) + Math.pow(3, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(2, 3) );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(1000, 2) + Math.pow(700, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(1000, 700) );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0.04, 2) + Math.pow(0.8, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0.04f, 0.8f) );
	}
	
	//__________ testing with cat1 > 0 AND cat2 > 0 __________
	@Test
	public void calcHypotenuseWithNegativeCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-8, 2) + Math.pow(-1, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-9, 2) );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-200, 2) + Math.pow(-900, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-200, -900) );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-0.5, 2) + Math.pow(-0.07, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-0.5f, -0.07f) );
	}
	
	//__________ testing with cat1 = 0 OR cat2 = 0 __________
	@Test
	public void calcHypotenuseWithZeroCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0, 2) + Math.pow(23.5, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0, 23.5f) );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-444.1, 2) + Math.pow(0, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-444.1f, 0) );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0, 2) + Math.pow(0, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0, 0) );
	}
	
	//__________ testing with ( cat1 < 0 AND cat2 > 0 ) AND ( cat1 > 0 AND cat2 < 0 ) __________
	@Test
	public void calcHypotenuseWithPosAndNegCats_returnRightLength() {
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(-77, 2) + Math.pow(15.5, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(-77, 15.5f) );
		assertEquals("HypotenuseCalculation failed",  Math.sqrt( Math.pow(0.45, 2) + Math.pow(-213, 2) ) , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateHypotenuse(0.45f, -213) );
	}
	
	
	
}
