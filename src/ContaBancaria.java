import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        int operacao = 0;
        double valorTranferencia;

        String nome = "Thiago Agostinho";
        String tipoConta = "corrente";
        double saldo = 1500;

        System.out.println("*".repeat(20));
        System.out.println("Dados da conta bancária do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("*".repeat(20));


        while(operacao != 4) {
            System.out.println("Operações: \n");
            System.out.println("\n 1 - Consultar saldos \n 2 - Receber valor \n 3 - Transferir valor \n 4 - Sair");
            operacao = leitura.nextInt();

            if (operacao == 1){
                System.out.println("O seu saldo atual é " + saldo);
            } else if (operacao == 2) {
                System.out.println("Informe o valor a ser recebido: ");
                saldo += leitura.nextInt();
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (operacao == 3) {
                System.out.println("Informe o valor a ser tranferido: ");
                valorTranferencia = leitura.nextInt();

                    if(valorTranferencia > saldo){
                        System.out.println("Não há saldo suficiente para a transferência.");
                    } else {
                        saldo -= valorTranferencia;
                    System.out.println("Saldo atualizado: R$" + saldo );
                    }
            } else if (operacao != 4){
                System.out.println("Opção inválida");
            }
        }
        System.out.println("Sistema encerrado. Obrigado, " + nome + "!");
        leitura.close();
    }
}
