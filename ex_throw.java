package exception_handling;

public class ex_throw {
	public static void main(String[] args) {
		int prod_qt=51;
		if(prod_qt<=50) {
			System.out.println("in stock");
		}
		else {
			System.out.println("out of stock");
			try {
				throw new outofstock("out of stock");
			}
			catch(Exception e) {
				System.out.println(e);
			}

		}
	}

}
class outofstock extends Exception{
	outofstock(String msg){
		System.out.println(msg);
	}
}

/*
 throw in java 
 public class throW_in_EH {
	public static void main(String[] args) {
		try {
			throw new OutOfStock("product out of stock");
		}
		catch(Exception e ) {
			System.out.println(e);
		}
	}
}
class OutOfStock extends Exception{
	OutOfStock(String msg){
		System.out.println(msg);
	}
}
*/

