
public class StringRemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi is a good, boy- Rick";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				output = output + input.charAt(i);
			}
		}
		System.out.println(output);
		System.out.println(input.replaceAll(" ", ""));
	}

}
