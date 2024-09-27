/**
* Declare library
*/
import java.util.Scanner;

public class Lab1Bai4 {
	
	/**
	* Hàm tính delta
	* @access public
	* @param double, double, double
	* @return double
	*/
    public static double calculateDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }


    
    /**
	* Hàm tính căn delta
	* @access public
	* @param double
	* @return double
	*/
    public static double calculateSqrtDelta(double delta) {
        return Math.sqrt(delta);
    }
    
    
    
    
    
	public static void main(String[] args) {
		
	}
}
