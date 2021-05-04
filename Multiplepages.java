package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Multiplepages {
	WebDriver driver;
	public   Multiplepages (WebDriver driver) {  // Constructor
		this.driver =driver;
		PageFactory.initElements(driver,this);
    
}
	@FindBy(xpath="//header/div[2]/div[3]/input[1]")
	WebElement searchbar;
	public WebElement getsearchbar() { 
		return searchbar;
	}
		@FindBy(xpath="//header/div[2]/div[3]/a[1]")
		WebElement select;
		public WebElement getselect() { 
			return select;

	}
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]/div[2]/div[1]/span[1]")
	WebElement shirt;
	public WebElement getshirt() { 
		return shirt;
	
	
}
	
	@FindBy(xpath="//p[contains(text(),'40')]")
	WebElement size;
	public WebElement getsize() { 
		return size;
}
	@FindBy(xpath="//body/div[@id='mountRoot']/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]/span[1]")
	WebElement bag;
	public WebElement getbag() { 
		return bag;
}
	@FindBy(xpath="//body/div[@id='mountRoot']/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/a[1]")
	WebElement gotobag;
	public WebElement getgotobag() { 
		return gotobag;
}
	
	@FindBy(xpath="//div[contains(text(),'Place Order')]")
	WebElement placeorder;
	public WebElement getplaceorder() { 
		return placeorder;
}

	@FindBy(xpath="//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")// to check for pin
	WebElement pincode;
	public WebElement getpincode() { 
		return pincode;
}

	@FindBy(xpath="//input[@id='pincode']")// to eneter the pin
	WebElement checkpin;
	public WebElement getcheckpin() { 
		return checkpin;
		
}
	@FindBy(xpath="//div[contains(text(),'CHECK')]")// to eneter the pin
	WebElement enterpin;
	public WebElement getenterpin() { 
		return enterpin;
		
}
	
}	//li[contains(text(),'Men Shirts Printed')]

