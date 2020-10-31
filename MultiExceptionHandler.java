
public class MultiExceptionHandler {
	public static void main(String[] args) {
		int a[]=new int[20];		
		try{
			
			a[0]=10;
			a[1]=2;
			a[4]=a[0]/a[24];
			System.out.println("Result Is"+a[4]);
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException  ae)
		{
		System.out.println("Error Occured"+ae);
					}		
	}
}
