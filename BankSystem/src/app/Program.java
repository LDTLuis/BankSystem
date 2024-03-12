package app;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account acc = null;

        System.out.print("Enter with account number: ");
        int number = sc.nextInt();

        System.out.print("Enter with account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        response = Character.toLowerCase(response);

        if (response == 'y') {
            System.out.println();
            System.out.print("Enter initial deposit value: ");
            double initialDep = sc.nextDouble();
            acc = new Account(number, holder, initialDep);
        }
        else if (response == 'n') {
            acc = new Account(number, holder);
        }
        else {
            System.out.println("Sintaxe error.");
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(acc);

        System.out.println();
        System.out.print("Enter with a deposit value: ");
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(acc);

        System.out.println();
        System.out.print("Enter with a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);

        System.out.print("Updated account data: ");
        System.out.println(acc);

        sc.close();

    }
}
