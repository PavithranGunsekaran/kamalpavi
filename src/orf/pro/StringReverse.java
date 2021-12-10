package orf.pro;

public class StringReverse {

	public static void main(String[] args) {
		String s = "1997Pavish@gmailcom";
		int u = 0;
		int l = 0;
		int d = 0;
		int sp = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				u++;

			} else if (Character.isLowerCase(c)) {

				l++;
			} else if (Character.isDigit(c)) {
				d++;

			} else {
				sp++;
			}
		}
		System.out.println("uppercase---"+u);
		System.out.println("lowercase---"+l);
		System.out.println("digit---"+d);
		System.out.println("special character---"+sp);
	}
}