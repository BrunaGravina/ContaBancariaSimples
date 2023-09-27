import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double saldoInicial = 1999.00;
        System.out.println("""
                Olá e bem vindo a sua conta bancária!
                Nome: Bruna linda
                Tipo de conta: Corrente
                Saldo atual:  """ + saldoInicial + """
                O que deseja fazer?""");
        int opcao = 0;
        double saldoAtual = 2500.00;
        String menu = """
                1 - Consultar saldos;
                2 - Receber valor;
                3 - Transferir valor;
                4 - Sair;""";

        while (opcao != 4) {
            System.out.println(menu);
            opcao = e.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é de: " + saldoAtual + "reais.");
            } else if (opcao == 2) {
                System.out.println("Que valor deseja receber?");
                double saldoNovo = e.nextDouble();
                saldoAtual += saldoNovo;
                System.out.println(saldoNovo + " reais recebidos com sucesso!\n");
            } else if (opcao == 3) {
                System.out.println("Que valor deseja transferir?");
                double saldoTransferido = e.nextDouble();
                if (saldoTransferido > saldoAtual) {
                    System.out.println("Desculpe, seu saldo é insuficiente para realizar esta operação\n");
                } else {
                    saldoAtual -= saldoTransferido;
                    System.out.println(saldoTransferido + " reais transferidos com sucesso!");
                }

            } else if (opcao != 4) {
                System.out.println("opcao inválida");


            }

        }

    }
}

