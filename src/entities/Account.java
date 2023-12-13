package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) { // sobrecarga construtor de 2 argumentos
        this.number = number;                   // chamado quando não houver deposito inicial
        this.holder = holder;
    }

    public Account(int number, String holder, double inicialDeposit) { //encapsulando apenas 1 ponto de alteração abaixo
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit); // caja tenha deposito inicial o deposito recebe a variavel local

    }

    public int getNumber() { // uma vez criado não pode ser modificado
        return number;
    }


    public java.lang.String getHolder() {
        return holder;
    }

    public void setHolder(java.lang.String holder) {
        this.holder = holder; // pode ser modificado em caso de divorcio ou casamento
    }

    public double getBalance() { // valor não pode ser alterado fora da regras de negocio
        return balance;
    }


    public void deposit(double amount) { // encapsulando a regra de negocio relativa a negocio dentro deste metodo
        balance += amount; // regra de negocio p/ deposito
    }

    public void withdraw(double amount){ // regra de negocio p/ saque + taxa de 5$
        balance -= amount + 5.0;
    }


    public String toString(){ // convertendo em String o account
        return "Account "
                + number
                + ", Holder: " // + para concatenação de strings
                + holder
                + ", Balance: $ "
                + String.format("%.2f",balance); // formatando casas decimais
    }

}
