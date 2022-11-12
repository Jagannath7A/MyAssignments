package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		//setup the path
		WebDriverManager.chromedriver().setup();
         //Launching ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//window maximize
		driver.manage().window().maximize();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click lead
		driver.findElement(By.linkText("Leads")).click();
		//click on creat lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jagannath");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		//dropdown
				WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//create select class
				Select drop1=new Select(source);
				drop1.selectByIndex(2);
				WebElement source1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select drop2=new Select(source1);
				drop2.selectByValue("IND_HEALTH_CARE");
		//click create lead
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
	
	}

}



