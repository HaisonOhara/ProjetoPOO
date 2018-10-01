package mvc.view;

public class Usuario {

	public String login;
	public String senha;
	boolean valida=false;
	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean validar() {
		if ("Haison".equals(this.login)&&("123".equals(this.senha))){
			return true;
		}
		else{
			return false;
		}
	}

}
