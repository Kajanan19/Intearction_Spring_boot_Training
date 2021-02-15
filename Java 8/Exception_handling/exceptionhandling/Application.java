package exceptionhandlingkrish;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionHandling exceptionHandling=new ExceptionHandling();
			exceptionHandling.print(1);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.err.println("less than or equal zero copies not allowed");
		}
		
	}

}
