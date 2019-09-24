package CISC181.Week4.Package3.SimpleSort;

import java.util.*;

public class Rectangle implements Comparable {

	private int iWidth;
	private int iLength;

	public Rectangle(int iWidth, int iLength) {
		super();
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
	
	@Override
	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		return this.area() - r.area();
	}
	
}
 