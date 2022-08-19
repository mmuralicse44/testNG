package a01_annotationTest;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount = 3)
	public void myTest(){
		System.out.println("my test");
	}
	@Test(invocationCount = 0)		//not considered
	public void myzeroTest(){
		System.out.println("my zero test");
	}
}
