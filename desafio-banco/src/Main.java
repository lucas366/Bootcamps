public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas);
        Conta poupanca = new ContaPoupaca(lucas);

        cc.depositar(150);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
