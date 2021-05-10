package treinoClasses;

public class Carro {
	
	// Atributos
	
	String nome;
	String marca;
	int ano; 
	int velocidade;
	
	//metodos
	
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	} 
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
	
	

}
