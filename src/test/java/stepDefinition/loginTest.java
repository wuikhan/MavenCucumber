package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginTest {

	@Given("^Open firefox browser and start application$")
	public void open_firefox_browser_and_start_application() {
		System.out.println("This is cucumber ");
	}

	@When("^I enter \"(.*?)\" and \"(.*?)\"$")
	public void i_enter_and(String arg1, String arg2) {
		System.out.println("This is cucumber ");
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
		System.out.println("This is cucumber ");
		System.out.println("This is cucumber ");
		System.out.println("This is cucumber ");
		System.out.println("This is cucumber ");
		System.out.println("This is cucumber ");
	}

}
