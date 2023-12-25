package com.xmcu.convert;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    private String datePattern = "yyyy-MM-dd";//定义日期格式

    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
           throw new IllegalArgumentException(
                   "无效的日期格式，请使用这种日期格式"+datePattern
           );
        }
    }
}

