import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		System.out.print("tesing git trtr");

		
		System.setProperty("webdriver.chrome.driver","D:\\abdulkalam\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.tripproagency.com/");
		driver.findElement(By.id("tripproLoginId")).click();
		driver.findElement(By.id("signUpAccount-Forget")).click();
		driver.findElement(By.id("regFirstName")).sendKeys("testagency999@yaho.com");
	}

}
