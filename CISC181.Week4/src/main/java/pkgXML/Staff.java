package pkgXML;

import java.util.Date;

public class Staff extends Employee {

	 private String Title;

	   public Staff(String title){
	        this.Title = title;
	    }

	    public void setTitle(String title){
	        this.Title = title;
	    }
	    public String getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			String Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}
