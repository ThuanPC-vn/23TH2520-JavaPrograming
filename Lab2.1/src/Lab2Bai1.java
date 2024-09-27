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
	
	
	/**
	* Hàm main gọi đến các function trên
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập vào số b: ");
        double b = scanner.nextDouble();
        
        // Gọi hàm giải phương trình bậc nhất
        giaiPhuongTrinhBacNhat(a, b);

	}

}
