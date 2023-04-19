package org.ia.strings;
import java.util.Scanner;

public class BasicStrings {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);

        System.out.println("This program takes in your name and concatenates it!");

        System.out.println("Hello, please enter your first name:");
        String first = inputName.next();

        System.out.println("Please enter your middle name, if no middle name type NA:");
        String middle = inputName.next();

        System.out.println("Please enter your last name:");
        String last = inputName.next();

        System.out.println("Please enter your suffix:");
        String suffix = inputName.next();

        if (middle.equals("NA")){
            System.out.println(first + " " + last + " " + suffix);
        } else{
            System.out.println(first + " " + middle + " " + last + " " + suffix);
        }
    }
}