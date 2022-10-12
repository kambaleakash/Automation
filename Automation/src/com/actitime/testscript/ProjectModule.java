package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass
{
	
	@Test(groups="smoketest")
	public void createProject()
	{
		Reporter.log("createProject",true);
		
	}
	
	@Test(groups="regressiontest")
	public void modifyProject()
	{
		Reporter.log("modifyProject",true);
	}
	
	@Test(groups="integrationtest")
	public void deleteProject()
	{
		Reporter.log("deleteProject",true);
		Assert.fail();
	}

}
