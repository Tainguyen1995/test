package khoa;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= num ; i++) {
			str = str.append(i);
			System.out.println(str.toString());
		}

	}

}
