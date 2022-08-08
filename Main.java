public class Main {

    public static void main(String[] args) {
        Conta cc = new contaCorrente();
        Conta poupanca = new contaPoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
