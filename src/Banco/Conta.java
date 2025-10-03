package Banco;

public class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void mostrarDados() {
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void mostrarDados(double projecaoMensal) {
        double saldoProjetado = saldo + (saldo * projecaoMensal / 100);
        mostrarDados();
        System.out.println("Saldo projetado (+" + projecaoMensal + "%): R$ " + saldoProjetado);
    }
}
