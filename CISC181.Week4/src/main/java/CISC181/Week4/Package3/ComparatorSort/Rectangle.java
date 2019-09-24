package CISC181.Week4.Package3.ComparatorSort;

import java.util.Comparator;

public class Rectangle   {

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
	
}
class SortByWidth implements Comparator<Rectangle> {
	public int compare(Rectangle a, Rectangle b) {
		return a.getiWidth() - b.getiWidth();
	}
}