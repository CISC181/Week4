package CISC181.Week4.Package3.ComplexComparatorSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

 

public class RectangleTest {


	
	@Test
	public void RectangleWidthSort()
	{
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		
		for (int i = 0; i<10; i++)
		{
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			recs.add(new Rectangle(iWidth, iLength));
			
		}
		
		System.out.println("*****************************************");
		System.out.println("Unsorted rectangles");
		PrintRectangles(recs);
		Collections.sort(recs, new SortByWidthLength()); 
		System.out.println("Sorted rectangles");
		PrintRectangles(recs);
		System.out.println("*****************************************");
	}
	
	private static void PrintRectangles(ArrayList<Rectangle> recs)
	{
		for (Rectangle r: recs)
		{
			System.out.println(r.toString());
		}
	}

}

