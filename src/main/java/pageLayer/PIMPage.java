package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;

public class PIMPage {

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pimClick;

	@FindBy(xpath = "//a[text()='Add Employee']")
	WebElement addEmpClick;

	@FindBy(name = "firstName")
	WebElement firstname;

	@FindBy(name = "middleName")
	WebElement middlename;

	@FindBy(name = "lastName")
	WebElement lastname;


	public PIMPage() {
		PageFactory.initElements(driver, this);

	}

	public void clickOnPimLink() {
		element.click(pimClick);
	
	}
	
	public void clickOnAddEmp() {
		element.click(addEmpClick);
	}

	public void addEmployee(String fname, String mname, String lname) {

		element.sendKeys(firstname, fname);
		element.sendKeys(middlename, mname);
		element.sendKeys(lastname, lname);

	}

	
	public void clearandsave() throws InterruptedException {
//		element.clear(employeeId);
//		element.sendKeys(employeeId, empid);
		element.click(saveButton);
		Thread.sleep(2000);
	}

}
