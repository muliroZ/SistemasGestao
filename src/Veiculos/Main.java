package Veiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n- Sistema de Gestão de Veículos -");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("3 - Cadastrar Caminhão");
            System.out.println("4 - Listar veículos cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Placa: ");
                    String placaCarro = input.nextLine();
                    System.out.print("Marca: ");
                    String marcaCarro = input.nextLine();
                    System.out.print("Preço: ");
                    double precoCarro = input.nextDouble();
                    System.out.print("Número de portas: ");
                    int portas = input.nextInt();
                    veiculos.add(new Carro(placaCarro, marcaCarro, precoCarro, portas));
                    break;

                case 2:
                    System.out.print("Placa: ");
                    String placaMoto = input.nextLine();
                    System.out.print("Marca: ");
                    String marcaMoto = input.nextLine();
                    System.out.print("Preço: ");
                    double precoMoto = input.nextDouble();
                    System.out.print("Cilindradas: ");
                    int cilindradas = input.nextInt();
                    veiculos.add(new Moto(placaMoto, marcaMoto, precoMoto, cilindradas));
                    break;

                case 3:
                    System.out.print("Placa: ");
                    String placaCam = input.nextLine();
                    System.out.print("Marca: ");
                    String marcaCam = input.nextLine();
                    System.out.print("Preço: ");
                    double precoCam = input.nextDouble();
                    System.out.print("Capacidade de carga (toneladas): ");
                    double carga = input.nextDouble();
                    veiculos.add(new Caminhao(placaCam, marcaCam, precoCam, carga));
                    break;

                case 4:
                    if (veiculos.isEmpty()) {
                        System.out.println("\nNenhum veículo cadastrado ainda!");
                        break;
                    }

                    System.out.println("\n--- Veículos cadastrados ---");
                    for (Veiculo veiculo : veiculos) {
                        System.out.println("\n--- " + veiculo.getClass().getSimpleName() + " ---");

                        System.out.print("Deseja aplicar desconto? (s/n): ");
                        String respDesconto = input.next();
                        if (respDesconto.equalsIgnoreCase("s")) {
                            System.out.print("Digite o percentual de desconto: ");
                            double desconto = input.nextDouble();
                            veiculo.mostrarDados(desconto);
                        } else {
                            if (veiculo instanceof Carro) {
                                System.out.print("Mostrar número de portas? (s/n): ");
                                String opc = input.next();
                                ((Carro) veiculo).mostrarDados(opc.equalsIgnoreCase("s"));
                            } else if (veiculo instanceof Moto) {
                                System.out.print("Mostrar potência em HP em vez de cilindradas? (s/n): ");
                                String opc = input.next();
                                ((Moto) veiculo).mostrarDados(opc.equalsIgnoreCase("s"));
                            } else if (veiculo instanceof Caminhao) {
                                System.out.print("Mostrar capacidade em Kg em vez de Toneladas? (s/n): ");
                                String opc = input.next();
                                ((Caminhao) veiculo).mostrarDados(opc.equalsIgnoreCase("s"));
                            } else {
                                veiculo.mostrarDados();
                            }
                        }
                        System.out.println("+++++++++++++++++++++++++");
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }
}