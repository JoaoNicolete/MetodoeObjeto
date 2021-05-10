package exercicios;

public class Paciente {
	
	private String nome;
	private String ala;
	private int idade;
	private String diagnostico;
	private String medico;
	private double altura;
	private double peso;
	private String alergias;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAla() {
		return ala;
	}
	public void setAla(String ala) {
		this.ala = ala;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	
	void identificacao(){
		System.out.println("===============================");
		System.out.println("Nome: " + nome);
		System.out.println("Ala: " + ala);
		System.out.println("Idade: " + idade + " anos.");
		System.out.println("Diagnóstico: " + diagnostico);
		System.out.println("Médico Responsável: " + medico);
		System.out.println("Altura: " + altura + " metros.");
		System.out.println("Peso: " + peso + " peso.");
		System.out.println("Alergias: " + alergias);
		System.out.println("===============================");
		
	}
	void alta(String alta) {
		if(alta == "sim" || alta == "Sim") {
			System.out.println("Este paciente está de alta");
		} else {
			System.out.println("Este paciente não está de alta");
		}
	}
	void imc() {
		double imc = (peso / (altura * altura));
		System.out.println("O IMC deste paciente é de: " + imc);
	}

}
