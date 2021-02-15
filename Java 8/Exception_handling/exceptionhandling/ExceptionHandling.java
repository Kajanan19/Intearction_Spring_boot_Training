package exceptionhandlingkrish;

public class ExceptionHandling {
	
	String model;
	
	public void print(int numberOfCopies) {
		if(numberOfCopies<=0) {
			throw new IllegalArgumentException("Number of prints should be more than zero");
		}else {
		for(int i=numberOfCopies;i!=0;i--) {
			System.out.println("Printing Copy: "+i);
		}
		
		}
	}

}
