package mvc.view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaLogin {
	public static JTextField txtLogin;

	public static JTextField txtSenha;

	public static JButton btnLogin;

	public static void main(String[] args) {
		
		txtLogin=new JTextField();
		txtLogin.setText(JOptionPane.showInputDialog("Digite o Login"));
		
	
		txtSenha=new JTextField();
		txtSenha.setText(JOptionPane.showInputDialog("Digite o Senha"));
		
		ControleUsuario.logar(txtLogin.getText(),txtSenha.getText());
		
	}

}
