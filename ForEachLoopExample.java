import java.util.*;
public class ForEachLoopExample {

	public static void main(String[] args) {
 
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		
		for (Object res : al) 
		{
			
			System.out.println((String)res);
		}
		
		

	}

}
