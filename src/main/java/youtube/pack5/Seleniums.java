package youtube.pack5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniums {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(ele, 30, 20).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("li > a[href = 'https://jqueryui.com/droppable/']")).click();
		
		driver.switchTo().frame(0);
		
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = 'Resizable']")).click();
		
		driver.switchTo().frame(0);
		
		action.dragAndDropBy(driver.findElement(By.cssSelector("div#resizable > div:nth-child(4)")), 50, 50).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = 'Selectable']")).click();
		
		driver.switchTo().frame(0);
		
		WebElement ele1 = driver.findElement(By.cssSelector("ol#selectable > li:nth-child(1)"));
		
		action.dragAndDropBy(ele1, 0, 70).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = 'Sortable']")).click();
		
		driver.switchTo().frame(0);
		
		action.dragAndDrop(driver.findElement(By.cssSelector("ul#sortable > li:nth-child(1)")), driver.findElement(By.cssSelector("ul#sortable > li:nth-child(6)"))).perform();
		
		
		
		
		
		
		
		
	}

}
