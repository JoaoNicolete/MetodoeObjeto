package treinoClasses;

public class TestaAluno {

	public static void main(String[] args) {
		
		// instanciando um objeto
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.nome = "João";
		aluno1.idade = 23;
		aluno1.curso = "Letras";
		
		aluno2.nome = "Yoshi";
		aluno2.idade = 20;
		aluno2.curso = "Ciências da Computação";
		
		
		aluno1.assistirAula();
		aluno1.trancarCurso();
		aluno1.fazerProva();
		
		aluno2.assistirAula();
		aluno2.fazerProva();
		aluno2.trancarCurso();
		
		System.out.println(aluno1.nome);
		System.out.println(aluno2.nome);
		System.out.println(aluno1.curso);
		System.out.println(aluno2.curso);
		

	}

}
