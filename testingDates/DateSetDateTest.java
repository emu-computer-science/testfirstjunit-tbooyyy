import static org.junit.Assert.*;

import org.junit.Test;

public class DateSetDateTest {

	@Test
	public void testSetDate() {
		Date originalDate = new Date(5,20,2025);
		originalDate.setDate(6,8,2025);
		assertEquals(new Date(6,8,2025),originalDate);
	}
	
	@Test
	public void testSetDate2() {
		Date originalDate = new Date(6,1,1999);
		originalDate.setDate(1,77,2022);
		assertEquals(new Date(6,1,1999),originalDate); // should remain unchanged
	}
	
	@Test
	public void testSetDate3() {
		Date originalDate = new Date(12,31,2027);
		originalDate.setDate(9,6,2020);
		assertEquals(new Date(9,6,2020),originalDate);
	}
	
	@Test
	public void testSetDate4() {
		Date originalDate = new Date(6,1,1999);
		originalDate.setDate(52,12,2022);
		assertEquals(new Date(6,1,1999),originalDate); // should remain unchanged
	}

}
