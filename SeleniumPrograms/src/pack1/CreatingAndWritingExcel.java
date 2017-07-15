package pack1;

import java.awt.Desktop;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

@Test
 public class CreatingAndWritingExcel {
	int i=0;
	int j=0;
	int rowsSet=2;
	String[] myStringArray = new String[]{"SNO","NAME","AGE","GENDER","ELIGIBILIY"};
	String[] myStrings1= new String[]{"1","Mary","24","Female","Eligible"};
	String[] myStrings2=new String[]{"2", "Marian", "24", "Male", "Eligible"};
	
	int len1=myStringArray.length;
	
 public void createSpreadsheet() throws IOException
	{		

// creating a Workbook
   HSSFWorkbook workBook= new HSSFWorkbook();
  
// creating a sample sheet in the workbook
   
   HSSFSheet sheet1=workBook.createSheet("Sample Excel");
   
// creating cells in excel sheet
   
   HSSFCell cells;
 
for(j=0;j<=rowsSet;j++)
{

// creating rows in excels
	
	HSSFRow rows=sheet1.createRow(j);
for(i=0;i<len1;i++)
{

cells=rows.createCell(i);
if(j==0)
	
    rows.getCell(i).setCellValue(myStringArray[i]);

if(j==1)
{
	rows.getCell(i).setCellValue(myStrings1[i]);
}
if(j==2)
{
	rows.getCell(i).setCellValue(myStrings2[i]);


}
}
}

/*{
for(j=0;j<=4;j++)
{
cells=rows.createCell(j);
if(j==0 && i==0)
	rows.getCell(j).setCellValue("SNO");
if(j==1 && i==0)
	rows.getCell(j).setCellValue("NAME");
if(j==2 && i==0)
rows.getCell(j).setCellValue("AGE");
if(j==3 && i==0)
rows.getCell(j).setCellValue("GENDER");
if(j==4 && i==0)
rows.getCell(j).setCellValue("ELIGIBILITY");

if(j==0 && i==1)
	rows.getCell(j).setCellValue("1");
if(j==1 && i==1)
	rows.getCell(j).setCellValue("Mary");
if(j==2 && i==1)
rows.getCell(j).setCellValue("24");
if(j==3 && i==1)
rows.getCell(j).setCellValue("Female");
if(j==4 && i==1)
rows.getCell(j).setCellValue("Eligible");

if(j==0 && i==2)
	rows.getCell(j).setCellValue("2");
if(j==1 && i==2)
	rows.getCell(j).setCellValue("Marian");
if(j==2 && i==2)
rows.getCell(j).setCellValue("24");
if(j==3 && i==2)
rows.getCell(j).setCellValue("Male");
if(j==4 && i==2)
rows.getCell(j).setCellValue("Eligible");
}
}*/


FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/moni/Desktop/newSample.xls");
workBook.write(fileOutputStream);
fileOutputStream.close();
System.out.println("The new excel is written successfully");
Desktop.getDesktop().open(new File("C:/Users/moni/Desktop/newSample.xls"));
	}
 


/* public static void main(String[] args) throws IOException {
	CreatingAndWritingExcel andWritingExcel=new CreatingAndWritingExcel();
	andWritingExcel.createSpreadsheet();
}*/}
