package a02_keywordTest;

import org.testng.annotations.Test;

public class InvocationTimeoutTest {
	@Test(invocationTimeOut = 2000)
	public void myTest() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("MyTest");
	}

}
