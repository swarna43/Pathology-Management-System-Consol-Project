package  Classes;
import java.util.*;
import java.io.IOException;

public class Clear
{
	
	public static void clrscr()
	{
		try{
			
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	
}