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
	
	
	/**
	* Hàm tính chu vi
	* @access public
	* @param double, double
	* @return double
	*/
    public static double tinhChuVi(double dai, double rong) {
        return (dai + rong) * 2;
    }

    
    /**
	* Hàm tính diện tích
	* @access public
	* @param double, double
	* @return double
	*/
    public static double tinhDienTich(double dai, double rong) {
        return dai * rong;
    }
 
    
    /**
	* Hàm tìm cạnh nhỏ nhất
	* @access public
	* @param double, double
	* @return double
	*/
    public static double timCanhNhoNhat(double dai, double rong) {
        return Math.min(dai, rong);
    }
	
    
    
	public static void main(String[] args) {
		
	}

}
