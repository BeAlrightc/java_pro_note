package com.kuang;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExcelWriteTest {
    String PATH="D:\\IDEA project\\Excel\\ExcelwithJava\\";
    @Test
    public void testWrite03() throws IOException {
        //1.创建一个工作簿
        Workbook workbook = new HSSFWorkbook();
        //2.创建一个工作表
        Sheet sheet = workbook.createSheet("狂神观众统计表");
        //3、创建一行(1,1)
        Row row1=sheet.createRow(0);
        //4.创建一个单元格
        Cell cell11 =row1.createCell(0);
        cell11.setCellValue("今日新增观众");
        //(1,2)
        Cell cell12 =row1.createCell(1);
        cell12.setCellValue(666);

        //第二行(2,1)
        Row row2 = sheet.createRow(1);
        Cell cell21 =row2.createCell(0);
        cell21.setCellValue("统计时间");
        //(2,2)
        Cell cell22 = row2.createCell(1);
        String time =new DateTime().toString("yyyy-MM-dd HH:mm");
        cell22.setCellValue(time);

        //生成一张表(io流) 03版本就是使用xls结尾
       FileOutputStream fileOutputStream= new FileOutputStream(PATH+"狂神观众统计表03.xls");
       //输出文件刘=流
       workbook.write(fileOutputStream);
       //关闭流
        fileOutputStream.close();
        System.out.println("狂神观众统计表03文件生成完毕");
    }
    @Test
    public void testWrite07() throws IOException {
        //1.创建一个工作簿
        Workbook workbook = new XSSFWorkbook();
        //2.创建一个工作表
        Sheet sheet = workbook.createSheet("狂神观众统计表");
        //3、创建一行(1,1)
        Row row1=sheet.createRow(0);
        //4.创建一个单元格
        Cell cell11 =row1.createCell(0);
        cell11.setCellValue("今日新增观众");
        //(1,2)
        Cell cell12 =row1.createCell(1);
        cell12.setCellValue(666);

        //第二行(2,1)
        Row row2 = sheet.createRow(1);
        Cell cell21 =row2.createCell(0);
        cell21.setCellValue("统计时间");
        //(2,2)
        Cell cell22 = row2.createCell(1);
        String time =new DateTime().toString("yyyy-MM-dd HH:mm");
        cell22.setCellValue(time);

        //生成一张表(io流) 03版本就是使用xlsx结尾
        FileOutputStream fileOutputStream= new FileOutputStream(PATH+"狂神观众统计表07.xlsx");
        //输出
        workbook.write(fileOutputStream);
        //关闭流
        fileOutputStream.close();
        System.out.println("狂神观众统计表07文件生成完毕");
    }

//使用03版本的excel测试写满65536
    @Test
    public void write03BigData() throws IOException {
        //设置开始的时间
        long begin = System.currentTimeMillis();

        //创建簿
        Workbook workbook = new HSSFWorkbook();
        //创建表
        Sheet sheet = workbook.createSheet();
        //写数据
        for (int rowNum = 0; rowNum < 65537; rowNum++) {//设置行数
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {//设置列数
                Cell cell = row.createCell(cellNum);//(rowNum,cellNum)
                cell.setCellValue(cellNum);//设置插入的内容
            }
        }
        //输出完毕
        System.out.println("over");
        //将数据写入一张表
        FileOutputStream fileOutputStream = new FileOutputStream(PATH + "TestWrite03BigData.xls");
        workbook.write(fileOutputStream);
        //输出流关闭
        fileOutputStream.close();
//结束的时间
        long end = System.currentTimeMillis();
//输出时间差
        System.out.println("前后花费的时间为:"+(double) (end-begin)/1000);
    }

    //测试07写100万条数据
    @Test
    public void write07BigData() throws IOException {
        long begin = System.currentTimeMillis();

        //创建簿
        Workbook workbook = new XSSFWorkbook();
        //创建表
        Sheet sheet = workbook.createSheet();
        //写数据,写入100万条数据（100000*10）
        for (int rowNum = 0; rowNum < 100000; rowNum++) {
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("over");
        FileOutputStream fileOutputStream = new FileOutputStream(PATH + "TestWrite07BigData.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        long end = System.currentTimeMillis();

        System.out.println("前后花费的时间："+(double) (end-begin)/1000);
    }

    @Test
    public void write07BigDataS() throws IOException {
        long begin = System.currentTimeMillis();

        //创建簿
        Workbook workbook = new SXSSFWorkbook();
        //创建表
        Sheet sheet = workbook.createSheet();
        //写数据
        for (int rowNum = 0; rowNum < 100000; rowNum++) {
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }
        System.out.println("over");
        //开始用输出流写入表操作
        FileOutputStream fileOutputStream = new FileOutputStream(PATH + "TestWrite07BigDataS.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        //清除临时文件
        ((SXSSFWorkbook) workbook).dispose();

        long end = System.currentTimeMillis();
        System.out.println((double) (end-begin)/1000);
    }
}
