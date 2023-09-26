package w0926;

public class ContineTest {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='n') {
				continue;
			}
			n++;
		}
		System.out.println("문자에서 발견된 n의 개수는... "+n);
		System.out.println(s.length());
	}

}
