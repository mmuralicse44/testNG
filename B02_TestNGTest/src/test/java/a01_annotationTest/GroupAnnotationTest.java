package a01_annotationTest;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupAnnotationTest {
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeGroups(groups="vcentry")
	public void beforeGroups(){
		System.out.println("Before groups");
	}	
	@AfterGroups(groups="vcentry")
	public void afterGroups(){
		System.out.println("After groups");
	}	
	@Test(groups={"vcentry","Regression"})
	public void Test1()	{
		System.out.println("Test1");	
	}
	@Test(groups={"vcentry","Regression"})
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
