/**
* Declare library
*/
import java.util.Scanner;



public class chuyenDoiTienTe {
	
	
	
	/**
	* Hàm main gọi đến các function dưới và hiển trị kết quả
	* @access public
	* @param args
	* @return null
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int fromCurrency = getCurrencyChoice(scanner, "Vui lòng chọn đơn vị tiền tệ của quý khách:");
        int toCurrency = getCurrencyChoice(scanner, "Vui lòng chọn đơn vị tiền tệ mà quý khách muốn quy đổi ra:");
        System.out.print("Nhập số tiền: ");
        double amount = scanner.nextDouble();
        double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);
        printResult(fromCurrency, toCurrency, amount, convertedAmount);

	}
	
	
	
	
	/**
	* Hàm nhận lựa chọn của người dùng
	* @access private
	* @param Scanner, String
	* @return int
	*/
	private static int getCurrencyChoice(Scanner scanner, String message) {
        int choice;
        do {
            System.out.println(message);
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. JPY");
            System.out.println("4. VNĐ");
            choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice < 1 || choice > 4);
        return choice;
    }
	
	
	
	/**
	* Hàm chuyển đổi tiền tệ
	* @access private
	* @param int, int, double
	* @return double
	*/
	private static double convertCurrency(int fromCurrency, int toCurrency, double amount) {
        double rate = getConversionRate(fromCurrency, toCurrency);
        return amount * rate;
    }
	
	
	
	/**
	* Hàm chứa tỷ giá để chuyển đổi
	* @access private
	* @param int, int
	* @return array
	*/
    private static double getConversionRate(int fromCurrency, int toCurrency) {
        // Tỉ giá giả định trong bài toán này
        double[][] rates = {
            {1.0, 0.85, 110.0, 23000.0}, // USD
            {1.18, 1.0, 129.0, 27000.0}, // EUR
            {0.0091, 0.0078, 1.0, 210.0}, // JPY
            {0.000043, 0.000037, 0.0048, 1.0} // VNĐ
        };
        return rates[fromCurrency - 1][toCurrency - 1];
    }
    
    
    
    /**
	* Hàm hiển thị kết quả sau cùng
	* @access private
	* @param int, int, double, double
	* @return null
	*/
    private static void printResult(int fromCurrency, int toCurrency, double amount, double convertedAmount) {
        String[] currencyNames = {"USD", "EUR", "JPY", "VNĐ"};
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|          KẾT QUẢ QUY ĐỔI ĐƠN VỊ NGOẠI TỆ CỦA QUÝ KHÁCH        |");
        System.out.println("|                                                             |");
        System.out.printf("|     %-20s | %-20s |\n", "Đơn vị ban đầu", "Đơn vị quy đổi");
        System.out.printf("|     %-20s | %-20s |\n", currencyNames[fromCurrency - 1], currencyNames[toCurrency - 1]);
        System.out.printf("|     %-20.2f | %-20.2f |\n", amount, convertedAmount);
        System.out.println("+-------------------------------------------------------------+");
    }
}
