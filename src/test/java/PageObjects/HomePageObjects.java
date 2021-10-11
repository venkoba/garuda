package PageObjects;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utils.Waiting;
import principal.PageInitializers;

public class HomePageObjects extends PageInitializers {

	
	JavascriptExecutor js = (JavascriptExecutor)getDriver();
	//getstbtn//
	@FindBy(xpath = "//button[text()='Get Started']")
	private WebElement getstbtn;
	public HomePageObjects click_getsbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(getstbtn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(getstbtn, 15);
	getstbtn.click();
	return this; }
	//impwalbtn//
	@FindBy(xpath = "//button[text()='Import wallet']")
	private WebElement impwalbtn;
	public HomePageObjects click_impwalbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(impwalbtn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(impwalbtn, 15);
	impwalbtn.click();
	return this; }
	//iagreebtn//
	@FindBy(xpath = "//button[text()='I Agree']")
	private WebElement iagreebtn;
	public HomePageObjects click_iagreebtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(iagreebtn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(iagreebtn, 15);
	iagreebtn.click();
	return this; }
	//secrecvryph//
	@FindBy(xpath = "//input[@placeholder='Paste Secret Recovery Phrase from clipboard']")
	private WebElement secrecvryph;
	public HomePageObjects enter_secrecvryph(String value) throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(secrecvryph, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(secrecvryph, 15);
	secrecvryph.sendKeys(value);
	return this; }
	//pwdfield//
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwdfield;
	public HomePageObjects enter_pwdfield(String value) throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(pwdfield, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(pwdfield, 15);
	pwdfield.sendKeys(value);
	return this; }
	//cnfpwd//
	@FindBy(xpath = "//input[@id='confirm-password']")
	private WebElement cnfpwd;
	public HomePageObjects enter_cnfpwd(String value) throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(cnfpwd, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(cnfpwd, 15);
	cnfpwd.sendKeys(value);
	return this; }
	//iagreechkbox//
	@FindBy(xpath = "//div[@class='first-time-flow__checkbox first-time-flow__terms']")
	private WebElement iagreechkbox;
	public HomePageObjects click_iagreechkbox() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(iagreechkbox, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(iagreechkbox, 15);
	iagreechkbox.click();
	return this; }
	//importbtn//
	@FindBy(xpath = "//button[text()='Import']")
	private WebElement importbtn;
	public HomePageObjects click_importbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(importbtn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(importbtn, 15);
	importbtn.click();
	return this; }
	//polywalbtn//
	@FindBy(xpath = "//div[normalize-space(.)='Polygon Wallet']")
	private WebElement polywalbtn;
	public HomePageObjects click_polywalbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(polywalbtn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(polywalbtn, 15);
	polywalbtn.click();
	return this; }
	//metamask//
	@FindBy(xpath = "//span[normalize-space(.)='Metamask']")
	private WebElement metamask;
	public HomePageObjects click_metamask() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(metamask, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(metamask, 15);
	metamask.click();
	return this; }
	//metamaskpwd//
	@FindBy(xpath = "//input[@id='password']")
	private WebElement metamaskpwd;
	public HomePageObjects enter_metamaskpwd(String value) throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(metamaskpwd, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(metamaskpwd, 15);
	metamaskpwd.sendKeys(value);
	return this; }
	//unlockbtn//
	@FindBy(xpath = "//span[text()='Unlock']")
	private WebElement unlockbtn;
	public HomePageObjects click_unlockbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(unlockbtn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(unlockbtn, 15);
	unlockbtn.click();
	return this; }
	//nextbtn//
	@FindBy(xpath = "//button[@role='button']")
	private WebElement nextbtn;
	public HomePageObjects click_nextbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(nextbtn, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(nextbtn, 30);
	nextbtn.click();
	return this; }
	//remlatertbtn//
	@FindBy(xpath = "//button[text()='Remind me later']")
	private WebElement remlatertbtn;
	public HomePageObjects click_remlatertbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(remlatertbtn, 45);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(remlatertbtn, 45);
	remlatertbtn.click();
	return this; }
	//nextbtn1//
	@FindBy(xpath = "//button[@class='button btn-primary']")
	private WebElement nextbtn1;
	public HomePageObjects click_nextbtn1() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(nextbtn1, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(nextbtn1, 15);
	nextbtn1.click();
	return this; }
	//connectbtn//
	@FindBy(xpath = "//button[@class='button btn-primary page-container__footer-button']")
	private WebElement connectbtn;
	public HomePageObjects click_connectbtn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(connectbtn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(connectbtn, 15);
	connectbtn.click();
	return this; }
	//sign1btn//
	@FindBy(xpath = "//button[@class='button btn-secondary btn--large request-signature__footer__sign-button']")
	private WebElement sign1btn;
	public HomePageObjects click_sign1btn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(sign1btn, 15);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(sign1btn, 15);
	sign1btn.click();
	return this; }
	
	//div[contains(text(),'Polygon mainnet')]/following-sibling::div[@class='amount ms-b-16']
	
	@FindBy(xpath = "//div[contains(text(),'Polygon mainnet')]/following-sibling::div[@class='amount ms-b-16']")
	private WebElement mainnetbal;
	public HomePageObjects verify_mainnetbal() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(mainnetbal, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(mainnetbal, 30);
	
	Assert.assertTrue(mainnetbal.isDisplayed(),"Homescreen Not Loaded - POLYGON MAINNET balance not visible");
	
	return this; }
	
	
	//@FindBy(xpath = "//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Deposit']")

	@FindBy(xpath = "//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Deposit']")
	private WebElement depositbtn;
	public HomePageObjects click_depositbtn() throws InterruptedException {
		
		  new Waiting(getDriver()).explicitWaitVisibilityOfElement(depositbtn, 60);
		  new Waiting(getDriver()).explicitWaitElementToBeClickable(depositbtn, 60);
		  depositbtn.click();
		 
		
		/*
		 * Thread.sleep(6000); JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", depositbtn);
		 */
	
	return this; }
	
	@FindBy(xpath = "//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Withdraw']")
	private WebElement withdrawbtn;
	public HomePageObjects click_withdrawbtn() throws InterruptedException {
		
		Thread.sleep(3000);
		 //new Waiting(getDriver()).explicitWaitVisibilityOfElement(withdrawbtn, 60);
		  //new Waiting(getDriver()).explicitWaitElementToBeClickable(withdrawbtn, 60);
		  withdrawbtn.click();
		 
		
		/*
		 * Thread.sleep(6000); JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", depositbtn);
		 */
	
	return this; }
	
	
	@FindBy(xpath = "//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Deposit']")
	private WebElement depositbtn_matic;
	public HomePageObjects click_depositbtn_matic() throws InterruptedException {
		
		  new Waiting(getDriver()).explicitWaitVisibilityOfElement(depositbtn, 60);
		  new Waiting(getDriver()).explicitWaitElementToBeClickable(depositbtn, 60);
		  depositbtn.click();
		 
		
		/*
		 * Thread.sleep(6000); JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", depositbtn);
		 */
	
	return this; }
	
	@FindBy(xpath = "//div[@class='font-caption amount-details col-6 text-right align-self-center']")
	private WebElement avalblbal;
	public HomePageObjects verify_avalblball() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(avalblbal, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(avalblbal, 30);
	
	Assert.assertTrue(avalblbal.isDisplayed(),"ETH - Available Balance NOT Found");
	
	return this; }
	
	@FindBy(xpath = "//input[@class='input-field size--large']")
	private WebElement input_ETH;
	public HomePageObjects input_ETHtokens(String value) throws InterruptedException {
	Thread.sleep(4000);
	input_ETH.click();
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(input_ETH, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(input_ETH, 30);
	input_ETH.sendKeys(value);
	return this; }
	
	
	
	@FindBy(xpath = "//button[normalize-space(.)='Transfer']")
	private WebElement transfer_btn;
	public HomePageObjects click_transfer_btn() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(transfer_btn, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(transfer_btn, 30);
	transfer_btn.click();
	return this; }
	
	
	@FindBy(xpath = "//div[normalize-space(.)='Continue']")
	private WebElement continue1_btn;
	
	public HomePageObjects click_continue1btn() throws InterruptedException {
	Thread.sleep(4000);
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(continue1_btn, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(continue1_btn, 30);
	continue1_btn.click();
	return this; }
	
	

	@FindBy(xpath = "//div[@class='font-body-medium continue-button']")
	private WebElement continue2_btn;
	public HomePageObjects click_continue2btn() throws InterruptedException {
	Thread.sleep(4000);
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(continue2_btn, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(continue2_btn, 30);
	continue2_btn.click();
	return this; }
	
	
	
	@FindBy(xpath = "//button[@class='w-100 m-button nature--primary size--large']")
	private WebElement continue3_btn;
	public HomePageObjects click_continue3btn() throws InterruptedException {
	Thread.sleep(4000);
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(continue3_btn, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(continue3_btn, 30);
	continue3_btn.click();
	return this; }
	
	//button[@class='button btn-default page-container__footer-button']
	
	@FindBy(xpath = "//button[@class='button btn-default page-container__footer-button']")
	private WebElement reject_btn;
	public HomePageObjects click_reject_btn() throws InterruptedException {
	Thread.sleep(10000);
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(reject_btn, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(reject_btn, 30);
	reject_btn.click();
	return this; }
	
	@FindBy(xpath = "//button[normalize-space(.)='Cancel']")
	private WebElement cancel_button_withdrawal;
	public HomePageObjects click_cancel_button_withdrawal() throws InterruptedException {
	Thread.sleep(10000);
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(cancel_button_withdrawal, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(cancel_button_withdrawal, 30);
	cancel_button_withdrawal.click();
	return this; }
	
		
	@FindBy(xpath = "//div[@class='font-caption text-center text-danger mx-auto ps-t-10 ms-b-20']")
	private WebElement denied_trans_msg;
	public HomePageObjects verify_denied_trans_msg(String expected) throws InterruptedException {
		
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(denied_trans_msg, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(denied_trans_msg, 30);
	
	String actual = denied_trans_msg.getText();
	
	
	Assert.assertEquals(actual, expected);
	
	return this; }
	
	@FindBy(xpath = "//img[@class='polygon-logo']")
	private WebElement polygonhomelogo;
	public HomePageObjects click_polygon_logo() throws InterruptedException {
	new Waiting(getDriver()).explicitWaitVisibilityOfElement(polygonhomelogo, 30);
	new Waiting(getDriver()).explicitWaitElementToBeClickable(polygonhomelogo, 30);
	polygonhomelogo.click();
	return this; }
	
	
	@FindBy(xpath="//div[@class='box-header justify-content-center']//span")
	private WebElement confirmDepositPopup_closeButton;
	
	public HomePageObjects clickOnconfirmDepositPopup_closeButton() {
		
		new Waiting(getDriver()).explicitWaitVisibilityOfElement(confirmDepositPopup_closeButton, 30);
		new Waiting(getDriver()).explicitWaitElementToBeClickable(confirmDepositPopup_closeButton, 30);
		confirmDepositPopup_closeButton.click();
		return this;
	}
	
	
	@FindBy(xpath="//span[normalize-space(.)='Back to Wallet']")
	private WebElement backToWalletHomePageLink;
	
	public HomePageObjects clickOnbackToWalletHomePageLink() {
		
		new Waiting(getDriver()).explicitWaitVisibilityOfElement(backToWalletHomePageLink, 30);
		new Waiting(getDriver()).explicitWaitElementToBeClickable(backToWalletHomePageLink, 30);
		backToWalletHomePageLink.click();
		return this;
	}
	
	public HomePageObjects verfiyWalletHomePageIcons() throws InterruptedException {
		
		//support link
		
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//button[normalize-space(.)='Support']"),30);
		getDriver().findElement(By.xpath("//button[normalize-space(.)='Support']")).click();
		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
		Thread.sleep(3000);
		getDriver().switchTo().window(tabs.get(1));
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://support.polygon.technology/support/home");
		getDriver().close();
		getDriver().switchTo().window(tabs.get(0));
		
		//Apps link
		
		//polygon bridge link
				
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//button[normalize-space(.)='Apps']"),30);
		getDriver().findElement(By.xpath("//button[normalize-space(.)='Apps']")).click();
				
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[normalize-space(.)='Polygon Bridge']"),30);
		getDriver().findElement(By.xpath("//div[normalize-space(.)='Polygon Bridge']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://wallet.polygon.technology/bridge");
		clickOnbackToWalletHomePageLink();
			
		
		// Staking link
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//button[normalize-space(.)='Apps']"),30);
		getDriver().findElement(By.xpath("//button[normalize-space(.)='Apps']")).click();
				
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[normalize-space(.)='Staking']"),30);
		getDriver().findElement(By.xpath("//div[normalize-space(.)='Staking']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://wallet.polygon.technology/staking/");
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
				
		
		//Widget Dashboard
		
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//button[normalize-space(.)='Apps']"),30);
		getDriver().findElement(By.xpath("//button[normalize-space(.)='Apps']")).click();
		
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[normalize-space(.)='Widget Dashboard']"),30);
		getDriver().findElement(By.xpath("//div[normalize-space(.)='Widget Dashboard']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://wallet.polygon.technology/widget-dashboard");
		
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		
		//swap for gas
		
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//button[normalize-space(.)='Apps']"),30);
		getDriver().findElement(By.xpath("//button[normalize-space(.)='Apps']")).click();
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[normalize-space(.)='Swap for Gas']"),30);
		getDriver().findElement(By.xpath("//div[normalize-space(.)='Swap for Gas']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://wallet.polygon.technology/swap");
		
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		//Action required notification
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[normalize-space(.)='Action Required']"),30);
		getDriver().findElement(By.xpath("//div[normalize-space(.)='Action Required']")).click();
				
		Thread.sleep(2000);
		Assert.assertTrue(getDriver().findElement(By.xpath("//button[normalize-space(.)='Pending']")).isDisplayed(),"Pending button not displayed");
		Assert.assertTrue(getDriver().findElement(By.xpath("//button[normalize-space(.)='Success']")).isDisplayed(),"Success button not displayed");
		getDriver().findElement(By.xpath("//div[normalize-space(.)='Action Required']")).click();
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		// Eth - deposit , withdraw, send, metamask icon
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Deposit']"),30);
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Deposit']")).isDisplayed(),"ETH Deposit button not displayed");
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Withdraw']")).isDisplayed(),"ETH Withdraw button not displayed");
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../following-sibling::div/button[normalize-space(.)='Send']")).isDisplayed(),"ETH Send button not displayed");
		Actions action= new Actions(getDriver());
		action.moveToElement(getDriver().findElement(By.xpath("//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../../..//div/i[@class='metamask-icon m-icon']")));
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../../..//div/i[@class='metamask-icon m-icon']")).isDisplayed(),"ETH metamask button not displayed");
		
		getDriver().findElement(By.xpath("//div[normalize-space(.)='ETH' and @class = 'token-symbol header-h6']/../../../..//div/i[@class='metamask-icon m-icon']")).click();
		
		Thread.sleep(10000);
		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs2.get(1));
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[span='Ethereum Mainnet']")).isDisplayed(),"ETH Mainnet not opened");
		getDriver().findElement(By.xpath("//button[text()='Cancel']")).click();
		
		
		
		// Matic - deposit, withdraw, send
		getDriver().switchTo().window(tabs2.get(0));
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='MATIC' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Deposit']")).isDisplayed(),"MATIC Deposit button not displayed");
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='MATIC' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Withdraw']")).isDisplayed(),"MATIC Withdraw button not displayed");
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='MATIC' and @class = 'token-symbol header-h6']/../../following-sibling::div/button[normalize-space(.)='Send']")).isDisplayed(),"MATIC Send buttom not displayed");
		action.moveToElement(getDriver().findElement(By.xpath("//div[normalize-space(.)='MATIC' and @class = 'token-symbol header-h6']/../../following-sibling::div/a[normalize-space(.)='Withdraw']"))).build().perform();
		action.moveToElement(getDriver().findElement(By.xpath("//div[normalize-space(.)='MATIC' and @class = 'token-symbol header-h6']/../../following-sibling::div/button[normalize-space(.)='Send']"))).build().perform();
		
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[normalize-space(.)='MATIC' and @class = 'token-symbol header-h6']/../../../..//div/i[@class='metamask-icon m-icon']")).isDisplayed(),"MATIC metamask button not displayed");
		
		getDriver().findElement(By.xpath("//div[normalize-space(.)='MATIC' and @class = 'token-symbol header-h6']/../../../..//div/i[@class='metamask-icon m-icon']")).click();
		
		Thread.sleep(10000);
		 tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs2.get(1));
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[span='Ethereum Mainnet']")).isDisplayed(),"ETH Mainnet not opened");
		getDriver().findElement(By.xpath("//button[text()='Cancel']")).click();
		getDriver().switchTo().window(tabs2.get(0));		
		
		//Pagination
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,250)", "");
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[@class='s-pagination cursor-pointer font-body-small']/a[text()='1']"),30);
		getDriver().findElement(By.xpath("//div[@class='s-pagination cursor-pointer font-body-small']/a[text()='1']")).click();
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[contains(text(),'Showing 1-10')]"),30);
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(text(),'Showing 1-10')]")).isDisplayed(),"Pagination not working");
		
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[@class='s-pagination cursor-pointer font-body-small']/a[text()='2']"),30);
		getDriver().findElement(By.xpath("//div[@class='s-pagination cursor-pointer font-body-small']/a[text()='2']")).click();
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[contains(text(),'Showing 11-20')]"),30);
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[contains(text(),'Showing 11-20')]")).isDisplayed(),"Pagination not working");	
		js.executeScript("window.scrollBy(0,-350)", "");
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		return this;
	}
	
	@FindBy(xpath="//button[normalize-space(.)='Switch to Polygon']")
	private WebElement switchTopolygonButton;
	
	public HomePageObjects clickOnswitchTopolygonButton() throws InterruptedException {
		new Waiting(getDriver()).explicitWaitElementToBeClickable(switchTopolygonButton, 30);
		switchTopolygonButton.click();
		Thread.sleep(4000);
		return this;
	}
	
	
	
	@FindBy(xpath="//button[text()='Approve']")
	private WebElement approveButton;
	
	public HomePageObjects clickOnapproveButton() throws InterruptedException {
		new Waiting(getDriver()).explicitWaitElementToBeClickable(approveButton, 30);
		approveButton.click();
		return this;
	}
	
	
	
	@FindBy(xpath="//button[text()='Switch network']")
	private WebElement switchNetworkButton;
	
	public HomePageObjects clickOnswitchNetworkButton() throws InterruptedException {
		new Waiting(getDriver()).explicitWaitElementToBeClickable(switchNetworkButton, 30);
		switchNetworkButton.click();
		return this;
	}
	
	
	
	@FindBy(xpath="//button[text()='Reject']")
	private WebElement rejectButton;
	
	public HomePageObjects clickOnrejectButton() throws InterruptedException {
		new Waiting(getDriver()).explicitWaitElementToBeClickable(rejectButton, 30);
		rejectButton.click();
		return this;
	}
	
	public HomePageObjects verifyWithdrawalRejectionMessage() {
	
		new Waiting(getDriver()).explicitWaitElementToBeClickable(By.xpath("//div[span=' User denied transaction from Metamask']"), 15);
		Assert.assertTrue(getDriver().findElement(By.xpath("//div[span=' User denied transaction from Metamask']")).isDisplayed(),"Withdrawal rejection failure");
		return this;
	}
	
}
