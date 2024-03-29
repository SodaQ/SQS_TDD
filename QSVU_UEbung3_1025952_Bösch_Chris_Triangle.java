/**
 * 
 * @author Chris B�sch
 *
 */

public class QSVU_UEbung3_1025952_B�sch_Chris_Triangle {

	// hyp = sqrt(cat1^2  + cat2^2)
	public static double calculateHypotenuse(double cat1, double cat2) {
		return (Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2)));
	}

	// angle = 90 - givenAngle
	public static double calculateAngle(double angle) {
		if(angle > 0 && angle < 90)
			return 90-angle;
		else 
			return 0;
	}

	// area = ( cat1 * cat2 ) / 2
	public static double calculateArea(double cat1, double cat2) {
		if(cat1 <= 0 || cat2 <= 0)
			return 0;
		else 
			return (cat1 * cat2 ) / 2;
	}
	
}
