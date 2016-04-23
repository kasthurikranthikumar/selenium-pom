package in.theyachtclub.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import in.theyachtclub.automation.pom.driver.BaseClass;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToLearnSailing() {
		driver.findElement(By.linkText("LEARN SAILING")).click();
	}

	public void NavigateToQuickExp() {
		driver.findElement(By.linkText("quick experiences")).click();
	}

	public void m1() {
		driver.findElement(By.cssSelector("#mainNavigation a")).click();
	}
}
