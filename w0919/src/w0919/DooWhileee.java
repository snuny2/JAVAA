package w0919;

import java.util.Scanner;

public class DooWhileee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		
		do {
			System.out.println("몇월을 원하신가... : ");
			month = input.nextInt();
		}while(month <= 12 && month >= 1); {
				System.out.println("해당 월은 존재하지 않습니다..");
				input.close();
				}
	}
}
