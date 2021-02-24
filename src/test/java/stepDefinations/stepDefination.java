package stepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
public class stepDefination {

	@Given("^User is on NetBanking Landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("Redirect on Login page");
	}

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Login successfully");
	}

	@And("^Cards are displayed are \"([^\"]*)\"$")
	public void cards_are_displayed_are(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

}
