package a01_annotationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	@Test(dataProvider = "login")
	public void login(String username, String pwd) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("http://djangovinoth.pythonanywhere.com/login/");
		System.out.println(java.time.LocalTime.now());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@class='btn btn-outline-info']")).click();
		Thread.sleep(3000);
		driver.close();
}
	@DataProvider(name="login")
	public Object[][] validCredentials(){		//method creating
		Object[][] l= new Object[2][2];		
		l[0][0]="mmurali@91";
		l[0][1]="mkumudha@7";
		
		l[1][0]="Test";
		l[1][1]="test123";
		return l;
		}
}