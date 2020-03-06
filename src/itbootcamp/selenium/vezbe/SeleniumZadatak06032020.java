package itbootcamp.selenium.vezbe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumZadatak06032020 {

	static WebElement pol;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resourses/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement ime, prezime;
		ime= driver.findElement(By.name("firstname"));
		ime.click();
		ime.sendKeys("Ivana");
		
		prezime= driver.findElement(By.name("lastname"));
		prezime.click();
		prezime.sendKeys("Rajcic");
		
		pol = driver.findElement(By.id("sex-1"));
		pol.click();
		
		WebElement godineIskustva = driver.findElement(By.id("exp-5"));
		godineIskustva.click();
		
		WebElement datum = driver.findElement(By.id("datepicker"));
		datum.sendKeys("06/03/2020");
		
		WebElement profesija = driver.findElement(By.id("profession-1"));
		profesija.click();
		
		WebElement alat = driver.findElement(By.id("tool-2"));
		alat.click();
		
		WebElement kontinent = driver.findElement(By.id("continents"));
		kontinent.click();
		kontinent.sendKeys("Europe");
		kontinent.click();
		
		
		WebElement popuni = driver.findElement(By.id("submit"));
		popuni.click();
		
		WebElement link = driver.findElement(By.linkText("Selenium Webdriver Tutorials Series"));
		link.click();
		
		
		
		
		
		
		
		
	}

}
