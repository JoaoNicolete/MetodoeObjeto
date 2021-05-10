package exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Carlos");
		cliente.setCpf(12345689);
		cliente.setFormaDePagamento("Débito");
		cliente.setClubeDeDescontos("Não");
		
		cliente.identificacao();
		cliente.troco(40, 50);
	
	}

}
