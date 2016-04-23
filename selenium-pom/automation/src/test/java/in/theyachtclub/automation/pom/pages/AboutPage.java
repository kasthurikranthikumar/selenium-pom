package in.theyachtclub.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import in.theyachtclub.automation.pom.driver.BaseClass;

public class AboutPage {
	private WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToHowItsStarted() {
		driver.findElement(By.linkText("How it all started")).click();
	}

	public void NavigateToDignity() {
		driver.findElement(By.linkText("Dignity Through Sports-CSR")).click();
	}
}
