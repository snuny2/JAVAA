package w0926;

import java.util.Scanner;

public class movie {

	static void print_head() {
		System.out.println("---------------------------------------\n1 2 3 4 5 6 7 8 9 10");		
	}
	
	public static void main(String[] args) {
		int [] s = new int[10];
		int set;
		Scanner sca = new Scanner(System.in);
		
		while(true) {
			System.out.println("예매하실 좌석을 골라주세요.(1~10까지, 종료는 -1)");
			int se = sca.nextInt();
			if(se == -1) {
				System.out.println("종료되었습니다..");
				print_head();
				
				for(int i=0; i<s.length; i++) {
					System.out.println(i+1+" ");
				}
				System.out.println();
				for (int i : s) {              // => for(int i = 0; i < seat.length; i++) {
					System.out.print(i + " ");    //       System.out.println(seat[i] + " ");
				}
				set = sca.nextInt();
			}
	}
}
}