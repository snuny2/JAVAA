package w0919;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		int n;
		
		System.out.print("정수를 입력하시길 : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		System.out.printf("%d!는 %d랍니다. ", n, fact);
	}

}
