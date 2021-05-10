package exercicios;

public class ProdutoEletronico {
	
	private String modelo;
	private String marca;
	private int preco;
	private String loja;
	
	
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

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}

	void id() {
		System.out.println("===============================");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Preço: " + preco + " reais");
		System.out.println("Loja onde está disponível: " + loja);
		System.out.println("===============================");
	}
	
	void desconto(int desconto) {
		preco = preco - desconto;
	}
	

}
