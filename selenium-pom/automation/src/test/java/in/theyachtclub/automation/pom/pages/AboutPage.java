package in.theyachtclub.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import in.theyachtclub.automation.pom.driver.BaseClass;

public class AboutPage {
	By linkHowToStart = By.linkText("How it all started");
	By linkToDignity = By.linkText("Dignity Through Sports-CSR");
			
	private WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToHowItsStarted() {
		driver.findElement(linkHowToStart).click();
	}

	public void NavigateToDignity() {
		driver.findElement(linkToDignity).click();
	}
}
