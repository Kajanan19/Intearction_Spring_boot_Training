package exceptionhandlingkrishchkuck;

public class CheckedAndUnchecked {
	
	String model;
	
	public void print(int numberOfCopies) throws MyExceptionextendsexception {
		if(numberOfCopies<=0) {
			throw new MyExceptionextendsexception("Number of copies must be greater than zero");
		}else {
			for(int i=numberOfCopies;i != 0; i--) {
				System.out.println("Print Copies: "+i);
			}
		}
	}

}
