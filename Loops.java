package Kindrick;
import java.util.Scanner;


public class Loops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("pag pili munber: ");
		int num = scanner.nextInt();
	
		
		for (int i = num; i > 0; i--) {
		System.out.println("cube root is: " + num*num*num);
		}
		scanner.close();
	}

}
