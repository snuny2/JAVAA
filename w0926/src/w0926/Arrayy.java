package w0926;

import java.util.Scanner;

public class Arrayy {

	public static void main(String[] args) {
		int [] num = new int[10];
		int nu;
		int total = 0;
		double avg;
		
		Scanner s = new Scanner(System.in);
		for(nu=0; nu<num.length;nu++) {
			System.out.println(nu+1+"번째 수를 입력......:");
			num[nu] = s.nextInt();
			total += num[nu];
		}
		avg = (double)total/num.length;
		System.out.print("입력한 수는....:");
		for(nu=0;nu<num.length;nu++) {
			System.out.println(num[nu]+" ");
		}
		System.out.println("수들의 평균값은 "+avg+" 입니다...");
}
}