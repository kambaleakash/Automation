package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule extends BaseClass
{
	@Test(groups= {"smoketest","regressiontest"})
	public void createTask()
	{
		Reporter.log("createTask",true);
	}
	
	@Test(groups="regressiontest")
	public void modifyTask()
	{
		Reporter.log("modifyTask",true);
	}
	
	@Test(groups="integrationtest")
	public  void deleteTask()
	{
		Reporter.log("deleteTask",true);
	}
	
	@Test
	public void check(WebDriver d)
	{
		
		String exp="actiTIME -  Enter Time-Track";
		String act = d.getTitle();
		
		Assert.assertEquals(act, exp);
	}

}
