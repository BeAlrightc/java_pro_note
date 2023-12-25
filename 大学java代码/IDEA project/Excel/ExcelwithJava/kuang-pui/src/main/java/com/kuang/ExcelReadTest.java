package com.kuang;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.*;
import java.util.Date;

public class ExcelReadTest {
    String PATH = "D:\\IDEA project\\Excel\\ExcelwithJava\\";

    @Test
    public void testread03() throws IOException {
        //获取文件流
        InputStream InputStream = new FileInputStream(PATH + "狂神观众统计表03.xls");
        //创建一个工作谱，使用excel可以操作的他都可以操作
        Workbook workbook = new HSSFWorkbook(InputStream);
        //获取下标为0的表
        Sheet sheet = workbook.getSheetAt(0);
        //获取第1行
        Row row = sheet.getRow(0);
        //获取第1列
        Cell cell = row.getCell(1);
        //我们这里读表的第1行第1列的值
        //cell.getStringCellValue()字符串类型
        // System.out.println(cell.getStringCellValue());
        //cell.getNumericCellValue():获取一个数字类型
        //所以说我们读取值的时候一定要注意他的类型
        System.out.println(cell.getNumericCellValue());
    }

    @Test
    public void testread07() throws IOException {
        //获取文件流
        InputStream InputStream = new FileInputStream(PATH + "狂神观众统计表07.xlsx");
        //创建一个工作谱，使用excel可以操作的他都可以操作
        Workbook workbook = new XSSFWorkbook(InputStream);
        //获取下标为0的表
        Sheet sheet = workbook.getSheetAt(0);
        //获取第1行
        Row row = sheet.getRow(0);
        //获取第1列
        Cell cell = row.getCell(1);
        //我们这里读表的第1行第1列的值
        //cell.getStringCellValue()字符串类型
        // System.out.println(cell.getStringCellValue());
        //cell.getNumericCellValue():获取一个数字类型
        //所以说我们读取值的时候一定要注意他的类型
        System.out.println(cell.getNumericCellValue());
    }

    //读工作簿的所有数据
    @Test
    public void testCellType() throws Exception {
        //获取文件
        FileInputStream fileInputStream = new FileInputStream(PATH + "会员消费商品明细表.xls");

        //获取工作薄
        Workbook workbook = new HSSFWorkbook(fileInputStream);
        //得到表
        Sheet sheet = workbook.getSheetAt(0);

        //获取标题内容
        Row rowTitle = sheet.getRow(0);
        if (rowTitle != null) {
            //获取一行中有多少个单元格
            int cellCount = rowTitle.getPhysicalNumberOfCells();
            for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                //获取单元
                Cell cell = rowTitle.getCell(cellNum);
                if (cell != null) {
                    //获取类型
                    int cellType = cell.getCellType();
                    String cellValue = cell.getStringCellValue();
                    System.out.print(cellValue + " | ");
                }
            }
            System.out.println();
        }

        //获取表中的内容
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int rowNum = 1; rowNum < rowCount; rowNum++) {
            Row rowData = sheet.getRow(rowNum);
            if (rowData != null) {
                //读取列
                int cellCout = rowTitle.getPhysicalNumberOfCells();
                for (int cellNum = 0; cellNum < cellCout; cellNum++) {
                    System.out.print("【" + (rowNum + 1) + "-" + (cellNum + 1) + "】");

                    Cell cell = rowData.getCell(cellNum);
                    //匹配列的数据类型
                    if (cell != null) {
                        int cellType = cell.getCellType();
                        String cellValue = "";

                        switch (cellType) {
                            case HSSFCell.CELL_TYPE_STRING://字符串
                                System.out.print("【STRING】");
                                cellValue = cell.getStringCellValue();
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN://布尔值
                                System.out.print("【BOOLEAN】");
                                cellValue = String.valueOf(cell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC://数字类型
                                System.out.print("【NUMERIC】");

                                if (HSSFDateUtil.isCellDateFormatted(cell)) {//日期
                                    System.out.print("【日期】");
                                    Date date = cell.getDateCellValue();
                                    cellValue = new DateTime().toString("yyyy-MM-dd");
                                } else {
                                    // 不是日期格式，则防止当数字过长时以科学计数法显示
                                    System.out.print("【转换成字符串】");
                                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                                    cellValue = cell.toString();
                                }
                                break;
                            case HSSFCell.CELL_TYPE_BLANK://空
                                System.out.print("【BLANK】");
                                break;
                            case Cell.CELL_TYPE_ERROR:
                                System.out.print("【数据类型错误】");
                                break;
                        }
                        System.out.println(cellValue);
                    }
                }
            }
        }
        //关闭输入流
        fileInputStream.close();
    }


//    @Test
//    public void testCellTypeUtils(FileInputStream fileInputStream) throws Exception {
//        //获取文件
//       // FileInputStream fileInputStream = new FileInputStream(PATH + "会员消费商品明细表.xls");
//
//        //获取工作薄
//        Workbook workbook = new HSSFWorkbook(fileInputStream);
//        //得到表
//        Sheet sheet = workbook.getSheetAt(0);
//
//        //获取标题内容
//        Row rowTitle = sheet.getRow(0);
//        if (rowTitle != null) {
//            //获取一行中有多少个单元格
//            int cellCount = rowTitle.getPhysicalNumberOfCells();
//            for (int cellNum = 0; cellNum < cellCount; cellNum++) {
//                //获取单元
//                Cell cell = rowTitle.getCell(cellNum);
//                if (cell != null) {
//                    //获取类型
//                    int cellType = cell.getCellType();
//                    String cellValue = cell.getStringCellValue();
//                    System.out.print(cellValue + " | ");
//                }
//            }
//            System.out.println();
//        }
//
//        //获取表中的内容
//        int rowCount = sheet.getPhysicalNumberOfRows();
//        for (int rowNum = 1; rowNum < rowCount; rowNum++) {
//            Row rowData = sheet.getRow(rowNum);
//            if (rowData != null) {
//                //读取列
//                int cellCout = rowTitle.getPhysicalNumberOfCells();
//                for (int cellNum = 0; cellNum < cellCout; cellNum++) {
//                    System.out.print("【" + (rowNum + 1) + "-" + (cellNum + 1) + "】");
//
//                    Cell cell = rowData.getCell(cellNum);
//                    //匹配列的数据类型
//                    if (cell != null) {
//                        int cellType = cell.getCellType();
//                        String cellValue = "";
//
//                        switch (cellType) {
//                            case HSSFCell.CELL_TYPE_STRING://字符串
//                                System.out.print("【STRING】");
//                                cellValue = cell.getStringCellValue();
//                                break;
//                            case HSSFCell.CELL_TYPE_BOOLEAN://布尔值
//                                System.out.print("【BOOLEAN】");
//                                cellValue = String.valueOf(cell.getBooleanCellValue());
//                                break;
//                            case HSSFCell.CELL_TYPE_NUMERIC://数字类型
//                                System.out.print("【NUMERIC】");
//
//                                if (HSSFDateUtil.isCellDateFormatted(cell)) {//日期
//                                    System.out.print("【日期】");
//                                    Date date = cell.getDateCellValue();
//                                    cellValue = new DateTime().toString("yyyy-MM-dd");
//                                } else {
//                                    // 不是日期格式，则防止当数字过长时以科学计数法显示
//                                    System.out.print("【转换成字符串】");
//                                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
//                                    cellValue = cell.toString();
//                                }
//                                break;
//                            case HSSFCell.CELL_TYPE_BLANK://空
//                                System.out.print("【BLANK】");
//                                break;
//                            case Cell.CELL_TYPE_ERROR:
//                                System.out.print("【数据类型错误】");
//                                break;
//                        }
//                        System.out.println(cellValue);
//                    }
//                }
//            }
//        }
//        //关闭输入流
//        fileInputStream.close();
//    }
//}

//    @Test
//    public void testCellType() throws IOException {
//        FileInputStream fileInputStream =new FileInputStream(PATH+"会员消费商品明细表.xls");
//
//        //1.创建一个工作簿
//        Workbook workbook = new HSSFWorkbook(fileInputStream);
//
//        //获取标题的使用
//        Sheet sheet = workbook.getSheetAt(0);
//        //获取标题的内容
//        //获取第一行
//        Row rowTitle =sheet.getRow(0);
//        if(rowTitle!=null){
//            //一定要掌握
//            int cellCount= rowTitle.getPhysicalNumberOfCells();
//            //遍历所有的列
//            for(int cellNum=0;cellNum<cellCount;cellNum++){
//                //将所有的列都读出来
//               Cell cell = rowTitle.getCell(cellNum);
//               //列要进行一个非空判断
//               if(cell !=null){
//                   int cellType=cell.getCellType();
//                   //获取列的值
//                   String cellValue=cell.getStringCellValue();
//                   System.out.print(cellValue+" | ");
//               }
//            }
//            System.out.println();
//        }
////获取表中的内容
//        int rowCount = sheet.getPhysicalNumberOfRows();
//        for(int rowNum=1;rowNum<rowCount;rowNum++){
//            Row rowData =sheet.getRow(rowNum);
//            if(rowData !=null){
//                //读取列
//              int cellCount =  rowTitle.getPhysicalNumberOfCells();
//              for(int cellNum=0;cellNum< cellCount;cellNum++){
//                  System.out.print("["+(rowNum+1)+"-"+(cellNum+1)+"]");
//                  Cell cell = rowData.getCell(cellNum);
//                  //匹配列的数据类型
//                  if(cell !=null){
//                      int cellType=cell.getCellType();
//                      String cellValue="";
//                      switch(cellType){
//                          case HSSFCell.CELL_TYPE_STRING://字符串
//                              System.out.print("[string]");
//                              cellValue=cell.getStringCellValue();
//                              break;
//                          case HSSFCell.CELL_TYPE_BOOLEAN://布尔类型
//                              System.out.print("[BOOLEAN]");
//                              cellValue=String.valueOf(cell.getStringCellValue());
//                              break;
//                          case HSSFCell.CELL_TYPE_BLANK://空类型
//                              System.out.print("[BLANK]");
//                              break;
//                          case HSSFCell.CELL_TYPE_NUMERIC://布尔类型
//                              System.out.print("[NUMERIC]");//数字（日期，普通数字）
//                              if(HSSFDateUtil.isCellDateFormatted(cell)){//日期
//                                  System.out.print("[日期]");
//                                Date date =  cell.getDateCellValue();
//                                cellValue = new DateTime(date).toString("yyyy-MM-dd");
//                              }else{
//                                  //不是日期格式，防止数字过长
//                                  System.out.println("[转换为字符串输出]");
//                                cell.setCellType(HSSFCell.CELL_TYPE_STRING);
//                                  cellValue=String.valueOf(cell.getStringCellValue());
//                              }
//                              break;
//                          case HSSFCell.CELL_TYPE_ERROR://错误
//                              System.out.println("[数据类型错误]");
//                              break;
//                      }
//                  }
//              }
//            }
//        }
//
//
//    }
    @Test
public void testFormla() throws Exception {
   FileInputStream fileInputStream= new FileInputStream(PATH + "计算公式.xls");
   Workbook workbook = new HSSFWorkbook(fileInputStream);
    Sheet sheet = workbook.getSheetAt(0);

    Row row =sheet.getRow(4);
    Cell cell = row.getCell(0);
    //拿到计算公式
    FormulaEvaluator FormulaEvaluator = new HSSFFormulaEvaluator((HSSFWorkbook)workbook);
    //输出单元格的内容
    int cellType = cell.getCellType();
    switch (cellType) {
        case Cell.CELL_TYPE_FORMULA://公式
            String formula = cell.getCellFormula();
            System.out.println(formula);
            //计算
           CellValue evalute= FormulaEvaluator.evaluate(cell);
           String cellValue = evalute.formatAsString();
            System.out.println(cellValue);
            break;
    }
  }
}



