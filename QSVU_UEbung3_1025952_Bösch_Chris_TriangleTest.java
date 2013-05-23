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
	
	
	//_________ ANGLE __________
	//to calculate: angle = 90 - givenAngle
	//given angle have to be between 0 and 90 degrees
	//if input incorrect -> return 0
	
	//__________ testing with correct angles (incl. boundaries) __________
	@Test
	public void calcAngleWithCorrectlyGivenAngles_returnRightAngle() {
		assertEquals("AngleCalculation failed",  90-24 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(24), DELTA );
		assertEquals("AngleCalculation failed",  90-1 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(1), DELTA );
		assertEquals("AngleCalculation failed",  90-0.0002 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(0.0002), DELTA );
		assertEquals("AngleCalculation failed",  90-89 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(89), DELTA );
		assertEquals("AngleCalculation failed",  90-89.999999 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(89.999999), DELTA );	
	}
	
	//__________ testing with incorrect angles (incl. boundaries) __________
	@Test
	public void calcAngleWithIncorrectlyGivenAngles_returnNull() {
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(-1000), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(0), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(-0.00001), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(90), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateAngle(200), DELTA );	
	}
	
	
	//_________ AREA __________
	//to calculate: area = (cat1 * cat2) / 2
	//given caths have to be > 0
	//if input incorrect -> return 0
	
	//__________ testing with correct caths (incl. boundaries) __________
	@Test
	public void calcAreaWithCorrectlyGivenCaths_returnRightArea() {
		assertEquals("AreaCalculation failed",  (32*45)/2 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(32, 45), DELTA );
		assertEquals("AreaCalculation failed",  (0.0001*0.5)/2 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(0.0001, 0.5), DELTA );
		assertEquals("AreaCalculation failed",  (123456*200.99)/2 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(123456, 200.99), DELTA );
		assertEquals("AreaCalculation failed",  (98765*0.00002)/2 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(98765, 0.00002), DELTA );
		assertEquals("AreaCalculation failed",  (2*2)/2 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(2, 2), DELTA );
	}
	
	//__________ testing with incorrect caths (incl. boundaries) __________
	@Test
	public void calcAreaWithIncorrectlyGivenCaths_returnRightArea() {
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(0, 12), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(45.22, 0), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(0, 0), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(-45.99, 0.0005), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(2.3456, -8.7654), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(-7711, -66.6), DELTA );
		assertEquals("Exception failed",  0 , QSVU_UEbung3_1025952_Bösch_Chris_Triangle.calculateArea(-0.00001, 0), DELTA );
	}
	
}
