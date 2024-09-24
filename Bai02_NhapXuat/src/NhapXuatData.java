/**
 * Declare library
 */
import java.util.Scanner;


public class NhapXuatData {
	
	
	 /**
	 * Function to receive input and print output the result of input
	 * 
	 * @access public
	 * @param array
	 * @return null
	 */
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String fullName;
        int age;
        double height, weight;
        
        Scanner banPhim;
        banPhim = new Scanner(System.in);
        
        
        
        System.out.print("What's your full name? The answer: ");
        fullName = banPhim.nextLine();
        
        System.out.print("How old are you? The answer: ");
        age = banPhim.nextInt();
        
        System.out.print("How tall are you? The answer: ");
        height = banPhim.nextDouble();
        
        System.out.print("How much your weight? The answer: ");
        weight = banPhim.nextDouble();
        
        
        // Print the data you entered
        System.out.println("===========================");
        System.out.println("The your full name is: " + fullName);
        System.out.println("The your age: " + age);
        System.out.println("The your height is: " + height);
        System.out.println("The your weight is: " + weight);
        System.out.println("===========================");
        
        scanner.close();
    }

}
