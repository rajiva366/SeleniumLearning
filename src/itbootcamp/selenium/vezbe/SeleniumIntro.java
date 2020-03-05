package itbootcamp.selenium.vezbe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro {

	public static void main(String[] args) {

		// povezivanje drajvera za otvaranje browser-a sa projektom
		// value se izvlaci iz path gde je driver za chrome i dodaje ime drivera
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
//		za maksimiziranje prozora browsera: manage je interface
		driver.manage().window().maximize();
//		get je metoda za upis URL
		driver.get("https://www.google.com/");

//		za slanje na neki sledeci sajt
		driver.navigate().to("https://www.youtube.com/");
		
//		vracanje na prethodnu
//		driver.navigate().back();
		
//	refresovanje	
//		driver.navigate().refresh();
		
//		forward
//		driver.navigate().forward();
		
//		ubacivanje teksta pa klik na enter ili klik na lupu
//		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).sendKeys("Sport");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("search-icon-legacy")).click();
		
		
		
		
		

	}

}
