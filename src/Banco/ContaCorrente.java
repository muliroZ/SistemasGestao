package Banco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial) {
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() { return limiteChequeEspecial; }
    public void setLimiteChequeEspecial(double limiteChequeEspecial) { this.limiteChequeEspecial = limiteChequeEspecial; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite Cheque Especial: R$ " + limiteChequeEspecial);
    }

    public void mostrarDados(boolean detalharLimite) {
        mostrarDados();
        if (detalharLimite) {
            System.out.println("Saldo disponível (com limite): R$ " + (getSaldo() + limiteChequeEspecial));
        }
    }
}

