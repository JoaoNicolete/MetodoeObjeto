package exercicios;

public class Cliente {
	
	
	//Atributos
	private String nome;
	private int cpf;
	private String formaDePagamento;
	private String clubeDeDescontos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public String getClubeDeDescontos() {
		return clubeDeDescontos;
	}
	public void setClubeDeDescontos(String clubeDeDescontos) {
		this.clubeDeDescontos = clubeDeDescontos;
	}
	
	//Métodos:
	
	void identificacao(){
		System.out.println("===============================");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Forma de pagamento: " + formaDePagamento);
		System.out.println("Clube de Descontos?: " + clubeDeDescontos);
		System.out.println("===============================");
	}
	public int troco(int total, int pago) {
		System.out.println("O troco é: ");
		int troco = pago - total;
		System.out.println(troco);
		return troco;
	}
	

}
