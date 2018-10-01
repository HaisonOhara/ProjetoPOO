package mvc.view;

import javax.swing.JOptionPane;

public class ControleUsuario {

	public static void logar(String login, String senha) {

		Usuario user=new Usuario();
		user.setLogin(login);
		user.setSenha(senha);
		user.validar();
		user.validar();
		if(user.validar()==true){
			JOptionPane.showMessageDialog(null,"Sucesso");
		}
		else{
			JOptionPane.showMessageDialog(null,"Falha!Tente novamente");
		}
	}
}
