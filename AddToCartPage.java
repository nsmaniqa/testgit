package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import tool.Utility;
import common.TestCaseConfiguration;

public class AddToCartPage extends TestCaseConfiguration {

	@FindBy(xpath="//*[@id='Table2']/tbody/tr[2]/td[1]")
	WebElement firstrowitem_title;
	@FindBy(xpath="//*[@id='Table2']/tbody/tr[6]/td[2]")
	WebElement ultimatedvdpack_addtocatrprice;

	public AddToCartPage ()
	{
		PageFactory.initElements(driver, this);
	}
	public void priceverification(){
		if(Utility.isEqual("$29.85USD",ultimatedvdpack_addtocatrprice.getText()))
		{
			Reports.log(LogStatus.PASS, "add to cart price is matching");
		}
		else
			Reports.log(LogStatus.FAIL, "add to cart price is not matching");
		
		if(Utility.isEqual("21 Day Fix Ultimate DVD Package",firstrowitem_title.getText()))
		{
			Reports.log(LogStatus.PASS, "add to cart title is matching");
		}
		else
			Reports.log(LogStatus.FAIL, "add to cart title is not matching");
		
	}
	
}
