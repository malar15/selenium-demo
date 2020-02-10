package TestCase;

import java.io.IOException;

import DataEng.ExcelData;
import Keyword.ObjectIdentification;

public class DriverScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExcelData da = new ExcelData();
		ExcelData idm = new ExcelData();
		ObjectIdentification obj = new ObjectIdentification();
		try {
			da.excel("/Users/saravmalar/selenium-workspace/KeywordDriven/total.xlsx");//keywordDriven.xlsx
			idm.excel("/Users/saravmalar/selenium-workspace/KeywordDriven/keywordDriven.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i =0;i<=da.rowc();i++)
		{
			String searchStr= da.getCellvalue(i, 0);
			for (int j=1;j<idm.rowc();j++)
			{
				String keyword= idm.getCellvalue(j, 2);
				if(keyword.equalsIgnoreCase("openBrowser"))
				{
					obj.openBrowser();
				}
				else if (keyword.equalsIgnoreCase("setUrl"))
				{
					obj.setUrl();
				}
				else if (keyword.equalsIgnoreCase("Search"))
				{
					obj.Search(searchStr);
				}
			else if (keyword.equalsIgnoreCase("close"))
				{
					obj.closeBrowser();
				}
			}
		}
	}

}
