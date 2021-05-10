package treinoMetodos;


public class TestaMetodos {
	// declarando vari�veis globais:
	static int soma, numero1=1000, numero2=2000;
	
	// static: n�o estanciado
	public static void main(String[] args) {
		
		// invocando metodo
		metodo();
		metodo2();
		metodo3();
		metodo4(400, 200);
		metodo5();

	}
	
	// criando metodo novo
	// pode-se colocar o que quiser dentro do m�todo
	public static void metodo() {
		System.out.println("Ol�, eu sou o m�todo 1.");
		
	}
	
	public static void metodo2() {
		soma = numero1 + numero2;
	}
	
	public static void metodo3() {
		System.out.println("eu sou o m�todo 3: " + soma);
	}
	
	public static void metodo4(int numero1, int numero2) {
		// estas vari�veis s� funcionam neste m�todo
		// s� pode colocar o n�mero na invoca��o do m�todo 
		int soma = numero1 + numero2;
		System.out.println("Eu sou o m�todo 4: " + soma);
	}
	
	public static void metodo5() {
		System.out.println(TestaMetodoFora.cont(1, 7));
	}

}
