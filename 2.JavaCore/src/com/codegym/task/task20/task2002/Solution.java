package com.codegym.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
Reading and writing to a file: CodeGym

*/
public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here
            User user1 = new User();
            user1.setFirstName("John");
            user1.setLastName("Rambo");
            user1.setBirthDate(sdf.parse("11 11 1951"));
            user1.setMale(true);
            user1.setCountry(User.Country.UNITED_STATES);
            User user2 = new User();
            user2.setFirstName("Leo");
            user2.setLastName("Messi");
            user2.setBirthDate(sdf.parse("03 06 1991"));
            user2.setMale(true);
            user2.setCountry(User.Country.OTHER);
            codeGym.users.add(user1);
            codeGym.users.add(user2);

            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object
            if(codeGym.equals(loadedObject)) {
                System.out.println("Yes, the codeGym object is equal to the loadedObject object");
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            for (User user : users) {
                printWriter.println(user.getFirstName());
                printWriter.println(user.getLastName());
                printWriter.println(sdf.format(user.getBirthDate()));
                printWriter.println(user.isMale());
                printWriter.println(user.getCountry());
            }
            printWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            while (br.ready()) {
                User user = new User();
                user.setFirstName(br.readLine());
                user.setLastName(br.readLine());
                user.setBirthDate(sdf.parse(br.readLine()));
                user.setMale(Boolean.parseBoolean(br.readLine()));
                user.setCountry(User.Country.valueOf(br.readLine()));
                users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
