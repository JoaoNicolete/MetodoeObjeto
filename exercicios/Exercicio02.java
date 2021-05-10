package exercicios;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Avião aviao = new Avião();
		
		aviao.setMarca("Boing");
		aviao.setModelo("14 Bis");
		aviao.setNumDePassageiros(14);
		aviao.setVelocidade(350);
		
		aviao.id();
		aviao.acelerar(100);
		System.out.println("A nova velocidade é de: " + aviao.getVelocidade());
		
		
		aviao.freiar(200);
		System.out.println("A nova velocidade é de: " + aviao.getVelocidade());
		
		
		
	}

}
