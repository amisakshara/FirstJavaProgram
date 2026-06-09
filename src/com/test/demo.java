package com.test;

public class demo {
    static void main(String[] args) {

       //reverse
        int  original =12345;
        int result = 0;
        System.out.println("original String :"+ original);
        while(original>0){
         int rem  =original%10;
         result = (result * 10) + rem;

            original = original /10;


        }

        System.out.println("Reverse String :"+ result);
        System.out.println("Login Feature");
    }

}
