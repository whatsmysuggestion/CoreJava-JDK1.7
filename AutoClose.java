import java.io.*;
public class AutoClose {

	public static void main(String[] args) 
	{
	
		try{
			
			FileWriter fr=new FileWriter("test.txt");
			fr.write("Testing Code");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
