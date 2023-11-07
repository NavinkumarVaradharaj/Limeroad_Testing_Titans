package com.Limeroad_Quality_Warriors.stepdefinition;

import com.Base.BaseClass_Lime;
import com.Pom.PageObjectManager;

import io.cucumber.java.en.Given;

public class StepDefinition {
	
	
	public class Step_Definition extends BaseClass_Lime {

		PageObjectManager pom1 = new PageObjectManager();
		//	Homepage hp = new Homepage();
//		FootwearSelection fw =new FootwearSelection();
//		FootW_CausalShoe fc = new FootW_CausalShoe();
//		FootW_Sportshoe fs = new FootW_Sportshoe();
		
		@Given("User able to Launch Url {string}")
		public void user_able_to_launch_url(String url) {
			launchUrl(url);
			PopOptions("--disable-popup-blocking");
		    
		}
	

}
