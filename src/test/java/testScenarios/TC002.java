package testScenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class TC002 {
	
	public WebDriver driver = null;
	
	@BeforeClass
	@Parameters({"URL"})
	public void setUp(String URL) {
		
		System.out.println("Test..........**********");
		System.out.println("##### Starting Chrome Browser ############");
       // ChromeOptions opt = new ChromeOptions();
       // opt.setBrowserVersion("116.0.5845.96");
        //opt.addArguments("--remote-allow-origins=*");
        //WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/CD/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        System.out.println("Browser Launched Successfully");
		
	}
	
	@Test()
	public void test_the_apllication() {
		
		System.out.println("Quiting the Browser");
        driver.quit();
	}
	
	
	@Test
	public void A_() {
		System.out.println("This is test A_");
	}
	
	
	
	
	
	
	
	
	

}
