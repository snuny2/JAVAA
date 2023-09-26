package w0926;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		final int STUDENTS = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int [] scores = new int[STUDENTS]; //크기가 STUDENTS의 배열생성
		for(int i=0;i<scores.length;i++) {
			System.out.print("성적을 입력하시지! : ");
			scores[i] = scan.nextInt(); //1번쨰 부터 저장
		}
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}
		System.out.println("평균성적은 "+total/STUDENTS+"점 입니다..!");
	}

}
