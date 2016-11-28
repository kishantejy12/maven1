package page;
import org.openqa.selenium.By;

import ru.yandex.qatools.allure.annotations.Step;

public class LoginPage extends BasePage {

	

	

	    private By username = By.id("email");
	    private By password = By.id("pass");
	    private By loginButton = By.id("u_0_n");
	    
	    
	    @Step("Enter username")
	    public void enterUsername(String enterUsername) {
	        sendKeys(username, enterUsername);
	    }
	    
	    @Step("Enter Password")
	    public void enterPassword(String enterPasword) {
	        sendKeys(password, enterPasword);
	    }
	    
	    @Step("Click on login button")
	    public void clickOnLoginButton() {
	        clickOn(loginButton);
	    }
	}
	
	
