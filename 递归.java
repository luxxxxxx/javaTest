import java.util.Scanner;
public class �ݹ� {   //�ݹ�means�Լ������Լ�
	static int count = 0;
	public static void main (String[] args) {
		System.out.println("please input a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(add(num));
	}
	
	public static int add (int x) {
		while(x >= x+100) {
			System.out.println("shit");
			return (x+100);
		}
		System.out.print(x);
		return add(x++);
	}
	
	
	
}
