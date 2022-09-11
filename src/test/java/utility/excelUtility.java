package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelUtility {
	public String excelutility(String sheetname,int row,int cellno) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/java/utility/userData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row rw=sheet.getRow(row);
		String FirstNameValidation=rw.getCell(cellno).getStringCellValue();
		String LastNameValidation=rw.getCell(cellno).getStringCellValue();
		String postValidation=rw.getCell(cellno).getStringCellValue();
		
		if(FirstNameValidation.equals("FirstName"))
		{
			String firstName=rw.getCell(1).getStringCellValue();
		return firstName;
		}
		else if(LastNameValidation.equals("LastName")) {
		return sheetname;
		}
		else if (postValidation.equals("PostCode")) {
			
			
		}
		return postValidation;
		
	}

}
