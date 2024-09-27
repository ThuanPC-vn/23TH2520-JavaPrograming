/**
* Declare library
*/
import java.util.Scanner;



public class tinhToan {

	/**
	* Hàm tính chu vi hình chữ nhật
	* @access public
	* @param double, double
	* @return double
	*/
    public static double tinhChuViHinhChuNhat(double dai, double rong) {
        return 2 * (dai + rong);
    }

    /**
	* Hàm tính diện tích hình chữ nhật
	* @access public
	* @param double, double
	* @return double
	*/
    public static double tinhDienTichHinhChuNhat(double dai, double rong) {
        return dai * rong;
    }

    /**
	* Hàm tính chu vi hình tròn
	* @access public
	* @param double
	* @return double
	*/
    public static double tinhChuViHinhTron(double banKinh) {
        return 2 * Math.PI * banKinh;
    }

    /**
	* Hàm tính diện tích hình tròn
	* @access public
	* @param double
	* @return double
	*/
    public static double tinhDienTichHinhTron(double banKinh) {
        return Math.PI * banKinh * banKinh;
    }
	
	
	
	
    /**
	* Hàm main gọi đến các function trên và hiển trị kết quả
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
