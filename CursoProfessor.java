package senac.entra21.java.oop.lista04;

public class CursoProfessor {
	
	private String nome;
	private String departamento;
	private String email;
	
	public CursoProfessor () {}

	public CursoProfessor(String nome, String departamento, String email) {
		this.nome = nome;
		this.departamento = departamento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String obterInfo() {
		String info = "Professor(a): " + this.nome;
		info += "\nDepartamento: " + this.departamento;
		info += "\nE-mail: " + this.email;
		return info;
	}
}
