package exceptionhandlingkrish;

public class BubbleupException {
	
	public void print(int numberOfCopies) {
		
		validatreCopies(numberOfCopies);
		
		for(int i=numberOfCopies;i!=0;i--) {
			System.out.println("Print copies: "+i);
		}
	}
	
	//Bubble up
	public void validatreCopies(int numberOfcopies) {
		if(numberOfcopies<=0) {
			throw new IllegalArgumentException("Number of copies should be greater than zero");
		}
	}
}
