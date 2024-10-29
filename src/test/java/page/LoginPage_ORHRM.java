package page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class LoginPage_ORHRM {
	@FindBy (name="username") WebElement user_name;
	@FindBy (xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]") WebElement pass_word;
	@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement btn_login;
	@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p") WebElement verif_fail;
	@FindBy (tagName="h6") WebElement verif_success;
	
	public LoginPage_ORHRM() {PageFactory.initElements(Config.driver, this);} 
	
	public void access_loginpage () {
		Config.driver = new ChromeDriver();
		Config.confChrome();
		Config.maxWind();
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
	}
	public void use_credantials (String x , String y ) throws Exception {
		//Thread.sleep(3000);
		Config.attente(10);
		user_name.sendKeys(x); pass_word.sendKeys(y); btn_login.click();
	}
	public void verify_success (String a) {	Config.attente(2);
		Assert.assertEquals(verif_success.getText(), a); Config.quitWindow();	}
	public void verify_failure (String b) {	Config.attente(2);
		Assert.assertEquals(verif_fail.getText(), b); Config.quitWindow();	}
}
