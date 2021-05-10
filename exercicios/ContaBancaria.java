package exercicios;

public class ContaBancaria {
	
	private String banco;
	private int conta;
	private int agencia;
	private String nomeDoTitular;
	private double saldo;
	private int cpf;
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	void id() {
		System.out.println("===============================");
		System.out.println("Banco: " + banco);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Nome do Titular: " + nomeDoTitular );
		System.out.println("CPF: " + cpf);
		System.out.println("Saldo: " + saldo + " reais");
		System.out.println("===============================");
	}
	void saque(double saque) {
		saldo = saldo - saque;
	}
	void deposito(double deposito) {
		saldo = saldo + deposito;
	}
	
}
