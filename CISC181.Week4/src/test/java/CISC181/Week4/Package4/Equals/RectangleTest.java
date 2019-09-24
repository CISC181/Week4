package CISC181.Week4.Package4.Equals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {

	@Test
	public void RectangleEqual() {
		
		Rectangle rec1 = new Rectangle(10,20);
		Rectangle rec2 = new Rectangle(10,20);
		
		assertTrue(rec1.equals(rec2));
	}

}

