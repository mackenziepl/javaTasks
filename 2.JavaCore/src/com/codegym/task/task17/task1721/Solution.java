package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    static Boolean debug = false; // you can name the variable anything you want;

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            File file1 = new File("e:\\Java\\CodeGym\\CodeGymTasks\\2.JavaCore\\src\\com\\codegym\\task\\task17\\task1721\\file1.txt");
//            File file2 = new File("e:\\Java\\CodeGym\\CodeGymTasks\\2.JavaCore\\src\\com\\codegym\\task\\task17\\task1721\\file2.txt");
//            if (debug) {
////            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////            String s1 = debug ? "e:\\Java\\CodeGym\\CodeGymTasks\\2.JavaCore\\src\\com\\codegym\\task\\task17\\task1721\\file1.txt" : br.readLine();
////            String s2 = debug ? "e:\\Java\\CodeGym\\CodeGymTasks\\2.JavaCore\\src\\com\\codegym\\task\\task17\\task1721\\file2.txt" : br.readLine();
////            }
            String s1 = br.readLine();
            String s2 = br.readLine();

            readFile(allLines, s1);
            readFile(linesForRemoval, s2);

            Solution solution = new Solution();
            solution.joinData();
    }

    public void joinData() throws CorruptedDataException {

            int i = 0;
            for (String str1 : allLines) {
                for (String str2 : linesForRemoval) {
                    if(str1.equals(str2)) {
                        i++;
                    }
                }
            }

            if(i == linesForRemoval.size()) {
               allLines.removeAll(linesForRemoval);
            } else {
                allLines.clear();
                throw new CorruptedDataException();
            }
    }

    public static void readFile(List<String> list, String s){
        try {
            BufferedReader br = new BufferedReader(new FileReader(s));
            String line;
            while ((line = br.readLine()) != null){
                list.add(line);
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
