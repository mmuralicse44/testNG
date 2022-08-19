package a02_keywordTest;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void registerTest() {
		System.out.println("register Test");
	}
	@Test(priority = 2)
	public void loginTest() {
		System.out.println("login Test");
	}
	@Test(priority = 3)
	public void addToCartTest() {
		System.out.println("add to cart Test");
	}
	@Test(priority = 4)
	public void placeorder() {
		System.out.println("place order");
	}
}