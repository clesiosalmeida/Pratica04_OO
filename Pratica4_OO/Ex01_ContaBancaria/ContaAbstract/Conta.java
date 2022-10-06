package Ex01_ContaBancaria.ContaAbstract;

abstract class Conta{
    private double saldo;


    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimeExtrato(); //❓Publico e abastrato?


}

