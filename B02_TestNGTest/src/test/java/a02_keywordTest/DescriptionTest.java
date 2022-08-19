package a02_keywordTest;

import org.testng.annotations.Test;

public class DescriptionTest {
	@Test(priority = 1,description = "Customer Should register")
	public void registerTest() {
		System.out.println("register Test");
	}
	@Test(priority = 2,description = "Customer Should login")
	public void loginTest() {
		System.out.println("login Test");
		System.out.println(1/0);
	}
	@Test(priority = 3,description = "Customer Should able to add to cart")
	public void addToCartTest() {
		System.out.println("add to cart Test");
	}
	@Test(priority = 4,description = "Customer Should place order ")
	public void placeorder() {
		System.out.println("place order");
	}
}