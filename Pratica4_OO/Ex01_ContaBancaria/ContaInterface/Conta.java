package Ex01_ContaBancaria.ContaInterface;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
    
}
