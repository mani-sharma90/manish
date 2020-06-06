package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage  {
	
	public void selectByvisibletext(WebElement element,String text) {
		
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	public void selectByvalue(WebElement element,String value) {
		
		Select sel=new Select(element);
		sel.selectByValue(value);
		
		
	}

}
