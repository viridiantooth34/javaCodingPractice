
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234";

		StringReverse sr = new StringReverse();
		System.out.println(sr.reverseString(str));
		System.out.println(sr.reverseStringUsingStringBuffer(str));

	}

	public String reverseString(String str) {

		String strNew = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strNew = strNew + str.charAt(i);
		}
		return strNew;

	}

	public StringBuffer reverseStringUsingStringBuffer(String str) {

		StringBuffer sb = new StringBuffer(str);
		
		return sb.reverse();

	}
}
