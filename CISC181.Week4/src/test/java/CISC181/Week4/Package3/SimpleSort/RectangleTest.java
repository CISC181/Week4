package CISC181.Week4.Package3.SimpleSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

 

public class RectangleTest {

	@Test
	public void TestRectangleSort() {
		
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		
		for (int i = 0; i<10; i++)
		{
			int iWidth = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			int iLength = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			recs.add(new Rectangle(iWidth, iLength));
			
		}
		Collections.sort(recs);
		PrintRectangles(recs);
			
	}
	
	
	private static void PrintRectangles(ArrayList<Rectangle> recs)
	{
		for (Rectangle r: recs)
		{
			System.out.println(r.area());
		}
	}

}
