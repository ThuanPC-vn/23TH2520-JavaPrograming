/**
* Declare library
*/
import java.util.Scanner;



public class Lab2Bai3 {
	
	
	
	/**
	* Hàm tính Tiền Điện theo phương pháp lũy tiến
	* @access public
	* @param int
	* @return int
	*/
	public static int tinhTienDien(int soDien) {
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        return tien;
    }
	
	
	
	/**
	* Hàm main gọi đến các function trên
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        
        // Gọi hàm tính Tiền Điện
        int tien = tinhTienDien(soDien);
        System.out.println("Số tiền điện phải trả là: " + tien + " VNĐ");
	}
}
