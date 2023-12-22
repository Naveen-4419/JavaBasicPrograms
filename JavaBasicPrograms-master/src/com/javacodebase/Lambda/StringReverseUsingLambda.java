package com.javacodebase.Lambda;


public class StringReverseUsingLambda {
    public static void main(String[] args) {

        String s= "Meghana Ram";

        InterfaceFunctional interfaceObj= (String str) -> {
            String revStr="";
            char c[]=str.toCharArray();
            for(char ch: c){
                revStr=ch+revStr;
            }
            return revStr;
        };

        String revStr= interfaceObj.lambdaFunction(s);
        System.out.println(revStr);

    }



}

