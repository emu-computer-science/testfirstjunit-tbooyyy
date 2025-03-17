import static org.junit.Assert.*;

import org.junit.Test;

public class DateAddDaysTest {
	
	@Test
	public void staysInMonth() {
		Date originalDate = new Date("January",1,2025);
		originalDate.addOneDay();
		assertEquals(new Date("January",2,2025),originalDate);
	}
	
	@Test
	public void staysInMonth2() {
		Date originalDate = new Date("May",20,2025);
		originalDate.addOneDay();
		assertEquals(new Date("May",21,2025),originalDate);
	}
	
	@Test
	public void crossesMonthBoundary() {
		Date originalDate = new Date("May",31,2025);
		originalDate.addOneDay();
		assertEquals(new Date("June",1,2025),originalDate);
	}
	
	@Test
	public void crossesMonthBoundary2() {
		Date originalDate = new Date("November",30,2025);
		originalDate.addOneDay();
		assertEquals(new Date("December",1,2025),originalDate);
	}
	
	@Test
	public void crossesMonthBoundary3() {
		Date originalDate = new Date("August",31,2025);
		originalDate.addOneDay();
		assertEquals(new Date("September",1,2025),originalDate);
	}
	
	@Test
	public void crossesYearBoundary() {
		Date originalDate = new Date("December",31,2025);
		originalDate.addOneDay();
		assertEquals(new Date("January",1,2026),originalDate);
	}
	
}
