package Veiculos;

public class Carro extends Veiculo {
    int numPortas;

    public Carro(String placa, String marca, double preco, int numPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Veículo: Carro");
        super.mostrarDados();
        System.out.println("Número de portas: " + numPortas);
    }

    public void mostrarDados(boolean ver) {
        String portas = ver ? "Numero de portas: " + numPortas : "";
        System.out.println("Veículo: Carro");
        super.mostrarDados();
        System.out.println(portas);
    }
}
