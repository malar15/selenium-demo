package seleniumTest;

import java.io.IOException;

public class CallWrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WrapperMethods wm = new WrapperMethods();
		wm.insertapp("https://www.facebook.com/");
		wm.enterbyid("email", "abc@gmail.com");
		wm.enterbyid("pass", "123");
		wm.clickbyxpath("//*[@id=\"u_0_2\"]");
		wm.takesnap("/Users/saravmalar/Documents/screenshot.png");
		wm.closeapp();
		

	}

}
