package projeto.bebidas;

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
		
		Vinho vinho=new Vinho();
		Refirgerante refrigerante=new Refirgerante();
		Cerveja cerveja=new Cerveja();
		
		m=new Menu(vinho,cerveja,refrigerante);
		m.MenuInicial();

	}
}