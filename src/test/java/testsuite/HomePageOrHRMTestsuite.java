package testsuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePageOrHRM;
import page.LoginPage_ORHRM;

public class HomePageOrHRMTestsuite {
	/*@Given("Se connecter avec des identifiants valides")
	public void se_connecter_avec_des_identifiants_valides() throws Exception {
		LoginPage_ORHRM	page = new LoginPage_ORHRM();
		page.access_loginpage();
		page.use_credantials("Admin", "admin123");
	}*/

	
	@When("Cliquer sur le le bouton {string}")
	public void cliquer_sur_le_le_bouton(String string) {
		HomePageOrHRM page = new HomePageOrHRM();
		page.cliquer_menu(string);
	}

	@Then("Se rediriger vers la page {string}")
	public void se_rediriger_vers_la_page(String string) {
		HomePageOrHRM page = new HomePageOrHRM();
		page.verify_menu(string);
	}

}
