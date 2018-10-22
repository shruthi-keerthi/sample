package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;

	@Given("^when I am in homepage$")
	public void when_I_am_in_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shruthi Keerthi\\Documents\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		// Logging in as a guest and selecting the product and ordering the product
		driver.manage().window().maximize();
		driver.get("https://tuclothing.sainsburys.co.uk/");
	}

	@When("^I enter valid search$")
	public void i_enter_valid_search() throws Throwable {
		driver.findElement(By.cssSelector("#search")).sendKeys("bags");
	}

	@When("^select search button$")
	public void select_search_button() throws Throwable {
		driver.findElement(By.cssSelector(".searchButton")).click();
	}

	@Then("^I should see search results$")
	public void i_should_see_search_results() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter invalid search$")
	public void i_enter_invalid_search() throws Throwable {
		driver.findElement(By.cssSelector("#search")).sendKeys("ajghggruk");
	}

	@Then("^I should see error message$")
	public void i_should_see_error_message() throws Throwable {

	}

}
