package w0919;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		int num, sum, nu;
		sum = 0;
		num = 1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		nu = s.nextInt();
		
		while(true) {
			sum += num;
			num++;
			if (num>nu) {
				break;
			}
		}
		System.out.println("1부터 "+nu+" 까지의 합은 "+sum+" 입니다.");
	}

}
