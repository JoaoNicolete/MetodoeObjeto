package exercicios;

public class Exercicio03 {

	public static void main(String[] args) {
		
		ProdutoEletronico pe = new ProdutoEletronico();
		
		pe.setModelo("Computador");
		pe.setMarca("Dell");
		pe.setPreco(3000);
		pe.setLoja("Amazon");
		
		pe.id();
		pe.desconto(250);
		System.out.println("O preço com desconto é de: " + pe.getPreco() + " reais");

	}

}
