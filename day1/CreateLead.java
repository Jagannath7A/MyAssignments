package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElement(By.id("username")).sendKeys("demosalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jagannath");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jagan");
        driver.findElement(By.name("departmentName")).sendKeys("NonITtoIT");
        driver.findElement(By.className("inputBox")).sendKeys("Welcome to TestLeaf");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jagan7atr@gmail.com");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
	}


}
