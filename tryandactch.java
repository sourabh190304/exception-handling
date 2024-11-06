package exception_handling;

public class tryandactch {
	public static void main(String[] args) {
		System.out.println("login");
		try {	System.out.println("add  product"+10/0);
		}
		catch(ArithmeticException AE) {
			System.out.println(AE);
			System.out.println("not by / zero");
		}
		System.out.println("add to cart");
		System.out.println("payment");
	}

}
