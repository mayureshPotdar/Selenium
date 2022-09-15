package initia;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childClass extends browsOpen {

	public void fetch(String path, WebDriver d, int tabIndex, int rowIteration, String xpath1, String xpath2, String xpath3) throws Exception 
	{
		FileInputStream f = new FileInputStream(path);
		XSSFWorkbook b = new XSSFWorkbook(f);
		XSSFSheet tab = b.getSheetAt(tabIndex);
		
		try {
			int i,j;
			for(i=0; i<=rowIteration; i++)	
				{
					for(j=0; j<=0; j++)
						
							{
								WebElement x = d.findElement(By.xpath(xpath1));
								Row row = tab.getRow(i);
								Cell cell = row.getCell(j);
								String data = cell.getStringCellValue();
								x.sendKeys(data);
								j=j+1;
					
								WebElement y = d.findElement(By.xpath(xpath2));
								Row row2 = tab.getRow(i);
								Cell cell2 = row.getCell(j);
								String data2 = cell2.getStringCellValue();
								y.sendKeys(data2);
								j=j+1;
					
								WebElement z = d.findElement(By.xpath(xpath3));
								Row row3 = tab.getRow(i);
								Cell cell3 = row.getCell(j);
								String data3 = cell3.getStringCellValue();
								z.sendKeys(data3);	
							}
						Thread.sleep(3000);
						d.navigate().refresh();
				}	
			}
		
		catch(Exception e) 
			{System.out.println("You are trying to read Null value");}
				 
	finally {}
	}
}
	