package khoa;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i <= 5 ; i++) {
			int result = num*i;
			System.out.println(num + " x "+ i +" = " +result);
		}
		

}
}
