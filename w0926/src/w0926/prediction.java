package w0926;

import java.util.Random;
import java.util.Scanner;

public class prediction {

	public static void main(String[] args) {
		Random ran = new Random();
		int dom = ran.nextInt(100);
		
		int num;
		int nu = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자를 맞춰보시지..!");
		
		do {
			System.out.println("자! 맞춰보시지!!");
			System.out.printf("지금까지 시도한 횟수는 %d번이다..!\n", nu);
			num = s.nextInt();
			nu++;
			if (num == dom) {
				System.out.println("정답이다!");
			}
			else if (num > dom) {
				System.out.println("더 낮습니다");
			}
			else if (num < dom) {
				System.out.println("더 높습니다");
			}
		} while (num != dom);
		System.out.printf("%d번 걸려서 맞췄군!\n대단하다!!", nu);
	}

}
