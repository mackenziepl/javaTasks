package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = new FileInputStream(args[1]);
        FileOutputStream fileOut = new FileOutputStream(args[2]);
        if(args[0].equals("-e")) {
            cypher(fileIn, fileOut);
        }
        else if(args[0].equals("-d")) {
            cypher(fileIn, fileOut);
        }
        fileIn.close();
        fileOut.close();
    }

    public static FileOutputStream cypher(FileInputStream file1, FileOutputStream file2) throws IOException {
        while(file1.available() > 0) {
            int data = file1.read();
            file2.write(data ^ 0x7b);
        }
        return file2;
    }
}
