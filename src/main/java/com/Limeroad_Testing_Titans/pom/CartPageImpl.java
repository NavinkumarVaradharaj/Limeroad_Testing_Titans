package com.Limeroad_Testing_Titans.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass_Lime;
import com.Limeroad_Testing_Titans.base.BaseClass;

public class CartPageImpl  extends BaseClass{

			public FootW_Sportshoe() {
				PageFactory.initElements(driver, this);
			}
			
			@FindBy (xpath ="(//a[text()='formal shoes'])[2]")
			private WebElement sportShoe;
			public WebElement getSportShoe() {
				return sportShoe;
			}
			
			@FindBy (xpath = "(//img[@alt=\"Product image\"])[1]")
			private WebElement selectingProduct1;

			public WebElement getSelectingProduct1() {
				return selectingProduct1;
			}

			
			@FindBy (xpath = "//span[text()=' 9-10 Y ']")
			private WebElement selectingAge;
			public WebElement getSelectingAge() {
				return selectingAge;
			}
			
			
			@FindBy (xpath = "//div[text()='ADD TO CART']")
			private WebElement addingToCart3;


			public WebElement getAddingToCart3() {
				return addingToCart3;
			}




			


			
			

		}


}
