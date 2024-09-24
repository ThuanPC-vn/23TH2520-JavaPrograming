/**
 * Declare library Java
 */
import java.util.Scanner;

public class TinhBMI {

	/**
	 * BMI calculator function
	 * 
	 * @access public
	 * @param args
	 * @return null
	 */
	public class BMICalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double weight = 0;
	        double height = 0;

	        // Nhập cân nặng
	        while (true) {
	            try {
	                System.out.print("Nhập cân nặng (kg): ");
	                weight = Double.parseDouble(scanner.nextLine());
	                if (weight <= 0) {
	                    System.out.println("Cân nặng phải lớn hơn 0. Vui lòng nhập lại.");
	                    continue;
	                }
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
	            }
	        }
	        
	        // Nhập chiều cao
	        while (true) {
	            try {
	                System.out.print("Nhập chiều cao (m): ");
	                height = Double.parseDouble(scanner.nextLine());
	                if (height <= 0) {
	                    System.out.println("Chiều cao phải lớn hơn 0. Vui lòng nhập lại.");
	                    continue;
	                }
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
	            }
	        }

	        
	    }
	}

}
