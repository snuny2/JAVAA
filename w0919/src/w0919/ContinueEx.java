package w0919;

public class ContinueEx {

	public static void main(String[] args) {
		int n;
		for(n=1;n<+10;n++) {
			if (n%2==1) {
				continue;
			}
			System.out.print(n+"\t");
		}
		System.out.println("\n짝수만 출력이 됬군요!");
	}

}
