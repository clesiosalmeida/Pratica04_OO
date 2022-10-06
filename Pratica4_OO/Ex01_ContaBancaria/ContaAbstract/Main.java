package Ex01_ContaBancaria.ContaAbstract;

public class Main {


    public static void main(String[] args) {
        
        Conta cp = new ContaPoupança(0);
       
        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }

}
