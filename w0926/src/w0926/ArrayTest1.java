package w0926;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열크기가 10인 배열 s
		// 출력 0~9까지 순서대로
		int [] s = new int[10];
		
		for(int i=0;i<s.length;i++) {
			s[i] = i;
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

}
