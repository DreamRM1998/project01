package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author zw
 * @date 4/14/21 - 4:16 PM
 *
 * 1、idea中代码模版所处的位置：setting- Editor - Live Templates / Postfix Completion
 * 2、常用模版
 */
public class Templatestest {

    //模版六：prsf:可生成private static final
    private static final Customer cust = new Customer();

    //变形：psf
    public static final int NUM =1;

    //变形：psfi
    public static final int NUM2 =2;
    //变形：psfs
    public static final String NATION ="China";



    //模版一：psvm
    public static void main(String[] args) {

        //模版二：sout
        System.out.println( );
        //变形：soutp / soutm/ soutv/ xxx.out
        System.out.println("args = [" + args + "]");
        System.out.println("Templatestest.main");

        int num1 =10;
        int num2 =20;
        System.out.println("num2 = " + num2);//就近选择变量
        System.out.println(num1);


        //模版三：fori
        String[] arr= new String[]{"Tom","Jerry","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模版四：list.for 增强for循环
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

        //变形：list.fori  普通for循环
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr  逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        System.out.println("Templatestest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        //模版五：ifn

        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn或 xxx.null
        if (list != null) {

        }

        if (list == null) {

        }



    }





}
