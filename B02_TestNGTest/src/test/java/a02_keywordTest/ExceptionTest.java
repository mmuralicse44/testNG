package a02_keywordTest;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void myTest(){
		System.out.println(1/0);
			}
}
