package testsuite;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage_ORHRM;

public class Login_OrHRMTestsuite {
	@When("user enter correct username {string} and correct password {string}")
	public void user_enter_correct_username_and_correct_password(String usernamevalid, String passwordvalid) throws Exception {
		LoginPage_ORHRM page = new LoginPage_ORHRM();
		page.use_credantials(usernamevalid, passwordvalid);
	}

	@Then("user is directed to home page containing {string}")
	public void user_is_directed_to_home_page_containing(String verif_S) {
		LoginPage_ORHRM page = new LoginPage_ORHRM();
		page.verify_success(verif_S);
	}

	@When("user enter wrong username {string} and correct password {string}")
	public void user_enter_wrong_username_and_correct_password(String string, String string2) throws Exception {
		LoginPage_ORHRM page = new LoginPage_ORHRM();
		page.use_credantials(string, string2);
	}

	@Then("an error message is out containing {string}")
	public void an_error_message_is_out_containing(String string) {
		LoginPage_ORHRM page = new LoginPage_ORHRM();
		page.verify_failure(string);
	}
}
