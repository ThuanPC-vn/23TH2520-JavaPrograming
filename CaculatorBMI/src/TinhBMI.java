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

	        // Tính BMI
	        double bmi = weight / (height * height);
	        System.out.printf("Chỉ số BMI của bạn là: %.2f\n", bmi);

	        // Đưa ra mô tả thể trạng của cơ thể, cho lời khuyên
	        String description;
	        switch ((int) bmi / 5) {
	            case 0:
	            case 1:
	                description = "Khá gầy, bạn nên ăn bulking.";
	                break;
	            case 2:
	                description = "Bình thường, cần ăn uống đều độ và tập thể dục.";
	                break;
	            case 3:
	                description = "Hơi thừa cân, nên ăn cutting và tập GYM.";
	                break;
	            case 4:
	                description = "Thừa cân, nên ăn cutting và tập GYM ít nhất 3 day/week.";
	                break;
	            default:
	                description = "Béo phì, nên gặp chuyên gia fitness để được tư vấn.";
	                break;
	        }

	        System.out.println("Thể trạng của bạn: " + description);
	    }
	}

}
