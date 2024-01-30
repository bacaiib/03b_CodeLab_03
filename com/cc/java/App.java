package com.cc.java;

public class App {
  
    public static void main(String[] args) {

        MA_Advertising buchhalter = new MA_Advertising("Eschek", "Markus" , 1993, "123", "Führung", "Buchhalter");


        output(buchhalter.startsWork());
        output(buchhalter.doYourWork());


      
    }


    


    private static void output(String outStr) {
        System.out.println(outStr);
    }
}
