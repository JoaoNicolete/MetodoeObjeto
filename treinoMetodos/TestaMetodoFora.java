package treinoMetodos;

public class TestaMetodoFora {
	
	static String cont(int i, int f) {
		
		String numeroString = "";
			for(int c = i; c <= f ; c++) {
				numeroString = numeroString + c + "\n";
			}
			return numeroString;
	}
	
}
