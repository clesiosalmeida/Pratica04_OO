public class ContaCorrente implements Conta{ //implements: palavra reservada para implemetar classes (Interface)
    private double saldo;
    private double taxaOperacao = 0.45; 

    @Override //Substituir, está implementando os metodos
        public void depositar(double valor){
            this.saldo += valor - taxaOperacao;
        }

    @Override
        public double getSaldo(){
            return this.saldo;
        }    

    @Override
        public void sacar (double valor){
            this.saldo -=valor +taxaOperacao;
        }    

}
