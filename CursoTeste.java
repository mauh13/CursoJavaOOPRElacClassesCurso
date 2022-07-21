package senac.entra21.java.oop.lista04;

import java.util.Scanner;

public class CursoTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Curso curso = new Curso();
		CursoProfessor profe = new CursoProfessor(); 
		
		
		System.out.println("Vamos cadastrar o curso");
		System.out.print("\nFavor informar o nome do curso: ");
		curso.setNome(leia.next());
		
		System.out.print("Favor informar o horário: ");
		curso.setHorario(leia.next());
		
		System.out.println("\nVamos cadastrar o(a) professor(a) do curso " + curso.getNome());
		System.out.print("Favor informar o nome do(a) professor(a): ");
		profe.setNome(leia.next());
		
		System.out.print("Favor informar o departamento do(a) professor(a) " + profe.getNome() + ": ");
		profe.setDepartamento(leia.next());
		
		System.out.print("Favor informar o e-mail do(a) professor(a) " + profe.getNome() + ": ");
		profe.setEmail(leia.next());
		
		curso.setProfessor(profe);
			
		System.out.println("\nVamos cadastrar os alunos(as)");
		System.out.print("Quantos alunos(as) deseja cadastrar? ");
		
		CursoAluno alunox[] = new CursoAluno[leia.nextInt()];
		
		for (int i=0; i<alunox.length; i++) {
			
			CursoAluno aluno = new CursoAluno();
			
			System.out.println("\nCadastrando o " + (i+1) + "º aluno(a): ");
			System.out.print("Nome: ");
			aluno.setNome(leia.next());
			System.out.print("Matricula: ");
			aluno.setMatricula(leia.next());
			
			System.out.println("\nQuantas notas cadastrar para " + aluno.getNome() + "?");
			double notax[] = new double [leia.nextInt()];
			
			for (int j=0; j<notax.length; j++) {
				System.out.println("Informe a " + (j+1) + "ª nota de " + aluno.getNome() + ": ");
				notax[j] = leia.nextDouble();
			}
			
			aluno.setNotas(notax);
			alunox [i] = aluno;
		}	
					
		curso.setAlunos(alunox);
		
		System.out.println(curso.obterInfo());
			
		
		leia.close();

	}

}
