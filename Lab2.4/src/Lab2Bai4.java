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
		
		Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
        scanner.close();

	}

	
	
	/**
	* Hàm hiện thị menu
	* @access public
	* @param null
	* @return null
	*/
	public static void menu() {
        System.out.println("+-------------------------------------+");
        System.out.println("|   1. Giải phương trình bậc nhất     |");
        System.out.println("|   2. Giải phương trình bậc 2        |");
        System.out.println("|   3. Tính tiền điện                 |");
        System.out.println("|   4. Kết thúc                       |");
        System.out.println("+-------------------------------------+");
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
	
	
	
	/**
	* Hàm tính PT bậc hai
	* @access public
	* @param null
	* @return null
	*/
	public static void giaiPTB2() {
        // Mã giải phương trình bậc 2
        System.out.println("Giải phương trình bậc hai ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
	
	
	
	
	/**
	* Hàm tính PT bậc hai
	* @access public
	* @param null
	* @return null
	*/
	public static void tinhTienDien() {
        // Mã tính tiền điện
        System.out.println("Tính tiền điện");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện tiêu thụ (kWh): ");
        double kWh = scanner.nextDouble();
        double tienDien;
        if (kWh <= 50) {
            tienDien = kWh * 1.678;
        } else if (kWh <= 100) {
            tienDien = 50 * 1.678 + (kWh - 50) * 1.734;
        } else if (kWh <= 200) {
            tienDien = 50 * 1.678 + 50 * 1.734 + (kWh - 100) * 2.014;
        } else if (kWh <= 300) {
            tienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (kWh - 200) * 2.536;
        } else if (kWh <= 400) {
            tienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (kWh - 300) * 2.834;
        } else {
            tienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834 + (kWh - 400) * 2.927;
        }
        System.out.println("Số tiền điện phải trả là: " + tienDien + " VND");
    }
	
	
	
	
	
}
