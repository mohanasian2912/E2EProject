package stepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on NetBanking Landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		throw new PendingException();
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		throw new PendingException();
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		throw new PendingException();
	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		throw new PendingException();
	}

}
