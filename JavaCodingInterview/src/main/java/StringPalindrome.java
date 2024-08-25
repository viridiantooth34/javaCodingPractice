
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "dasdad";
		boolean result = true;
		for (int i = 0; i < input.length() / 2; i++) {
			if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
				result = false;
				break;
			}

		}
		//result = true;
		System.out.println(result);
	}

}
