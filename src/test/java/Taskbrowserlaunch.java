import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskbrowserlaunch {
	
	static long start;
	
	static WebDriver driver;
	
		@BeforeClass
		
		public static void browserlaunch() {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\dsp7s\\eclipse-workspace\\ProjectJunit\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		}
		
		@AfterClass
		
		public static void browserquit() {
			
			WebDriver driver = new ChromeDriver();
			
	            driver.quit();
		}
		
		@Before
		
		public void starttime() {
			long start = System.currentTimeMillis();
			System.out.println("before");
		}
		
		@After
		public void endTime() {
			long end = System.currentTimeMillis();
			System.out.println("Totaltime" + (end - start));
			
		}
		
		@Test
		
		public void search() {
			
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Redmi");
		search.submit();
		WebElement fproduct = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]"));
		fproduct.click();
		}

		@Test
		
		public void productname() {
		WebElement Productname = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]"));
		Productname.getText();
		String  Mobilename = Productname.getText();
		System.out.println("product name =" + Mobilename);
		}
		
		@Test
		
		public void gettheproduct()	{
        WebElement fproduct = driver.findElement(By.className("tUxRFH"));
        String mainWindow = driver.getWindowHandle();	        
		}

}
