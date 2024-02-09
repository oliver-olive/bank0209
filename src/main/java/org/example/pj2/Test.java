package org.example.pj2;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {


        if (args.length != 2) {
            System.out.println("<Usage> java LoginValidate <UserName> <Password>");
            return;
        }
        String username = args[0];
        String password = args[1];
        if (isValidCredentials(username, password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username/password");
        }
    }

    private static boolean isValidCredentials(String inputUsername, String inputPassword) throws IOException {
        try {
            File f1 = new File("/Users/oliverzheng/Desktop/IdeaProjects/Bank0209/src/main/java/org/example/pj2/login.txt");
            if (!f1.exists()) {
                System.out.println("File does not exist");
            }
            FileInputStream fis = new FileInputStream(f1);
            BufferedReader reader = new BufferedReader(new FileReader(f1));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            String[] infos = content.toString().split("\n");
            for (String info : infos) {
                String[] credentials = info.split(",");
                if (credentials.length == 2) {
                    String storedUsername = credentials[0].trim();
                    String storedPassword = credentials[1].trim();
                    if (storedUsername.equals(inputUsername) && storedPassword.equals(inputPassword)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
