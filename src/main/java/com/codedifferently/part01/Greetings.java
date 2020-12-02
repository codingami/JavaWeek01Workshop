package com.codedifferently.part01;

import java.util.ArrayList;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        ArrayList<String> greetedNames = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("What's your name? \n");
        String name1 = "Hakim";
        String name2 = "Rasheeda";
        greetedNames.add(name1);
        greetedNames.add(name2);
        String username = scanner.nextLine();
        System.out.println(username);

        if(greetedNames.contains(username)) {
            System.out.println("Welcome!");
        }





    }
}
