package com.method;

public class javaScope {

    public static void main(String[] args){

        // Code here can't use x

        {// This is a block

            int x = 100;
            System.out.println(x);

        }// the block ends here

        // Code here can't use x
    }

}
