package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        final String username = new String("john123");
        final String password = new String("$Doe123");

        Scanner sc = new Scanner(System.in);
        String user, pw;

        System.out.print("User Name: ");
        user = sc.nextLine();
        System.out.print("Password: ");
        pw = sc.nextLine();

        if(user.toLowerCase().equals(username) && pw.equals(password))
        {
            //You may come in
            System.out.println("WELCOME!");
        }
        else
            System.out.println("I DON'T KNOW YOU!");
    }
}
