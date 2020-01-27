package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestNG {
	
  @Test
  public void zTest() {
	  //logic 
	  System.out.println("Test Case 1");
  }
  
  @Test
  public void TestTwo() {
	  System.out.println("Test Case 2");
  }
  @Test
  public void TestThree() {
	  System.out.println("Test Case 3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method: LaunchApp");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method: CloseApp");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class:Prepare Test Data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class: Generate Reports");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test:Open DB Connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test:Close DB Connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite:smoke Testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite: Clear Results");
  }

}
