package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        InputStream inStream = new FileInputStream(fileName);
        //OutputStream outStream = new FileOutputStream("e:\\Temp\\result.txt");

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //read one int from the input stream
            String out = Character.toString((char) data);
            System.out.print(out);
            //outStream.write(data); //write that int to the other stream.
        }


        inStream.close();
        //outStream.close();
        br.close();
    }
}