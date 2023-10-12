package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {
	public static void main(String[] args) {
		//for empty chrome browser
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		List<WebElement> all=driver.findElements(By.tagName("a"));
		System.out.println(all.size());
		for(WebElement s: all)
		{
			System.out.println(s.getText());
		}
		driver.close();
}
}
