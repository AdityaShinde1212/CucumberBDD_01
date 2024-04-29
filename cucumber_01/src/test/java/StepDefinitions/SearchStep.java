package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {

	public static WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	@And("user is on google serch page")
	public void user_is_on_google_serch_page() {

		driver.get("https://www.google.com");

	}

	@When("user enters a text in serach box")
	public void user_enters_a_text_in_serach_box() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("OrangeHRM demo");

	}

	@And("clicks on serach button")
	public void clicks_on_serach_button() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("user navigates to serach result")
	public void user_navigates_to_serach_result() {

		driver.getPageSource().contains("Rest PAssword");
		driver.close();
		driver.quit();

	}

}
