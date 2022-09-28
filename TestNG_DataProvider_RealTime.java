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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider_RealTime {
	public class TestNG_DataProvider {
		
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
			//driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.get("https://demo.automationtesting.in/Register.html");
		}
		
		@DataProvider(name="TestData")
		public Object[][] testData()
		{
			return new Object[][]
					{
				{"123","987"},
				{"ABC","PQR"},
				{"XYZ","RST"}
					};
		}
		
		@Test(dataProvider="TestData")
		public void dataTest(String name,String surname)
		{
			WebElement firstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
			firstName.sendKeys(name);
			
			WebElement lastName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
			lastName.sendKeys(surname);
		}
		
		
		
		@AfterMethod
		public void test5() {
			driver.navigate().refresh();
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
}}
