import java.util.regex.*;
public class PatternExample {

	public static void main(String[] args) {
		 
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat=Pattern.compile("Java");
		mat=pat.matcher("Java");
		
		found=mat.matches();
		
		if(found)
			System.out.println("Matches");
		else
			System.out.println("No Match");
		
		mat=pat.matcher("Java 2");
		found=mat.matches();
		
		if(found)
			System.out.println("Matches");
		else
			System.out.println("No Match");
		
		
		
		 
		System.out.println("java".replaceFirst("a","x"));
		System.out.println("java".replaceAll("a","x"));
			
		

	}

}
