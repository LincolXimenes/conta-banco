public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        public class ContaBancaria {
            private int numeroAgencia;
            private int numeroConta;
            private String nomeTitular;
            private double saldo;
        
            public ContaBancaria(int numeroAgencia, int numeroConta, String nomeTitular, double saldo) {
                this.numeroAgencia = numeroAgencia;
                this.numeroConta = numeroConta;
                this.nomeTitular = nomeTitular;
                this.saldo = saldo;
            }
        
            public void depositar(double valor) {
                saldo += valor;
            }
        
            public void sacar(double valor) {
                if (valor <= saldo) {
                    saldo -= valor;
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
            }
        
            public double getSaldo() {
                return saldo;
            }
        
            public void exibirInformacoes() {
                System.out.println("Agência: " + numeroAgencia);
                System.out.println("Conta: " + numeroConta);
                System.out.println("Titular: " + nomeTitular);
                System.out.println("Saldo: R$" + saldo);
            }
        }
    }
}
