package Banco;

public class ContaInvestimento extends Conta {
    private double taxaAdministracao;

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao) {
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() { return taxaAdministracao; }
    public void setTaxaAdministracao(double taxaAdministracao) { this.taxaAdministracao = taxaAdministracao; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de Administração: " + taxaAdministracao + "%");
    }

    public void mostrarDados(boolean considerarTaxa) {
        mostrarDados();
        if (considerarTaxa) {
            double saldoLiquido = getSaldo() - (getSaldo() * taxaAdministracao / 100);
            System.out.println("Saldo líquido após taxa: R$ " + saldoLiquido);
        }
    }
}
