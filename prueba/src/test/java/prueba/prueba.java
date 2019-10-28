package prueba;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Servicios");
	
	By registerPageLocator = By.xpath("//img[@src=\"https://www.choucairtesting.com/wp-content/uploads/2018/11/Banner-pag-interna.jpg.webp\"]");
	
	By cargoLocator = By.id("main");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(cargoLocator).click();
		
		
	}

}
