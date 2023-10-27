package conutfpr;

public class Professor {
	
	private String nome;
	private String email;
    private String areaEspecializacao;

	public Professor(String nome, String email, String areaEspecializacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.areaEspecializacao = areaEspecializacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAreaEspecializacao() {
		return areaEspecializacao;
	}

	public void setAreaEspecializacao(String areaEspecializacao) {
		this.areaEspecializacao = areaEspecializacao;
	}

}
