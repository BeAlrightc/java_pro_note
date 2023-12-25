                    使用java将数据写入excel表格技术

## 1.应用场景

将用户信息导出为excel表格
讲Excel表中的信息录入到网站数据库，大大减小网站数据的录入量！
开发中经常会涉及到excel的处理，如导出Excel到数据库中！

操作Excel目前比较流行的就是Apache POI和阿里巴巴的easyExcel

## 2.Apache POI简介

Apache POI官网: https://poi.apache.org/


HSSF 对应 Excel 03 版本，最多支持65535行

XSSF对应 Excel 07 版本，行数无限制

缺点：

使用比较麻烦
数据量大的时候会可能报OOM异常
项目准备
创建maven项目，作为父项目，去掉src目录

创建module模块，也是maven项目poi-study

导入依赖

```xml
<dependencies>
<!--xLs(03)-->
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi</artifactId>
<version>4.1.2</version>
</dependency>
<!--xLsx(07)-->
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi-ooxml</artifactId>
<version>4.1.2</version>
</dependency>
<!--日期格式化工具-->
<dependency>
<groupId>joda-time</groupId>
<artifactId>joda-time</artifactId>
<version>2.10.1</version>
</dependency>
<!--test-->
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.12</version>
</dependency>
</dependencies>
```

创建两个版本的Excel文件

打开可以看到，03版最多支持到65536行，而07版不受限制，理论上无限

二者文件名后缀不同，对应操作的Java工具类也不同

明确几个概念，工作簿、工作表、行、单元格，分别对应了各自的对象

## 3.对excel的写入（POI-Excel）

### （1）.代码演示使用java对excel03版本和07版本进行数据写入操作

写测试，创建类

```java
package com.kuang;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExcelWriteTest {
    String PATH="D:\\IDEA project\\Excel\\ExcelwithJava\\";
    //下列是03版本的写入
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
       //输出
       workbook.write(fileOutputStream);
       //关闭流
        fileOutputStream.close();
        System.out.println("狂神观众统计表03文件生成完毕");
    }
    //以下是07版本的写入
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
}

```

注意对象的一个区别，文件后缀

生成结果：



- 大文件写HSSF

  缺点：最多只能处理65536行，否则就会抛出异常

  优点：过程中写入缓存，不操作磁盘，最后一次性写入磁盘，速度快

  代码演示：

  写入65536个数据演示：

  ```java
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
          for (int rowNum = 0; rowNum < 65536; rowNum++) {//设置行数
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
  
  ```

  接下来看看结果;

  ![](C:\Users\CHUAN GE PALY\Desktop\file\后端\java导入excel\pictures\65536行.jpg)

  进表格中看看;

  ![](C:\Users\CHUAN GE PALY\Desktop\file\后端\java导入excel\pictures\65536表jpg.jpg)

  但是如果超过65536条数据就会报异常：

  java.lang.IllegalArgumentException: Invalid row number (65536) outside allowable range (0..65535)

  如图：

  ![](C:\Users\CHUAN GE PALY\Desktop\file\后端\java导入excel\pictures\65536异常.jpg)

- 大文件写XSSF

  缺点：写数据时速度非常慢，非常耗内存，也会发生内存溢出，如100万条

  优点：可以写较大的数据量，如20万条

  代码;

  ```java
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
  ```

  看看效果：

  ![](C:\Users\CHUAN GE PALY\Desktop\file\后端\java导入excel\pictures\100万success.jpg)

  可以看到耗时非常

  进入表看看：

  ![](C:\Users\CHUAN GE PALY\Desktop\file\后端\java导入excel\pictures\100万表.jpg)

- 大文件写SXSSF

  优点：可以写非常大的数据量，如 100万 条甚至更多，写数据速度快，占用更少的内存

  注意：

  过程中可能产生临时文件，需要清理临时文件

  默认由 100 条记录被保存在内存中，如果超过这数量，则最前面的数据被写入临时文件

  如果想自定义内存中数据的数量，可以使用 new SXSSFWorkbook(amount)
  代码：

  ```java
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
      FileOutputStream fileOutputStream = new FileOutputStream(PATH + "TestWrite07BigDataS.xlsx");
      workbook.write(fileOutputStream);
      fileOutputStream.close();
      //清除临时文件
      ((SXSSFWorkbook) workbook).dispose();
   
      long end = System.currentTimeMillis();
      System.out.println((double) (end-begin)/1000);
  }
  
  ```

  POX-读数据

  我们读取一个表的第一行第一列：

  ```java
  import java.io.FileInputStream;
  import java.io.FileOutputStream;
  import java.io.IOException;
  import java.io.InputStream;
  
  public class ExcelReadTest {
      String PATH="D:\\IDEA project\\Excel\\ExcelwithJava\\";
      @Test
      public void testread03() throws IOException {
          //获取文件流
          InputStream InputStream = new FileInputStream(PATH+"狂神观众统计表03.xls");
          //创建一个工作谱，使用excel可以操作的他都可以操作
          Workbook workbook = new HSSFWorkbook(InputStream);
          //获取下标为0的表
          Sheet sheet = workbook.getSheetAt(0);
          //获取第1行
          Row row =sheet.getRow(0);
          //获取第1列
          Cell cell =row.getCell(0);
          //我们这里读表的第1行第1列的值
          System.out.println(cell.getStringCellValue());
      }
  
  }
  
  ```

  读07的excel表：

  ```java
  @Test
      public void testread07() throws IOException {
          //获取文件流
          InputStream InputStream = new FileInputStream(PATH+"狂神观众统计表07.xlsx");
          //创建一个工作谱，使用excel可以操作的他都可以操作
          Workbook workbook = new XSSFWorkbook(InputStream);
          //获取下标为0的表
          Sheet sheet = workbook.getSheetAt(0);
          //获取第1行
          Row row =sheet.getRow(0);
          //获取第1列
          Cell cell =row.getCell(1);
          //我们这里读表的第1行第1列的值
          //cell.getStringCellValue()字符串类型
          // System.out.println(cell.getStringCellValue());
          //cell.getNumericCellValue():获取一个数字类型
          //所以说我们读取值的时候一定要注意他的类型
          System.out.println(cell.getNumericCellValue());
      }
  ```

  读会员表：

  ```java
  package com.kuang;
  
  import org.apache.poi.hssf.usermodel.HSSFCell;
  import org.apache.poi.hssf.usermodel.HSSFDateUtil;
  import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
  }
  ```

  

当工具类使用：

```java
    @Test
    public void testCellTypeUtils(FileInputStream fileInputStream) throws Exception {
        //获取文件
       // FileInputStream fileInputStream = new FileInputStream(PATH + "会员消费商品明细表.xls");

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
}
```

计算公式：

```java
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
```

EasyExcel:

导入easyexcel依赖

```xml
 <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>easyexcel</artifactId>
            <version>2.2.0-beta2</version>
        </dependency>
```

