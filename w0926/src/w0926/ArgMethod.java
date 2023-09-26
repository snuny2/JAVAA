package w0926;

public class ArgMethod {

	static void hol(int num) {
		if(num%2==1) {
			System.out.println(num+" 는 홀수!");
		}
		else {
			System.out.println(num+" 는 짝수!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("함수를 이용하여 홀/짝을 구별해 줍니다!");
		hol(5);
		hol(22);
	}

}
