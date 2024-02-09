package org.example;

import org.example.pj2.Test;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String username = "user1";
        String password = "abc";
        Test.main(new String[]{username,password});
    }
}