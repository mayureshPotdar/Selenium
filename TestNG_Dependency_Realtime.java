package TestNG_Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Dependency_Realtime {
	
		WebDriver driver;
	
		@BeforeSuite
		public void test1() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MAYURESH\\eclipse-workspace\\TestNG\\Utility_Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
			
		}
		
		@BeforeTest
		public void test2() {
			
		}
		
		@BeforeClass
		public void test3() {
			
		}
		
		@BeforeMethod
		public void test4() {
			
		}
		
		@Test(dependsOnMethods={"testS3","testS2"})
		public void testS1() {
			WebElement button = driver.findElement(By.xpath("//*[@id=\"Button1\"]"));
			button.click();
		}
		
		@Test
		public void testS2() {
			WebElement box1 = driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
			box1.sendKeys("Password");
		}
		
		@Test
		public void testS3() {
			WebElement box2 = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
			box2.sendKeys("confirmedPassword");
		}
		
		@AfterMethod
		public void test5() {
			
		}
		
		@AfterClass
		public void test6() {
			
		}
		
		@AfterTest
		public void test7() {
			
		}
		
		@AfterSuite
		public void test8() {
			
		}
}
