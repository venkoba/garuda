package principal;

import org.openqa.selenium.support.PageFactory;

import PageObjects.HomePageObjects;

public class PageInitializers extends MainClass
{

		
			public HomePageObjects homePage() {
				return PageFactory.initElements(getDriver(), HomePageObjects.class);
				}

	}

