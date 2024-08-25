
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		System.out.println("Before Reverse:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Reverse:");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
