package treinoMetodos;

public class TestaMetodosSobrecarregados {
	public static void main(String[] args) {
		
		MinhaCalculadora mc = new MinhaCalculadora();
		
		//somando dois n�meros inteiros
		System.out.println(mc.soma(20, 30));
		
		//somando 3 n�meros inteiros
		System.out.println(mc.soma(250, 250, 250));
		
		//somando dois n�meros doubles
		System.out.println(mc.soma(3.6, 6.7));
		
	}

}
