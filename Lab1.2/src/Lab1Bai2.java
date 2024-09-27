/**
 * Declare library
 */
import java.util.Scanner;

public class Lab1Bai2 {
	
	
	/**
	* Hàm nhập dữ liệu từ bàn phím
	* @access public
	* @param null
	* @return array
	*/
	public static double[] nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        return new double[]{dai, rong};
    }
	
	
	
	public static void main(String[] args) {
		
	}

}
