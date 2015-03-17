package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private static final int MAXIMO_SENHA = 30;
	private static final int MINIMO_SENHA = 6;
	private static final int MAXIMO_NOME = 50;
	private static final int MINIMO_NOME = 3;

	private String name;
	private String email;
	private String senha;

	public Usuario() {}

	public Usuario(String nome, String email, String senha) throws Exception {
		isNomeValido(nome);
		isEmailValido(email);
		isSenhaValida(senha);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		isEmailValido(email);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) throws Exception {
		isSenhaValida(senha);
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) throws Exception {
		isNomeValido(nome);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario u = (Usuario) obj;
			return this.getEmail().equals(u.getEmail())
					&& this.getNome().equals(u.getNome());
		}
		return false;
	}

	@Override
	public String toString() {
		return "Nome = " + name + ", Email = " + email;
	}

	private void isNomeValido(String nome) throws Exception {
		if (nome == null) {
			throw new Exception("Nome não pode ser nulo");
		}
		if (nome.trim().equals("")) {
			throw new Exception("Nome não pode ser vazio");
		}
		if (nome.length() < MINIMO_NOME) {
			throw new Exception("Nome não pode ter tamanho menor que 3");
		}
		if (nome.length() > MAXIMO_NOME) {
			throw new Exception("Nome não pode ter tamanho maior que 50");
		}
		if (!(nome.matches("[A-Za-zÇ-ú\\s]*+"))) {
			throw new Exception("Nome só pode conter caracteres");
		}
		this.name = nome;
	}

	private void isSenhaValida(String senha) throws Exception {
		if (senha == null) {
			throw new Exception("Senha não pode ser nula");
		}
		if (senha.trim().equals("")) {
			throw new Exception("Senha não pode ser vazia");
		}
		if (senha.length() < MINIMO_SENHA) {
			throw new Exception("Senha não pode ter tamanho menor que 6");
		}
		if (senha.length() > MAXIMO_SENHA) {
			throw new Exception("Senha não pode ter tamanho maior que 30");
		}
		this.senha = senha;
	}

	private void isEmailValido(String email) throws Exception {
		if (email == null) {
			throw new Exception("Email não pode ser nulo");
		}
		if (email.trim().equals("")) {
			throw new Exception("Email não pode ser vazio");
		}
		if (!(email
				.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"))) {
			throw new Exception("Email inválido");
		}
		this.email = email;
	}
	
	
	
}