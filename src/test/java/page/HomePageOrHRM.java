package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePageOrHRM {
	@FindBy (xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a") List <WebElement> menu;
	@FindBy (tagName="h6") WebElement verif_men;
	
	public HomePageOrHRM() {PageFactory.initElements(Config.driver, this);	}
	
	public void cliquer_menu (String x) {
		try {
		for (WebElement menus: menu) {if (menus.getText().contains(x)) {menus.click();		}
	}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
}
	public void verify_menu(String a) {
		Assert.assertEquals(verif_men.getText(), a);
		Config.quitWindow();
	}
}
