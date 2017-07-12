package com.arun.LambdaExpressions;

interface ToSplit {
    public String[] toSplitAString(String s1);
}

/**
 * Created by Adwiti on 7/12/2017.
 */
public class SplitFunctionality {
    public static void main(String[] args) {

        String str = "a,b";
        ToSplit sp = (s1) -> s1.split(",");
        String [] splitWord = doSplit(sp,str);
        for (String s : splitWord){
            System.out.println(s);
        }
    }


    public static String []  doSplit(ToSplit sp, String s1){
        return sp.toSplitAString(s1);
    }
}
