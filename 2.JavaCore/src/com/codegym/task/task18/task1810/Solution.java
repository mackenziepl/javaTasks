package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String fileName = br.readLine();
                FileInputStream file = new FileInputStream(fileName);
                if (file.available() < 1000) {
                    file.close();
                    throw new DownloadException();
                }

                while (file.available() > 0) {
                    int data = file.read();
                }
            }
    }

    public static class DownloadException extends Exception {
    }
}
