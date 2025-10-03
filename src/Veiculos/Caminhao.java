package Veiculos;

public class Caminhao extends Veiculo {
    double capacidadeCarga;

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Veículo: Caminhão");
        super.mostrarDados();
        System.out.println("Capacidade: " + capacidadeCarga + " toneladas");
    }

    public void mostrarDados(boolean tipo) {
        String carga = tipo ? "Capacidade: " + capacidadeCarga + " toneladas"
                : "Capacidade: " + capacidadeCarga*1000 + " quilos";
        System.out.println("Veículo: Caminhão");
        super.mostrarDados();
        System.out.println(carga);
    }
}
