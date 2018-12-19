package com.codegym.task.task09.task0929;

import java.io.*;

/* 
Let's make the code do something useful!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream;
        while (true) {
            try {
                String sourceFileName = reader.readLine();
                fileInputStream = getInputStream(sourceFileName);
                if(fileInputStream.available() > 0)
                    break;
            }
            catch (FileNotFoundException e) {
                System.out.println("File does not exist.");
            }
        }

            String destinationFileName = reader.readLine();
            OutputStream fileOutputStream = getOutputStream(destinationFileName);
            int count = 0;
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
                count++;
            }

            fileInputStream.close();
            fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

