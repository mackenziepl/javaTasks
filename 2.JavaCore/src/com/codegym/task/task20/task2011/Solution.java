package com.codegym.task.task20.task2011;

import java.io.*;

/*
Externalizable for apartments

*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) {
            try {
            out.writeObject(address);
            out.writeInt(year);
            } catch (IOException e) {}

        }

        @Override
        public void readExternal(ObjectInput in) {
            try {
                address = (String) in.readObject();
                year = in.readInt();
            } catch (ClassNotFoundException e) {}
            catch (IOException e) {}
        }
    }

    public static void main(String[] args) {

    }
}
