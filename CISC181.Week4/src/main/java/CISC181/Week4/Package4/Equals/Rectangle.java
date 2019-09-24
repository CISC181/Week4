package CISC181.Week4.Package4.Equals;

import java.util.Objects;

public class Rectangle   {

	private int ID;
	private int iWidth;
	private int iLength;

	public Rectangle(int iWidth, int iLength) {
		super();
		this.ID = Objects.hash(this.iLength, this.iWidth);
		this.iWidth = iWidth;
		this.iLength = iLength;
	}

	public int area() {
		return iWidth * iLength;
	}


	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	
	public int getID() {
		return ID;
	}
 
	
    @Override
    public int hashCode() 
    {     	
        return this.ID; 
    } 

	@Override
	public boolean equals(Object obj) {
		
        if (obj == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Rectangle or not 
          "null instanceof [type]" also returns false */
        if (!(obj instanceof Rectangle)) { 
            return false; 
        } 
          
        // typecast o to Rectangle so that we can compare data members  
        Rectangle rec = (Rectangle) obj; 
          
        // Compare the data members and return accordingly  
        return Double.compare(this.getiLength(), rec.getiLength()) == 0
                && Double.compare(this.getiWidth(), rec.getiWidth()) == 0; 
	}
	
	
	
}