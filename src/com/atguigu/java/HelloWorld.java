package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//这是单行注释

public class HelloWorld {



    public static final int INTITIAL_SIZE =10;

    public static void main (String [] args){
        System.out.println("helloworld!!!");
        System.out.println("helloworld!!!");

        ArrayList list = new ArrayList();


        Date date = new Date();

        list.add(0,123);

       // method();

        System.out.println(list);



    }

    public static void method(){

        int num =10;

        try {
            FileInputStream fls =new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static int getIntitialSize() {
        return INTITIAL_SIZE;
    }
}
