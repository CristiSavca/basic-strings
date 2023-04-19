package org.ia.strings;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String s = scanner.nextLine().trim();

        String[] word = s.split(" ");
        String[] types = {"First", "Middle", "Last"};

        if (word.length > 2){
            for (int i = 0; i < word.length; i++){
                System.out.println(types[i] + " name: " + word[i]);
            }
        } else{
            String[] word2 = {word[0], "(none)", word[1]};
            for (int i = 0; i < word2.length; i++){
                System.out.println(types[i] + " name: " + word2[i]);
            }
        }
    }
}