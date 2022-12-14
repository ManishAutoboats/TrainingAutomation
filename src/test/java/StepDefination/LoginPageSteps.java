package StepDefination;

import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	LoginPage login=new LoginPage();
	
	
	@When("use login with valid details")
	public void useLoginWithValidDetails() {
		login.useLoginWithValidDetails();
		
	}
	
	
	
	
	@And("user clicks on PersonIcon and Navigate to the Login Page")
	public void userClicksOnPersonIconAndNavigateToTheLoginPage() {
		login.userclicksOnPersonIconAndNavigateToTheLoginPage();
		
		
	}

}
