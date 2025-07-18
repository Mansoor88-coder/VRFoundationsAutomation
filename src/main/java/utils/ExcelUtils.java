package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

    public static Map<String, String> getRowData(String filePath, String sheetName, int rowNum) {

        Map<String, String> data = new HashMap<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);
            Row dataRow = sheet.getRow(rowNum);
            if (headerRow == null) {
                throw new Exception("header row is not found");
            }

            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell headercell = headerRow.getCell(i);
                Cell datacell = dataRow.getCell(i);

                String colName = headercell.getStringCellValue();
                String colValue = getCellValueAsString(datacell);

                data.put(colName, colValue);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return data;
    }

    public static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                cell.getStringCellValue();
            case NUMERIC:
                String.valueOf((int) cell.getNumericCellValue());
            case BOOLEAN:
                String.valueOf((boolean) cell.getBooleanCellValue());
            default:
                return "";
        }

    }

}
