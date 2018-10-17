package com.imooc.order.utils;

import java.util.Random;

public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        int number = random.nextInt();

        return System.currentTimeMillis()+String.valueOf(number);
    }
}
