package com.example;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();  //lines


        //save numbers in an array list
        int d,q,x,y;

        ArrayList[] set = new ArrayList[n];

        for(int i=0; i<n ; i++){

            d = scan.nextInt();
            set[i] = new ArrayList();
            for(int j =0; j<d; j++){
                set[i].add(scan.nextInt());
            }
        }

        //answer the queries
        q = scan.nextInt();

        for (int i=0; i<q; i++){
               x = scan.nextInt();
               y = scan.nextInt();

               try {
                   System.out.println(set[x - 1].get(y - 1));
               } catch(Exception ex){
                   System.out.println("ERROR!");
               }
        }







    }
}