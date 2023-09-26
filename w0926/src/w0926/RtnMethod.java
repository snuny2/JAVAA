package w0926;

public class RtnMethod {

	static int sum(int a, int b) {
		int res;
		res = a + b;
		return(res);
	}
	
	public static void main(String[] args) {
		int res;
		System.out.println("반환값이 있는 함수를 이용하여 더하기를 해줍니다!");
		res = sum(7, 13);
		System.out.println("7 + 13 = " +res+ " 입니다!");
	}

}
