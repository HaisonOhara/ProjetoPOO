package projeto.animais;

import java.util.Scanner;

public class Menu {
	public Mamiferos cam;
	public Aves car;
	private Peixes mot;

	public Menu(Mamiferos cam, Aves car, Peixes mot) {
		super();
		this.cam = cam;
		this.car = car;
		this.mot = mot;
	}

	public Menu(){};
	
	public void MenuInicial() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---Menu Principal---");
			System.out.println("(1)-Cadastrar Aves");
			System.out.println("(2)-Cadastrar Mamiferos");
			System.out.println("(3)-Cadastrar Peixes");
			System.out.println("(4)-Exibir Aves");
			System.out.println("(5)-Exibir Mamiferos");
			System.out.println("(6)-Exibir Peixes");
			System.out.println("(7)-Sair");
			opcao = sc.nextInt();
			System.console();
			switch (opcao) {
			case 1:
				car.CadastrarAve();
				break;

			case 2:
				cam.CadastrarMamifero();
				break;
			case 3:
				mot.CadastrarPeixes();
				break;
			case 4:
				car.ExibirAve();
				break;
			case 5:
				cam.ExibirMamifero();
				break;
			case 6:
				mot.ExibirPeixes();
				break;
			}
			
		} while (opcao != 7); System.out.println("\nAté Mais :)");

	}
}
