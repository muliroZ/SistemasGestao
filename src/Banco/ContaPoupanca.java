package Banco;

public class ContaPoupanca extends Conta {
    private double taxaRendimentoMensal;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRendimentoMensal) {
        super(numero, titular, saldo);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public double getTaxaRendimentoMensal() { return taxaRendimentoMensal; }
    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) { this.taxaRendimentoMensal = taxaRendimentoMensal; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa Rendimento Mensal: " + taxaRendimentoMensal + "%");
    }

    public void mostrarDados(boolean emTaxaAnual) {
        mostrarDados();
        if (emTaxaAnual) {
            System.out.println("Taxa Anual Aproximada: " + (taxaRendimentoMensal * 12) + "%");
        }
    }
}
