/**
* Declare library
*/
import java.util.Scanner;



public class DoiDonVi {
	
	/**
	* Hàm đổi km sang m
	* @access public
	* @param double
	* @return double
	*/
    public static double kmToM(double km) {
        return km * 1000;
    }

    /**
	* Hàm đổi byte sang bit
	* @access public
	* @param double
	* @return double
	*/
    public static double byteToBit(double bytes) {
        return bytes * 8;
    }
    
    
    
    /**
	* Hàm main gọi đến các function trên và hiển trị kết quả
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn loại chuyển đổi:");
        System.out.println("1. km -> m");
        System.out.println("2. byte -> bit");
        int choice = scanner.nextInt();

        System.out.println("Nhập giá trị cần chuyển đổi:");
        double value = scanner.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = kmToM(value);
                System.out.println(value + " km = " + result + " m");
                break;
            case 2:
                result = byteToBit(value);
                System.out.println(value + " byte = " + result + " bit");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }

        scanner.close();

	}

}
