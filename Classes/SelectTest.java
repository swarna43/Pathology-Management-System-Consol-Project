package  Classes;
import Interfaces.*;
import java.util.Scanner;
import java.lang.*;

public class SelectTest
{
	protected int size;
	protected String fullName;
	protected String age;
	protected String gender;
	protected String bloodGroup;
	protected String phoneNumber;
	protected String email;
	protected String address;
	
	protected String showTest[] = new String [size];
	
	public void setFullName(String fullName)
	 {
		 this.fullName=fullName;
	 }
    public void setAge(String age)
	 {
		 this.age=age;
	 }
	public void setGender(String gender){
		this.gender=gender;
	 }
	public void setBloodGroup(String bloodGroup)
	{
		this.bloodGroup=bloodGroup;			 
    }
  
	public void setPhoneNumber(String phoneNumber)
	 {
		 this.phoneNumber=phoneNumber;
	 }
	public void setEmail(String email)
	 {
		 this.email=email;
	 }
	public void setAddress(String address)
	 {
		 this.address=address;
	 }
		 
	 
	 
	public String getFullName( )
	 {
		return fullName;
	 }
    public String getAge( )
	 {
		return age;
	 }
	 public String getGender()
	 {
		 return gender;
	 }
	 public String getBloodGroup()
	 {
		 return bloodGroup;
	 }
   
	
	public String getPhoneNumber()
	 {
		 return phoneNumber;
	 }
	public String getEmail()
	 {
		 return email;
	 }
	public String getAddress()
	 {
		 return address;
	 }
	 
	
	public void setSize(int size){
		this.size=size;
		System.out.println("Size"+size);
		
	}
	
	public void setArray(String[] showTest){
		this.showTest=showTest;
		
	}
	public String[] getArray(){
		
		//String showTest1[] = new String [size];
		for(int j = 0; j<size; j++)
			{
			   //showTest1[j]=showTest[j];
			  // System.out.println(showTest1[j]);
		return showTest;
			}
			return showTest;
		
	}
	
	
}			