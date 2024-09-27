/**
* Declare library
*/
import java.util.Scanner;



public class Lab2Bai2 {
	
	/**
	* Hàm tính PT Bậc hai và hiển thị kết quả
	* @access public
	* @param double, double, double
	* @return null
	*/
	public static void giaiPTBacHai(double a, double b, double c) {
        if (a == 0) {
            // Giải phương trình bậc nhất
            if (b != 0) {
                double x = -c / b;
                System.out.println("Phương trình bậc nhất có nghiệm x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            // Tính delta
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
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

        // Nhập các hệ số a, b, c
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        // Gọi hàm giải phương trình bậc hai
        giaiPTBacHai(a, b, c);
	}

}
