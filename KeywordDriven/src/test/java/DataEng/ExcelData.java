package DataEng;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	
	File fil;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	int rowc;
	
	
	public void excel(String path) throws IOException
	{
		fil=new File(path);
		FileInputStream fis = new FileInputStream(fil);
		wb=new XSSFWorkbook(fis);
	}
	
	public int rowc()
	{
		sheet = wb.getSheetAt(0);
		rowc=sheet.getLastRowNum();
		return rowc;
		
	}
	
	public String getCellvalue(int rv ,int cv)
	{
		sheet = wb.getSheetAt(0);
		String cellv= sheet.getRow(rv).getCell(cv).getStringCellValue();
		return cellv;
		
	}
	
	public void setData(int sheetno,int rowno,int colno,String str)
	{
		sheet = wb.getSheetAt(sheetno);
		sheet.getRow(rowno).createCell(colno).setCellValue(str);
		FileOutputStream fio;
		try {
			fio = new FileOutputStream(fil);
			wb.write(fio);
			fio.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		
			e.printStackTrace();
		}
		
	}

}
