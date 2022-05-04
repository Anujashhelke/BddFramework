package bddFrameUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead {


	public String getdata(String file, String string, int num) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream(file);
		HSSFWorkbook sheet=new HSSFWorkbook(fin);
				ArrayList<String> array=new ArrayList<String>();
				int sheets=sheet.getNumberOfSheets();
				for(int i=0;i<sheets;i++) {
					if(sheet.getSheetName(i).equalsIgnoreCase(string)) {
						HSSFSheet sheet1=sheet.getSheetAt(i);
						Row row=sheet1.getRow(num);
						Cell cell=row.getCell(0);
						return cell.getStringCellValue();
						
						
					}
				}
		
		return null;
	}

}
