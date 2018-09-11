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
		int opcao = 0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("---Bem Vindo!---");
			System.out.println("(1)-Cadastrar Carro");
			System.out.println("(2)-Cadastrar Caminhao");
			System.out.println("(3)-Cadastrar Moto");
			System.out.println("(4)-Cadastrar Veiculo Terrestre");
			System.out.println("(5)-Cadastrar Carro");
			System.out.println("(6)-Sair");
			opcao=sc.nextInt();
			System.console();
			switch(opcao) {
			case 1:System.out.println("cadastrando");break;
			}
			for(int i=0;i<500;i++) {System.out.println(" ");	
			}}while(opcao!=6);
	
}
}