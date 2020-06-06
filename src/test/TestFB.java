package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMFB;

public class TestFB extends BaseTest {
	
	@Test
	public void createNewAccount() throws IOException, InterruptedException {
		
		POMFB p=new POMFB(driver);
		p.signup();
	}

}
