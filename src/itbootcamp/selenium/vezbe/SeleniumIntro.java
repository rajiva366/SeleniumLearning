package itbootcamp.selenium.vezbe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro {

	public static void main(String[] args) {

		// povezivanje drajvera za otvaranje browser-a sa projektom
		// value se izvlaci iz path gde je driver za chrome i dodaje ime drivera
		
//		apsolutna putanja (krece od sistema) dole:    a relativne putanje idu iz projekta driver za chrome se uvlaci u projekat (prevlacenjem .exe fajla gde je driver za chrome tako da ga prevucemo u projekat u eclipse
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
//	relativna putanja - krece od projekta:
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resourses/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
//		za maksimiziranje prozora browsera: manage je interface
		driver.manage().window().maximize();
//		get je metoda za upis URL
		driver.get("https://www.google.com/");
		
//		uzeti title adrese
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		/*
		 * title moze i ovako:
		 * System.out.println(driver.getTitle());
		 */
		

		
//		za slanje na neki sledeci sajt
		driver.navigate().to("https://www.youtube.com/");
		title=driver.getTitle();
		System.out.println(title);
		
//		vracanje na prethodnu
//		driver.navigate().back();
		
//	refresovanje	
//		driver.navigate().refresh();
		
//		forward
//		driver.navigate().forward();
		
//		ubacivanje teksta pa klik na enter ili klik na lupu
//		driver.findElement(By.id("search")).click();
//		driver.findElement(By.id("search")).sendKeys("Sport");
//		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("search-icon-legacy")).click();
		
//		posto su lokatori deo html koji je deo web elementa ovo gore moze preko web elementa:
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("Sport");
//		search.sendKeys(Keys.ENTER);
		
		WebElement searchLupa = driver.findElement(By.id("search-icon-legacy"));
		searchLupa.click();
		
//		zatvaranje samo poslednjeg prozora koji je otvoren 
//		driver.close();
		
//		zatvaranje sve prozore koji su otvoreni a ticu se jednog scenarija
		//driver.quit();
		
		

	}

}
