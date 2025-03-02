import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSiginIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        System.out.println("Please solve the Captcha manually...");
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 10 seconds pause (Adjust time as needed)

        // Click Submit after manually entering the Captcha
        driver.findElement(By.cssSelector("button.a-button-text")).click();
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}

}
 