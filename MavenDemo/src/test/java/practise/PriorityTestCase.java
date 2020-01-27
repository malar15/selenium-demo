package practise;

import org.testng.annotations.Test;

public class PriorityTestCase {
  @Test(priority=2)
  public void loginApp() {
	  
	  System.out.println("Test Case 1: Login to Application");
  }
  
  @Test(priority=4)
  public void search() {
	  
	  System.out.println("Test Case 2: Search the tickets");
  }
  
  @Test(priority=3,invocationCount = 3,invocationTimeOut = 10)
  public void book() {
	  
	  System.out.println("Test Case 3: Book the tickets");
	  
  }
  @Test(priority=1)
  public void logout() {
	  
	  System.out.println("Test Case 4: Logout Application");
  }
}
