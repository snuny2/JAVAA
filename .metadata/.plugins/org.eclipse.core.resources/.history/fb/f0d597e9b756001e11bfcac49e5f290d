package w0919;

import java.util.Random;
import java.util.Scanner;

public class GawiBawiBo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int input = 0;
		while (true) {
			System.out.print("가위는 0, 바위는 1, 보는 2, 종료는 -1 : ");
			input = scan.nextInt();
			
			if (input<0) {
				break;
			}
			int saram = input; //플레이어가 낼 수
			int com = random.nextInt(); // 컴퓨터가 낼 수
			
			if (com<0) {
				com = com * -1;
			}
			//가위(0), 바위(1), 보(2) 이외의 숫자 입력시 다시
			if (saram>2) {
				System.out.println();
				continue;
			}
			if (saram==0) {
				System.out.println("너는 가위를 냈습니다.");
			}else if(saram==1) {
				System.out.println("너는 바위를 냈습니다.");
			}else if(saram==2) {
				System.out.println("너는 보를 냈습니다.");
			}
			if (com==0) {
				System.out.println("컴퓨터는 가위를 냈다.");
			}else if (com==1) {
				System.out.println("컴퓨터는 바위를 냈다.");
			}else if (com==2) {
				System.out.println("컴퓨터는 보를 냈다.");
			}
			System.out.println("--------------------------------------");
			System.out.println("결과 : ");
			if (saram==com) {
				System.out.println("비겼습니다.");
			}else if (saram==(com+1)%3) {
				System.out.println("당신이 이겼다.");
			}else {
				System.out.println("당신이 졌다.");
			}
			System.out.println("--------------------------------------");
			System.out.println();
		}
		System.out.println("종료...");
	}

}
