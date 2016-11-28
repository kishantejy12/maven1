package Tests;

import org.testng.annotations.Test;


import page.LoginPage;

public class Test1 {
	@Test
	public void test() throws InterruptedException {
		LoginPage hp= new LoginPage();
		hp.intializeWebDriver();
		hp.enterUsername("kishantejy12");
		hp.enterPassword("123456789");
		hp.clickOnLoginButton();
		hp.tearDown();
	}

}
