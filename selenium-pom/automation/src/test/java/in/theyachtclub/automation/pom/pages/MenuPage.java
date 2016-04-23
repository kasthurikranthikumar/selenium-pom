package in.theyachtclub.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import in.theyachtclub.automation.pom.driver.BaseClass;

public class MenuPage  {
	private WebDriver driver;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToHomePage() {
		driver.findElement(By.linkText("Home")).click();
	}

	public void NavigateToAboutPage() {
		driver.findElement(By.xpath(".//*[@id='mainNavigation']/div[2]/label")).click();
	}

	public void NavigateToCorporateProgramsPage() {
		driver.findElement(By.linkText("Corporate Programs")).click();
	}

	public void NavigateToCoursesPage() {
		driver.findElement(By.xpath(".//*[@id='mainNavigation']/div[4]/label")).click();
	}

	public void NavigateToKayakingPage() {
		driver.findElement(By.linkText("Kayaking")).click();
	}

	public void NavigateToSailingPage() {
		driver.findElement(By.xpath(".//*[@id='mainNavigation']/div[6]/label")).click();
	}

	public void NavigateToSafetyPage() {
		driver.findElement(By.linkText("Safety")).click();
	}

	public void NavigateToEventsPage() {
		driver.findElement(By.xpath(".//*[@id='mainNavigation']/div[8]/label")).click();
	}

	public void NavigateToNewsGalleryPage() {
		driver.findElement(By.linkText("News Gallery")).click();
	}
}
