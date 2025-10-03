package Veiculos;

public class Veiculo {
    String placa;
    String marca;
    double preco;

    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$ " + preco);
    }

    public void mostrarDados(double descontoPercentual) {
        double precoComDesconto = preco - (preco * descontoPercentual / 100);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Preço com desconto de " + descontoPercentual + "%: R$" + precoComDesconto);
    }
}
