package in.theyachtclub.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import in.theyachtclub.automation.pom.driver.BaseClass;

public class HomePage {
	
	By linkLearnSailing = By.linkText("LEARN SAILING");
	By linkQuickExp = By.linkText("quick experiences");
	By linkTest = By.cssSelector("#mainNavigation a");
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToLearnSailing() {
		driver.findElement(linkLearnSailing).click();
	}

	public void NavigateToQuickExp() {
		driver.findElement(linkQuickExp).click();
	}

	public void m1() {
		driver.findElement(linkTest).click();
	}
}
