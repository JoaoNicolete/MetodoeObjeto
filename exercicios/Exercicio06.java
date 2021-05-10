package exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.setBanco("Bradesco");
		conta.setAgencia(1234);
		conta.setConta(56789);
		conta.setNomeDoTitular("Harry Potter");
		conta.setCpf(123456789);
		conta.setSaldo(1.90);
		
		conta.id();
		conta.deposito(500.50);
		System.out.println("Novo saldo: " + conta.getSaldo() + " reais.");
		
		conta.saque(70.00);
		System.out.println("Novo saldo: " + conta.getSaldo() + " reais.");

		
		

	}

}
