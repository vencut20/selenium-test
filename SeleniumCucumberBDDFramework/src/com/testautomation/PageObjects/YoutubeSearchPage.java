package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeSearchPage 
{
	WebDriver driver;
	
	public YoutubeSearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME,using="search_query")
	public WebElement SearchTextbox;
	
	@FindBy(how=How.CSS,using="#search-icon-legacy > .style-scope:nth-child(1)")
	public WebElement SearchButton;
	
/*	@FindBy(how=How.ID,using="search")
	public WebElement SearchTextbox;
	
	@FindBy(how=How.CSS,using="#search-icon-legacy")
	public WebElement SearchButton;*/
	
	public void NavigateToResultPage(String searchString)
	{
		WebDriverWait wait = new WebDriverWait(driver, 12000);
		wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
		SearchTextbox.sendKeys(searchString);
		SearchButton.click();
	}
	

}
