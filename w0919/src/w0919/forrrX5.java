package w0919;

public class forrrX5 {

	public static void main(String[] args) {
		int num, nu;
		
		System.out.println("구구단 5단이오");
		
		for(num = 1; num < 10; num++) {
			System.out.print("5 X "+num+" = "+5*num);
			if (num%3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
		}
		System.out.print("\n\n");
	}

}
