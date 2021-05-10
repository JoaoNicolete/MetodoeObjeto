package exercicios;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Flávio");
		funcionario.setCargo("Dev Júnior");
		funcionario.setIdentificacao(345);
		funcionario.setTurno("Matutino");
		funcionario.setSalario(5000);
		
		funcionario.id();
		funcionario.desconto(500);
		System.out.println("O salário com descontos é de: " + funcionario.getSalario());
		
		
		funcionario.bonus(200);
		System.out.println("O salário final, com bônus é de: " + funcionario.getSalario());
		
		
	}
	
	

}
