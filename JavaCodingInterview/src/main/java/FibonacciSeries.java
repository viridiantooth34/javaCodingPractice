
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 0;
		int n = 9;
		int arr[] = new int[n];
		int n3 = 0;
		int n1 = 0, n2 = 1;

		System.out.print(n1 + " " + n2);
		// int series = 1;
		for (int i = 2; i < n; i++) {

			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			n3=0;

		}

		//System.out.println(arr[n-1]);
	}

}
// 1 1 2 3