
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int input = 14356;
		int arr[] = { 12, 3, 5, 2, 6 };
		int lengthOfArray = arr.length;
		// arr[]= {1,3,5,2,6};
		// input.split(input);

		// StringBuffer sb = new StringBuffer(input);

		for (int i = 0; i < lengthOfArray; i++) {
			// arr[i]= Character.toString(input.charAt(i));
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");

		for (int i = 0; i < lengthOfArray; i++) {
			for (int j = 0; j < lengthOfArray-i-1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
					//System.out.println(j);
				}

			}

		}

		for (int i = 0; i < lengthOfArray; i++) {
			System.out.println(arr[i]);
		}
	}
}
