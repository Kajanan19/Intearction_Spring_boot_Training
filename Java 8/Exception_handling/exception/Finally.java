package exception;
import java.io.File;
import java.io.IOException;
public class Finally {
	public static void main(String[] args) {
		int[] arr=new int[3];
		
		try {
			System.out.println("Access element three:"+arr[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception thrown"+e);
		}
		finally {
			arr[0]=6;
			System.out.println("First element value"+arr[0]);
		}
	}

}
