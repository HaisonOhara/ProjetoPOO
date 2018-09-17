package projeto.animais;

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
		
		Mamiferos mamiferos=new Mamiferos();
		Peixes peixes=new Peixes();
		Aves aves=new Aves();
		
		m=new Menu(mamiferos,aves,peixes);
		m.MenuInicial();

	}
}