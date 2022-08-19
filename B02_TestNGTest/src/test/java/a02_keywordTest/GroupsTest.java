package a02_keywordTest;

import org.testng.annotations.Test;

public class GroupsTest {

		@Test(groups={"sanity","Regression"})
		public void Test1()	{
			System.out.println("Test1");
		}
		@Test(groups={"sanity","Regression"})
		public void Test2()	{
			System.out.println("Test2");
		}		
		@Test(groups="Regression")
		public void Test3()	{
			System.out.println("Test3");
		}		
		@Test(groups="Regression")
		public void Test4()	{
			System.out.println("Test4");
		}				
		@Test(groups="Regression")
		public void Test5()	{
			System.out.println("Test5");
		}
		
}
