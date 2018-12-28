package com.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Tracking changes

*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        br.close();
        BufferedReader brFileIn1 = new BufferedReader(new FileReader(fileName1));
        BufferedReader brFileIn2 = new BufferedReader(new FileReader(fileName2));
        List<String> originalFile = brFileIn1.lines().collect(Collectors.toList());
        List<String> modifiedFile = brFileIn2.lines().collect(Collectors.toList());

        while(originalFile.size() != 0 && modifiedFile.size() != 0) {
            if(originalFile.get(0).equals(modifiedFile.get(0))) {
                lines.add(new LineItem(Type.SAME, originalFile.remove(0)));
                modifiedFile.remove(0);
            }
            else if(originalFile.size() != 1 && originalFile.get(1).equals(modifiedFile.get(0))) {
                lines.add(new LineItem(Type.REMOVED, originalFile.remove(0)));
            }
            else if(modifiedFile.size() != 0 && originalFile.get(0).equals(modifiedFile.get(1))) {
                lines.add(new LineItem(Type.ADDED, modifiedFile.remove(0)));
            }
        }

        if (originalFile.size() != 0) {
            lines.add(new LineItem(Type.REMOVED, originalFile.remove(0)));
        } else if (modifiedFile.size() != 0) {
            lines.add(new LineItem(Type.ADDED, modifiedFile.remove(0)));
        }

        System.out.println("original\tupdated\t\tmerged");
        System.out.println("file1:\t\tfile2:\t\tResult: (lines)");
        System.out.println();
        int i = 0;
        for(LineItem l : lines) {
            i++;
            if(l.type.equals(Type.SAME)) {
                System.out.print("line" + i + "\t\t");
                System.out.print("line" + i + "\t\t");
                System.out.println(l.type + " line" + i);
            }
            else if(l.type.equals(Type.ADDED)) {
                System.out.print("\t\t\t");
                System.out.print("line" + i + "\t\t");
                System.out.println(l.type + " line" + i);
            }
            else if(l.type.equals(Type.REMOVED)) {
                System.out.print("line" + i + "\t\t");
                System.out.print("\t\t\t");
                System.out.println(l.type + " line" + i);
            }
        }

        brFileIn1.close();
        brFileIn2.close();
    }

    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " +  line;
        }
    }
}
