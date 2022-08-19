package a02_keywordTest;

import org.testng.annotations.Test;

public class AlwaysRunTest {
	@Test(priority = 1)
	public void registerTest() {
		System.out.println("register Test");
	}
	@Test(priority = 2, dependsOnMethods = "registerTest")
	public void loginTest() {
		System.out.println("login Test");
	}
	@Test(priority = 3, dependsOnMethods= "loginTest")
	public void addToCartTest() {
		System.out.println(1/0);
		System.out.println("add to cart Test");
	}
	@Test(priority = 4, dependsOnMethods="addToCartTest", alwaysRun=true)
	public void placeorder() {
		System.out.println("place order");
	}
}



