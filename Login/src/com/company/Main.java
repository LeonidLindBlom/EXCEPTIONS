package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String regex ="[\\w]{1,20}";
        Scanner loginScanner = new Scanner(System.in);
        Scanner passwordScanner = new Scanner(System.in);
        String login = loginScanner.nextLine();
        String password = passwordScanner.nextLine();
        String confirmPassword = passwordScanner.nextLine();
        Login log = new Login();
        Boolean a = log.checkCorrect(login, password,confirmPassword, regex);
        System.out.println(a);
    }
}
