package in.theyachtclub.automation.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import in.theyachtclub.automation.pom.driver.BaseClass;

public class MenuPage  {
	By linkHomePage = By.linkText("Home");
	By linkAboutPage = By.xpath(".//*[@id='mainNavigation']/div[2]/label");
	By linkToCorporateProgPage = By.linkText("Corporate Programs");
	By linkCoursesPage = By.xpath(".//*[@id='mainNavigation']/div[4]/label");
	By linkKayaking = By.linkText("Kayaking");
	By linkSailingPage = By.xpath(".//*[@id='mainNavigation']/div[6]/label");
	By linkeSafety = By.linkText("Safety");
	By linkEventsPage = By.xpath(".//*[@id='mainNavigation']/div[8]/label");
	By linkGallery = By.linkText("News Gallery");
	
	private WebDriver driver;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToHomePage() {
		driver.findElement(linkHomePage).click();
	}

	public void NavigateToAboutPage() {
		driver.findElement(linkAboutPage).click();
	}

	public void NavigateToCorporateProgramsPage() {
		driver.findElement(linkToCorporateProgPage).click();
	}

	public void NavigateToCoursesPage() {
		driver.findElement(linkCoursesPage).click();
	}

	public void NavigateToKayakingPage() {
		driver.findElement(linkKayaking).click();
	}

	public void NavigateToSailingPage() {
		driver.findElement(linkSailingPage).click();
	}

	public void NavigateToSafetyPage() {
		driver.findElement(linkeSafety).click();
	}

	public void NavigateToEventsPage() {
		driver.findElement(linkEventsPage).click();
	}

	public void NavigateToNewsGalleryPage() {
		driver.findElement(linkGallery).click();
	}
}
