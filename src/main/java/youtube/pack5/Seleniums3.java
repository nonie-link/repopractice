package youtube.pack5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniums3 {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/");
		
		driver.findElement(By.cssSelector("a[href$='inner/']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("spinner")).sendKeys("10");
		
		driver.findElement(By.id("getvalue")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
		
		
	}

}
