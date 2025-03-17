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
		originalDate.setDate(1,2,2022);
		assertEquals(new Date(1,2,2022),originalDate);
	}
	
	@Test
	public void testSetDate3() {
		Date originalDate = new Date(12,31,2027);
		originalDate.setDate(9,6,2020);
		assertEquals(new Date(9,6,2020),originalDate);
	}

}
