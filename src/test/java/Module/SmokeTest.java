package Module;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import principal.MainClass;
import principal.PageInitializers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.aventstack.extentreports.Status;

public class SmokeTest extends PageInitializers {

	SoftAssert a1 = new SoftAssert();
	
	//@BeforeTest
	public void after() throws InterruptedException
	{
		System.out.println("Before Test");
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		getDriver().get("https://wallet.polygon.technology/wallet");
		
	}    
	
	public void LoginWalletPolygonTechnology() throws InterruptedException {

		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());

		// System.out.println(tabs2.size());

		getDriver().switchTo().window(tabs2.get(1));

		getDriver().close();

		getDriver().switchTo().window(tabs2.get(0));

		getDriver().get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html#initialize/welcome");

		homePage().click_getsbtn().click_impwalbtn().click_iagreebtn()
				.enter_secrecvryph("hood edge tackle air humble fitness patch leave glare cushion crunch copy")
				.enter_pwdfield("MMMatic@123").enter_cnfpwd("MMMatic@123").click_iagreechkbox().click_importbtn();

		getDriver().get("https://wallet.polygon.technology/");

		homePage().click_polywalbtn().click_metamask();

		Thread.sleep(5000);

		ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());

		getDriver().switchTo().window(tabs.get(1));

		homePage().enter_metamaskpwd("MMMatic@123").click_unlockbtn();
		getDriver().switchTo().window(tabs.get(1));

		homePage().click_nextbtn().click_remlatertbtn().click_nextbtn1().click_connectbtn().click_sign1btn();

		Thread.sleep(5000);
		getDriver().get("https://wallet.polygon.technology/");

		homePage().click_polywalbtn();
		getDriver().switchTo().window(tabs.get(0));

		getDriver().close();

		getDriver().switchTo().window(tabs.get(1));

	}

	@Test
	public void verifyMainnetBalance() throws InterruptedException {
		test = extent.createTest("Homescreen Scenario");
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		homePage().verify_mainnetbal();
	}

	@Test
	public void verify_Depositbtn_AvlBal() throws InterruptedException {
		test = extent.createTest("Click Deposit Button - Show Avlble Bal ");
		
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		homePage().click_depositbtn().verify_avalblball();
	}
	
	@Test
	public void verify_deposit_denied_transaction() throws InterruptedException {
		test = extent.createTest("deposit_denied_transaction");
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		homePage().click_depositbtn();
		Thread.sleep(3000);
		homePage()
		.input_ETHtokens("0.005")
		.click_transfer_btn()
		.click_continue1btn()
		.click_continue2btn()
		.click_continue3btn();
		Thread.sleep(10000);
		
		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		
		getDriver().switchTo().window(tabs2.get(1));

		homePage().click_reject_btn();
		
		getDriver().close();

		getDriver().switchTo().window(tabs2.get(0));
		homePage().verify_denied_trans_msg("User denied transaction from Metamask").clickOnconfirmDepositPopup_closeButton();

	}

	@Test
	public void verify_withdrawal_Denial_transaction() throws InterruptedException {
		test = extent.createTest("withdrawal_denied_transaction");
		
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		homePage().click_withdrawbtn();
		Thread.sleep(3000);
		
		homePage().clickOnswitchTopolygonButton();
			
		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		
		getDriver().switchTo().window(tabs2.get(1));

		homePage()
		.clickOnapproveButton()
		.clickOnswitchNetworkButton()
		;
		
		getDriver().switchTo().window(tabs2.get(0));
		
		homePage()
		.input_ETHtokens("0.005")
		.click_transfer_btn()
		.click_continue1btn()
		.click_continue2btn()
		.click_continue3btn();
		Thread.sleep(10000);
		
		tabs2 = new ArrayList<String>(getDriver().getWindowHandles());

		getDriver().switchTo().window(tabs2.get(1));
		
		homePage().clickOnrejectButton();
		
		getDriver().switchTo().window(tabs2.get(0));

		homePage().verifyWithdrawalRejectionMessage();
	}
	
	@Test
	public void verifyWalletHomePageLinks() throws InterruptedException {
		
		
		test = extent.createTest("verify wallet home page links");
		homePage().click_polygon_logo();
		homePage().click_polywalbtn();
		
		homePage().verfiyWalletHomePageIcons();
	}
	
	

	
}
