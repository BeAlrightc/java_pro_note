package com.kuang;

import com.alibaba.excel.EasyExcel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EasyExcelTest {

    String Path="D:\\IDEA project\\Excel\\ExcelwithJava\\";

    private List<DemoData> data(){
       List<DemoData> list = new ArrayList<DemoData>();
       for(int i=0;i<10;i++){
           DemoData data = new DemoData();
           data.setString("字符串"+i);
           data.setDate(new Date());
           data.setDoubleData(0.56);
           list.add(data);
       }
       return list;
    }
    //根据list写入excel
    //根据ist写 excel
    @Test
    public void simplewrite() {
        String fileName = Path + "EasyTest.xlsx";
        //这里需要指定写用哪个 class去写，然后写到第一个 sheet，名字为模板然后文件流会自动关闭
        //write(fileName,格式类)
        //sheet（表名）
        //doWrite（数据）
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());
    }
    // 最简单的读
    @Test
    public void simpleRead() {
        String fileName = Path+"EasyExcel.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet().doRead();
    }



}
