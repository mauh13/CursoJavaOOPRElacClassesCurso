package senac.entra21.java.oop.lista04;

public class Curso {
	
	private String nome;
	private String horario;
	private CursoAluno alunos[];
	private CursoProfessor professor;
	
	public Curso () {}
	
	public Curso (String nome, String horario) {
		this.nome = nome;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public CursoAluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(CursoAluno[] alunos) {
		this.alunos = alunos;
	}

	public CursoProfessor getProfessor() {
		return professor;
	}

	public void setProfessor(CursoProfessor professor) {
		this.professor = professor;
	}

	public String obterInfo() {
		String info = "\n<<<<<DADOS DO CURSO>>>>>\n";
		info += "\nNome do Curso: " + this.nome + "\n";
		if (professor != null) {
			info += professor.obterInfo();
		}
		
		if (alunos != null) {
			for(CursoAluno x : alunos) {
				if (x != null) {
					info += "\n";
					info += x.orterInfo();
				}	
			}
			info += "\n";
			info += "\nMédia da turma: " + obterMediaCurso();
		}
		return info;
	}
	
	public double obterMediaCurso() {
		double media = 0;
		for(CursoAluno x : alunos) {
			if (x != null) {
			media += x.calcularMedia();
			}
		}
		return media/alunos.length;
	}

}
