package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double inicialDeposit) { //encapsulando apenas 1 ponto de alteração abaixo
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);

    }

    public int getNumber() {
        return number;
    }


    public java.lang.String getHolder() {
        return holder;
    }

    public void setHolder(java.lang.String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) { // encapsulando a regra de negocio relativa a negocio dentro deste metodo
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;;
    }

}
