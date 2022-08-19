package homeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	@Test
	public void a() throws IOException{
	WebDriverManager.chromedriver().setup();	// to open drive
	WebDriver driver = new ChromeDriver();		
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("amazon"+Keys.ENTER);
	driver.findElement(By.xpath("//h3[@ class='LC20lb MBeuO DKV0Md']")).click();
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	driver.findElement(By.id("ap_email")).sendKeys("mmuralicse44@gmail.com"+Keys.ENTER);
	driver.findElement(By.id("ap_password")).sendKeys("mkumudha@7"+Keys.ENTER);
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 11"+Keys.ENTER);
	
	File f= new File("C:\\Users\\SysSoft\\workspace\\B01_WebDriver\\src\\test\\resources\\redmi note 11.xlsx");		
	FileInputStream g= new FileInputStream(f);
	XSSFWorkbook h= new XSSFWorkbook(g);
	XSSFSheet s=h.getSheet("Sheet3");
	
	String a= s.getRow(0).getCell(0).getStringCellValue();
	System.out.println(a);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(a+Keys.ENTER);
	driver.close();
}}
 

