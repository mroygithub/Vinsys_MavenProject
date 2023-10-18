package testScenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class Delete_IT {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Test..........**********");
		System.out.println("##### Starting Chrome Browser ############");
        ChromeOptions opt = new ChromeOptions();
        opt.setBrowserVersion("116.0.5845.96");
        //opt.addArguments("--remote-allow-origins=*");
        //WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "/Users/mithunroy/Downloads/CD/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gamesforthebrain.com/game/checkers/");
        driver.quit();

	}

}
