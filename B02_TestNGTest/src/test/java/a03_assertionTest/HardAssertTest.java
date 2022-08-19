package a03_assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	
	@Test
	public void validateAssert(){
		//Assert.assertEquals(driver.getTitle(), "Dashboard");
		Assert.assertEquals(false, false);
		System.out.println("1st assertion completed");
		Assert.assertEquals(true, false);
		System.out.println("2nd assertion completed");
		Assert.assertEquals("Test", "Test");
	}
	
	@Test
	public void validate(){
		System.out.println("Run aagum");
	}

	
}
