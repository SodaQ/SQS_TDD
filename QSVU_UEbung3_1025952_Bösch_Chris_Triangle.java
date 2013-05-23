

/**
 * 
 * @author Chris Bösch
 *
 */

public class QSVU_UEbung3_1025952_Bösch_Chris_Triangle {

	// hyp = sqrt(cat1^2  + cat2^2)
	public static double calculateHypotenuse(double cat1, double cat2) {
		return (Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2)));
	}

	public static double calculateAngle(double angle) {
		if(angle > 0 && angle < 90)
			return 90-angle;
		else 
			return 0;
	}

	public static double calculateArea(double cat1, double cat2) {
		return 0;
	}
	
}
