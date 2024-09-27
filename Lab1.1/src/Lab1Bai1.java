/**
 * Declare library
 */
import java.util.Scanner;
public class Lab1Bai1 {
	
	/**
	 * @access public
	 * @param args
	 * @return null
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Họ và tên: "); 
		String fullName = scanner.nextLine(); 
		
		System.out.print("Điểm TB: "); 
		double avgScore = scanner.nextDouble();
		
		
		System.out.printf("%s %8.2f điểm", fullName, avgScore);
	}

}
