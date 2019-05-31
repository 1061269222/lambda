package com.lxh.lambda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: leixinhua
 * @Date 2019-05-30 16:57
 * @Description:
 */
public class a {
    public static void main(String[] args) {
        System.out.println(get());
    }
    public static String get(){
        Map<String,String> beans=new HashMap();
        beans.put("name","雷新华");

        System.out.println(beans.toString());

        if(beans!=null && !beans.isEmpty()){

            Iterator<String> iterator=beans.keySet().iterator();
            while (iterator.hasNext()){
                String str=iterator.next();
                System.out.println(str);

                return beans.get(str);
            }
        }
        return null;
    }
}

