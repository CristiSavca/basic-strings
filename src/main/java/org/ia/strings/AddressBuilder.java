package org.ia.strings;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println("Please provide the following information:");
        Scanner in = new Scanner(System.in);

        System.out.print("Full Name: ");
        sb.append("\n").append(in.nextLine()).append("\n\n");

        System.out.print("Billing Street: ");
        sb.append("Billing Address:\n");
        sb.append(in.nextLine()).append("\n");

        System.out.print("Billing City: ");
        sb.append(in.nextLine()).append(", ");

        System.out.print("Billing State: ");
        sb.append(in.nextLine()).append(" ");

        System.out.print("Billing Zip: ");
        sb.append(in.nextLine()).append("\n\n");

        System.out.print("Shipping Street: ");
        sb.append("Shipping Address:\n");
        sb.append(in.nextLine()).append("\n");

        System.out.print("Shipping City: ");
        sb.append(in.nextLine()).append(", ");

        System.out.print("Shipping State: ");
        sb.append(in.nextLine()).append(" ");

        System.out.print("Shipping Zip: ");
        sb.append(in.nextLine());

        String mySkills = sb.toString();
        System.out.println(mySkills);
    }
}