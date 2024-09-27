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
	
    
    /**
	* Hàm main gọi đến các function trên và hiển thị kết quả
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		double[] canh = nhapDuLieu();
        double dai = canh[0];
        double rong = canh[1];

        double chuVi = tinhChuVi(dai, rong);
        double dienTich = tinhDienTich(dai, rong);
        double canhNhoNhat = timCanhNhoNhat(dai, rong);

        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + canhNhoNhat);
	}

}
