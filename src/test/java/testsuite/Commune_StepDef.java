package testsuite;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import page.LoginPage_ORHRM;

public class Commune_StepDef {
	//@Given("admin is on login page orangehrm")
	//public void admin_is_on_login_page_orangehrm() {
	//LoginPage_ORHRM	page = new LoginPage_ORHRM();
	//page.access_loginpage();
	//} 
	
	@Given("Se connecter avec des identifiants valides")
	public void se_connecter_avec_des_identifiants_valides() throws Exception {
		Config.driver = new ChromeDriver();
		Config.confChrome();
		Config.maxWind();
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		LoginPage_ORHRM	page = new LoginPage_ORHRM();
		//page.access_loginpage();
		page.use_credantials("Admin", "admin123");
	}

}
