package projeto.funcionario;

import java.util.Scanner;

public class Principal {

	private static Menu m;

	public Menu getM() {
		return m;
	}

	public void setM(Menu m) {
		this.m = m;
	}

	public static void main(String[] args) {
		
		Professor professor=new Professor();
		Administrativo administrativo=new Administrativo();
		Diretor diretor=new Diretor();
		
		m=new Menu(professor,diretor,administrativo);
		m.MenuInicial();

	}
}