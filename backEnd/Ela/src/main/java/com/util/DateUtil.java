package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String dateFormat(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return simpleDateFormat.format(new Date());
    }

    public static void main(String[] args) {

        System.out.println(dateFormat());
    }
}
