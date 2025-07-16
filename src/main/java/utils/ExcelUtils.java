package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.xssf.*;



public class ExcelUtils {

    public static Map<String, String> getRowData(String filePath, String sheetName, int rowNum){

        Map<String,String> data = new HashMap<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
//            Workbook workbook = new XSSFWorkbook



        } catch (Exception e) {
            throw new RuntimeException(e);
        }



//        TestDataFiles/Testdata.xlsx



        return Map.of();
    }
}
