package exception_handling;

public class finally_in_EH {
	public static void main(String[] args) {
		
		//files,datbase.JSON,API,Scanner
		//connection open
		//connection close
		
		System.out.println("id pass to data base");
		try 
		{
			System.out.println("data reading / data processing "+10/0);
		}catch (ArithmeticException E)
		{
			System.out.println(E);
		}finally {
			System.out.println("close the data base");
		}
	}
}
