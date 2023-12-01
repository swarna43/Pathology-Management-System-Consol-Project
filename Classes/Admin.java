package  Classes;
import java.io.*;
import java.util.*;
import Fileio.*;
import java.io.FileNotFoundException;
import java.io.Console;
public class Admin
{
	private String adminId;
	//private String adminPassword;
    boolean chioce=true;
	
	 
	Scanner input =new Scanner(System.in);	
	File3Admin file3 = new File3Admin();
	

	public void idPassCheek()
	{
		
		while(chioce)	
		{
			
	    System.out.println("        ======================================================");		
		System.out.print("             Enter Your User Name     :_ ");
		adminId = input.next();
		System.out.println("        ======================================================");
		
        System.out.println("        ======================================================");	
		Console console = System.console();
        char[] passArray = console.readPassword("            Enter Your Password     :_");		
		//System.out.print("              ");
		//adminPassword = input.next();
		System.out.println("        ======================================================");
		
		
		if(adminId.equals("TeamB28")&&(new String(passArray).equals("1234")) )
		{
			file3.writeInFile("User Name:"+adminId+"\nPassword: 1234"+" \n\n");
	        System.out.println("                                                            ======================================================");
			System.out.println("                                                                  ================Login Successful=========\n");
			System.out.println("                                                            ======================================================");
			
			chioce=false;
			break;
		}
			
		else
		{
		System.out.println("                          ..................................Invalid User Name OR Password....................................");
		
		System.out.println("                          ......................................please Try Again>>>>..........................................");
	    }
		
		
		}
		
	}
		
		
		
	}

	
