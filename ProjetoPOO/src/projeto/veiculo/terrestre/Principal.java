package projeto.veiculo.terrestre;

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
		
		Caminhao caminhao=new Caminhao();
		Moto moto=new Moto();
		Carro carro=new Carro();
		
		m=new Menu(caminhao,carro,moto);
		m.MenuInicial();

	}
}