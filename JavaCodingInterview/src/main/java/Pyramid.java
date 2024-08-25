
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}
			for (int l = 2; l <= i; l++) {

				System.out.print("*");
			}

			System.out.println("\n");

		}

		// System.out.println("hi");

	}

}
