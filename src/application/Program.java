package application;
import entities.Account;

import java.util.Scanner;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: "); // nº da conta
        int number = sc.nextInt();
        System.out.println("Enter account holder: "); // Nome do titular
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number,holder,initialDeposit); //inicializando constructor de 3 argumentos
        }
        else {
            account = new Account(number,holder); // sobrecarga constructor 2 argumentos, coloca 0 de saldo por padrão
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println(); // deposito
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println(); // Saque
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(account);





        sc.close();

    }
}

