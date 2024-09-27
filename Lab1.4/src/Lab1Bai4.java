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
    
    
    
    
    /**
	* Hàm main gọi đến các function trên và hiển thị kết quả
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = calculateDelta(a, b, c);
        System.out.println("Delta = " + delta);

        // Tính và xuất căn delta
        if (delta >= 0) {
            double sqrtDelta = calculateSqrtDelta(delta);
            System.out.println("Căn delta = " + sqrtDelta);
        } else {
            System.out.println("Delta âm, không có căn delta thực.");
        }

        scanner.close();
	}
}
