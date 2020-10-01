package youtube.pack5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniums2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/accordion/");
		
		driver.findElement(By.xpath("//a[contains(text(), 'Accordion')]")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("ui-id-3")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = 'Autocomplete']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("tags")).sendKeys("This is a practice match");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = 'Checkboxradio']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("fieldset > label[for = 'radio-1']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = 'Controlgroup']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("car-type-button")).click();
		driver.findElement(By.id("ui-id-3")).click();
		
		int i = 0;
		while(i < 3) {
		driver.findElement(By.cssSelector("input#horizontal-spinner + a[tabindex = '-1'][role = 'button'] > span:first-child")).click();
		i++;
		}
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("a[href$='icker/']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		
		
		 i = 0;
		 
		 while(i < 3) {
		 
		  driver.findElement(By.cssSelector("a[title = 'Next']")).click();
		  i++;
		 }
		 
		 driver.findElement(By.xpath("//td//a[text() = '15']")).click();
		 
		
		
	}

}
