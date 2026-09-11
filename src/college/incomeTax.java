package college;

import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = sc.nextLine();
        System.out.println("Enter your income");
        double salary = sc.nextDouble();
        double tax = 0.0;
        if (gender.equals("male")) {
             if (salary <= 180000)       tax = 0;
             else if (salary <= 500000)  tax = (salary - 180000) * 0.10;
             else if (salary <= 800000)  tax = (32000 * 0.10) + (salary - 500000) * 0.20;
             else if (salary >= 800000)  tax = (320000 * 0.10) + (300000 * 0.20) + (salary - 800000) * 0.30;
             System.out.println(tax);

        }
        else if (gender.equals("female"))
            if (salary <= 190000) tax = 0;
            else if (salary <= 500000) tax = (salary - 190000) * 0.10;
            else if (salary <= 800000) tax = (31000 * 0.10) + (salary - 500000) * 0.20;
            else if (salary >= 800000) tax = (310000 * 0.10) + (300000 * 0.20) + (salary - 800000) * 0.30;
            System.out.println(tax);
        }
    }


