package senac.entra21.java.oop.lista04;

public class CursoAluno {
	
	private String nome;
	private String matricula;
	private double notas[];
	private double media;
	
	public CursoAluno () {}
	
	public CursoAluno (String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double calcularMedia () {
		double media=0;
		for (int i=0; i<this.notas.length; i++) {
			media += this.notas[i];
		}
		media /= notas.length;
		return media;	
	}

	public String orterInfo() {
		String info = "\nNome do Aluno(a): " + this.nome;
		info += "\nMatrícula: " + this.matricula;
		info += "\nNotas: ";
		for (double x : notas) {
			info += x + " ";
			}
		double media=0;
		for (int i=0; i<this.notas.length; i++) {
			media += this.notas[i];
		}
		media /= notas.length;
		info += "\nMédia: " + media + "\nResultado: ";
		info += (media>=7? " APROVADO": " REPROVADO");
		return info;
	}
	
	
}
