package treinoMetodos;


public class TestaMetodos {
	// declarando variáveis globais:
	static int soma, numero1=1000, numero2=2000;
	
	// static: não estanciado
	public static void main(String[] args) {
		
		// invocando metodo
		metodo();
		metodo2();
		metodo3();
		metodo4(400, 200);
		metodo5();

	}
	
	// criando metodo novo
	// pode-se colocar o que quiser dentro do método
	public static void metodo() {
		System.out.println("Olá, eu sou o método 1.");
		
	}
	
	public static void metodo2() {
		soma = numero1 + numero2;
	}
	
	public static void metodo3() {
		System.out.println("eu sou o método 3: " + soma);
	}
	
	public static void metodo4(int numero1, int numero2) {
		// estas variáveis só funcionam neste método
		// só pode colocar o número na invocação do método 
		int soma = numero1 + numero2;
		System.out.println("Eu sou o método 4: " + soma);
	}
	
	public static void metodo5() {
		System.out.println(TestaMetodoFora.cont(1, 7));
	}

}
