/**
 * scanner
 * @author interesting
 *
 */
import java.util.Scanner;  // first step
public class scanner {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //second step
		System.out.println("please input a int num");
		int intNum = input.nextInt();
		double doubleNum = input.nextDouble();
		//String StringText = input.next();
		System.out.println("you inupt a " + doubleNum);
	}

}
