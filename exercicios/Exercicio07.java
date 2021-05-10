package exercicios;

public class Exercicio07 {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		
		paciente.setNome("Spok");
		paciente.setAla("Emergencia");
		paciente.setAlergias("Penicilina");
		paciente.setAltura(1.64);
		paciente.setDiagnostico("Covid 19");
		paciente.setIdade(23);
		paciente.setMedico("Dr. Jean-Luc Picard");
		paciente.setPeso(60);
		
		paciente.identificacao();
		paciente.alta("Não");
		paciente.imc();
		
		

	}

}
