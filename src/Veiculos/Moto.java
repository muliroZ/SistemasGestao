package Veiculos;

public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String placa, String marca, double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Veículo: Moto");
        super.mostrarDados();
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }

    public void mostrarDados(boolean tipo) {
        String potencia = tipo ? "Cavalos de Potência: " + cilindradas + "cv"
                : "Cilindradas: " + cilindradas + "cc";
        System.out.println("Veículo: Moto");
        super.mostrarDados();
        System.out.println(potencia);
    }
}
