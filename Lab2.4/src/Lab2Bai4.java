/**
* Declare library
*/
import java.util.Scanner;



public class Lab2Bai4 {
	
	/**
	* Hàm main gọi đến các function dưới
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	/**
	* Hàm hiện thị menu
	* @access public
	* @param null
	* @return null
	*/
	public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|   1. Giải phương trình bậc nhất     |");
        System.out.println("|   2. Giải phương trình bậc 2          |");
        System.out.println("|   3. Tính tiền điện                           |");
        System.out.println("|   4. Kết thúc                                    |");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chọn chức năng: ");
    }
	
	
	
	
	/**
	* Hàm tính PT bậc nhất
	* @access public
	* @param null
	* @return null
	*/
	public static void giaiPTB1() {
        // Mã giải phương trình bậc nhất
        System.out.println("Giải phương trình bậc nhất ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
	
	
	
	
	
	
	
	
	
}
