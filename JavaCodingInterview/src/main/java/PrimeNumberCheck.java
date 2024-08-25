
public class PrimeNumberCheck {

	public static void main(String[] args) {

		boolean bool = false;
		int n = 11;
		if (n == 0 || n == 1) {
			bool = false;
		}

		else if (n == 2) {
			bool = true;
		}

		else {
			for (int i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					bool = true;
				} else {
					bool = false;
				}
			}
		}

		System.out.println(bool);
	}
}
