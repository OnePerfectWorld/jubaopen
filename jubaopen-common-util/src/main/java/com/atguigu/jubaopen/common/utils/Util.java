package com.atguigu.jubaopen.common.utils;

import static org.springframework.util.ObjectUtils.isEmpty;

public class Util {

    public static boolean isNotEmpty(Object obj){
        if (obj==null){

            return false;
        }
        if (obj instanceof String){

            return !("".equals(obj));
        }

        return !isEmpty(obj);

    }
}
