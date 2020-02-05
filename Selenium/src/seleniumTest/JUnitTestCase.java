package seleniumTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestCase {
	@Test
	public void testCase1()
	{
		System.out.println("Test Case1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("Test Case2");
	}
	@Test
	public void testCase3()
	{
		System.out.println("Test Case3");
	}
	@BeforeClass
	public static void setupBeforeclass()throws Exception
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public static void setupAfterclass()throws Exception
	{
		System.out.println("After Class");
	}
	@Before
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@After
	public void afterMethod()
	{
		System.out.println("AfterMEthod");
	}

}
