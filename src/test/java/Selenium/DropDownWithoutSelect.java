package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.calculator.net/interest-Calculator.html");
		driver.findElement(By.id("ccompound")).sendKeys("monthly");
driver.close();
//	List<WebElement> allOptions = driver.findElements(By.id("ccompound"));       
//             
//    for(int i = 0; i<=allOptions.size()-1; i++) {
//         
//         
//        if(allOptions.get(i).getText().contains("daily")) {
//             
//            allOptions.get(i).click();
//            System.out.println("clicked");
//            break;
//             
//        }
//    }

}
}
