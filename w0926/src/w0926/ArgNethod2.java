package w0926;

public class ArgNethod2 {

	static void add(int a, int b) {
		int c;
		c = a + b;
		System.out.println(a+ "+" +b+ "=" +c+ " 입니다!");
	}
	
	public static void main(String[] args) {
		System.out.println("함수를 이용하여 더하기를 해줍니다!");
		add(2, 23);
		add(29, 1);
	}

}
