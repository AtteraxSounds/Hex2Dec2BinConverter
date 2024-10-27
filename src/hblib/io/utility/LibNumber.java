package hblib.io.utility;

/**
 * 
 * 
 * @author bingol
 */
public class LibNumber {
	
	static final double EPSILON = 1e-15;

	/**
	 * Equality check for doubles.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean doubleEquals(double a, double b) {
		return doubleEquals(a, b, EPSILON);
	}

	/**
	 * Equality check for doubles.
	 * 
	 * @param a
	 * @param b
	 * @param epsilon
	 * @return
	 */
	public static boolean doubleEquals(double a, double b, double epsilon) {
		if (a == Double.NaN || b == Double.NaN) {
			return false;
		}
		return Math.abs(a - b) < epsilon;
	}
	
}
