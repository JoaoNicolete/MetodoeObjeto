package exercicios;

public class Funcionario {
	
	private String nome;
	private int identificacao;
	private String cargo;
	private String turno;
	private int salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	void id() {
		System.out.println("===============================");
		System.out.println("Nome: " + nome);
		System.out.println("Número de identificação: " + identificacao);
		System.out.println("Cargo: " + cargo);
		System.out.println("Turno: " + turno);
		System.out.println("Salário: " + salario + " reais");
		System.out.println("===============================");
	}
	
	void desconto(int desconto) {
		salario = salario - desconto;
	}
	void bonus(int bonus) {
		salario = salario + bonus;
	}
	

}
