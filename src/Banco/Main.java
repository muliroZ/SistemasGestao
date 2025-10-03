package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n- Sistema de Gestão Bancária -");
            System.out.println("1 - Cadastrar Conta Corrente");
            System.out.println("2 - Cadastrar Conta Poupança");
            System.out.println("3 - Cadastrar Conta Investimento");
            System.out.println("0 - Encerrar");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Número da conta: ");
                    String numeroCC = input.nextLine();
                    System.out.print("Titular: ");
                    String titularCC = input.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoCC = input.nextDouble();
                    System.out.print("Limite Cheque Especial: ");
                    double limite = input.nextDouble();

                    ContaCorrente cc = new ContaCorrente(numeroCC, titularCC, saldoCC, limite);

                    System.out.println("\n- Exibição Conta Corrente -");
                    System.out.println("1 - Mostrar dados básicos");
                    System.out.println("2 - Mostrar com limite detalhado");
                    System.out.println("3 - Mostrar sem detalhar limite");
                    System.out.println("4 - Mostrar com projeção (%)");
                    System.out.print("Escolha: ");
                    int escolhaCC = input.nextInt();

                    switch (escolhaCC) {
                        case 1 -> cc.mostrarDados();
                        case 2 -> cc.mostrarDados(true);
                        case 3 -> cc.mostrarDados(false);
                        case 4 -> {
                            System.out.print("Digite o percentual de projeção: ");
                            double perc = input.nextDouble();
                            cc.mostrarDados(perc);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Número da conta: ");
                    String numeroCP = input.nextLine();
                    System.out.print("Titular: ");
                    String titularCP = input.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoCP = input.nextDouble();
                    System.out.print("Taxa Rendimento Mensal (%): ");
                    double taxa = input.nextDouble();

                    ContaPoupanca cp = new ContaPoupanca(numeroCP, titularCP, saldoCP, taxa);

                    System.out.println("\n- Exibição Conta Poupança -");
                    System.out.println("1 - Mostrar dados básicos");
                    System.out.println("2 - Mostrar com taxa anual");
                    System.out.println("3 - Mostrar só taxa mensal");
                    System.out.println("4 - Mostrar com projeção (%)");
                    System.out.print("Escolha: ");
                    int escolhaCP = input.nextInt();

                    switch (escolhaCP) {
                        case 1 -> cp.mostrarDados();
                        case 2 -> cp.mostrarDados(true);
                        case 3 -> cp.mostrarDados(false);
                        case 4 -> {
                            System.out.print("Digite o percentual de projeção: ");
                            double perc = input.nextDouble();
                            cp.mostrarDados(perc);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Número da conta: ");
                    String numeroCI = input.nextLine();
                    System.out.print("Titular: ");
                    String titularCI = input.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoCI = input.nextDouble();
                    System.out.print("Taxa de Administração (%): ");
                    double taxaAdm = input.nextDouble();

                    ContaInvestimento ci = new ContaInvestimento(numeroCI, titularCI, saldoCI, taxaAdm);

                    System.out.println("\n- Exibição Conta Investimento -");
                    System.out.println("1 - Mostrar dados básicos");
                    System.out.println("2 - Mostrar com taxa considerada");
                    System.out.println("3 - Mostrar sem considerar taxa");
                    System.out.println("4 - Mostrar com projeção (%)");
                    System.out.print("Escolha: ");
                    int escolhaCI = input.nextInt();

                    switch (escolhaCI) {
                        case 1 -> ci.mostrarDados();
                        case 2 -> ci.mostrarDados(true);
                        case 3 -> ci.mostrarDados(false);
                        case 4 -> {
                            System.out.print("Digite o percentual de projeção: ");
                            double perc = input.nextDouble();
                            ci.mostrarDados(perc);
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nSistema encerrado. Obrigado por usar o banco!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        input.close();
    }
}
