/**
 * Declare library
 */
import java.util.Scanner;



public class Lab1Bai3 {
	
	/**
	* Hàm tính thể tích của khối lập phương
	* @access public
	* @param double
	* @return double
	*/
    public static double calculateVolume(double edge) {
        return Math.pow(edge, 3);
    }
    
    
    
    /**
	* Hàm main gọi đến các function trên và hiển thị kết quả
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Nhập cạnh của khối lập phương từ bàn phím
        System.out.print("Nhập cạnh của khối lập phương: ");
        double edge = scanner.nextDouble();

        // Tính thể tích của khối lập phương
        double volume = calculateVolume(edge);

        // Xuất thể tích ra màn hình
        System.out.println("Thể tích của khối lập phương là: " + volume);
	}

}
