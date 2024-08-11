
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/Automation/Installers/drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.in/");
		 driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("Thor love and thunder official trailer");
		driver.findElement(By.xpath("//ytd-masthead/div[@id='container']/div[@id='center']/ytd-searchbox[@id='search']/button[@id='search-icon-legacy']/yt-icon[1]")).click();
			
		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=\"Marvel Studios' Thor: Love and Thunder | Official Trailer\"]")));
		System.out.println(firstResult.getText());
		firstResult.click();
		Thread.sleep(5000);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);

		//Thread.sleep(6000);
		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
				WebElement secondResult = new WebDriverWait(driver, Duration.ofSeconds(30))
				        .until(ExpectedConditions.elementToBeClickable(By.className("ytp-ad-skip-button-container")));
				secondResult.click();
		
		
		//robot.keyPress(KeyEvent.VK_Z);
	//	robot.keyPress(KeyEvent.VK_ENTER);


		// Print the first result
			//	System.out.println(firstResult.getText());
		//driver.close();
	}
}
