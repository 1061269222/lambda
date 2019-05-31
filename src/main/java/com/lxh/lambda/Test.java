package com.lxh.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author: leixinhua
 * @Date 2019-05-30 10:57
 * @Description:
 */
public class Test {
    private  static List<String> items=new ArrayList<>();
    private  static Map<String,Integer> maps=new HashMap<String,Integer>();
    private  static List<Person> personList=new ArrayList<Person>();

    static{
        items.add("A");
        items.add("BC");
        items.add("cB");
        items.add("D");
        items.add("E");
    }

    static{
        maps.put("A",2);
        maps.put("s",3);
        maps.put("l",4);
        maps.put("d",5);
        maps.put("g",6);
    }

    static{
        Person person=new Person();
        person.setId(1);
        person.setName("lxh");
        person.setAddress("湖南");
        Person person1=new Person();
        person.setId(2);
        person.setName("小老弟");
        person.setAddress("土疙瘩");

        personList.add(person);
        personList.add(person1);
    }
    public static void main(String[] args) {
//        for (String str:items) {
//            System.out.println(str);
//        }
        /*items.forEach(c-> System.out.println(c));*/

      /**过滤
       *  items.forEach(item->{
            if(item.equals("C"))
              System.out.println(item);
            else
                System.out.println("没有！");
        });*/


/*
过滤
      items.stream().filter(s->s.contains("B")).forEach(c1->System.out.println(c1));
*/
/*
        System.out.println(items.toString());
*/
/*
        items.forEach((key,value)-> System.out.println("key:"+key+"  value:"+value));
*/

        Map<String,List<Person>> collect=personList.stream().collect(Collectors.groupingBy(c -> c.getAddress()));
        System.out.println(collect);
    }
}


