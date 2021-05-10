package exercicios;

public class Avião {
	
	private String modelo;
	private String marca;
	private int numDePassageiros;
	private double velocidade;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumDePassageiros() {
		return numDePassageiros;
	}
	public void setNumDePassageiros(int numDePassageiros) {
		this.numDePassageiros = numDePassageiros;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	void id() {
		System.out.println("===============================");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Número de passageiroso: " + numDePassageiros);
		System.out.println("Velocidade: " + velocidade + " km/h.");
		System.out.println("===============================");
	}
	
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
	

}
