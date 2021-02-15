package exceptionhandlingkrishchkuck;

public class CheckedAndUncheckedRuntime {
	
	public void print(int numberOfCopies) {
		if(numberOfCopies<=0) {
			throw new ExtendsRutimeException("Number of copies must be greater than zero");
		}else {
			for(int i=numberOfCopies;i != 0; i--) {
				System.out.println("Print Copies: "+i);
			}
		}
	}

}
