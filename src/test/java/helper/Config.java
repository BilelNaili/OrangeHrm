package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	public static WebDriver driver;
	public static void confChrome() {System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");}
	public static void maxWind() {driver.manage().window().maximize();}
	public static void attente (int s) {driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));}
	public static void quitWindow() {driver.quit();}
}
