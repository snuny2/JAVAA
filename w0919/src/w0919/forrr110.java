package w0919;

import java.util.Scanner;

public class forrr110 {

	public static void main(String[] args) {
		int num = 0;
		int nu;
		int nn;
		System.out.print("1부터 몇까지의 합을 알고싶은가요 : ");
		Scanner s = new Scanner(System.in);
		nu = s.nextInt();
		
		for(nn=1;nn<=nu;nn++) {
			num += nn;
		}
		System.out.print("1부터 "+nu+" 까지의 합은 "+num+" 입니다..");

	}

}
