package exercicios;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Fl�vio");
		funcionario.setCargo("Dev J�nior");
		funcionario.setIdentificacao(345);
		funcionario.setTurno("Matutino");
		funcionario.setSalario(5000);
		
		funcionario.id();
		funcionario.desconto(500);
		System.out.println("O sal�rio com descontos � de: " + funcionario.getSalario());
		
		
		funcionario.bonus(200);
		System.out.println("O sal�rio final, com b�nus � de: " + funcionario.getSalario());
		
		
	}
	
	

}
