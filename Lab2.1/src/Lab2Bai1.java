/**
* Declare library
*/
import java.util.Scanner;



public class Lab2Bai1 {
	
	/**
	* Hàm tính PT Bậc nhất
	* @access public
	* @param double, double
	* @return null
	*/
	public static void giaiPhuongTrinhBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
	
	
	
	public static void main(String[] args) {
		
		

	}

}
