package com.Limeroad_Testing_Titans.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Limeroad_Testing_Titans.base.BaseClass;

public class LoginPageImpl extends BaseClass {
	
	public void FootW_CausalShoe() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "CasualShoeOpt1")
			private WebElement causalshoe;
	public WebElement getCausalshoe() {
		return causalshoe;
	}
	
	@FindBy (xpath = "SlectionOfProduct")
	private WebElement productSelection;
	public WebElement getProductSelection() {
		return productSelection;
	}
	
	@FindBy (xpath = "SelctionSize")
	private WebElement shoeSize;
	public WebElement getShoeSize() {
		return shoeSize;
	}
	
	@FindBy (xpath = "//div[text()='ADD TO CART']")
	private WebElement addToCart2;
	public WebElement getAddToCart2() {
		return addToCart2;
	}
}



