package projeto.bebidas;

import java.util.Scanner;

public class Menu {
	public Vinho cam;
	public Cerveja car;
	private Refirgerante mot;

	public Menu(Vinho cam, Cerveja car, Refirgerante mot) {
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
			System.out.println("(1)-Cadastrar Cerveja");
			System.out.println("(2)-Cadastrar Vinho");
			System.out.println("(3)-Cadastrar Menu ");
			System.out.println("(4)-Exibir Cerveja");
			System.out.println("(5)-Exibir Vinho");
			System.out.println("(6)-Exibir Refrigerante");
			System.out.println("(7)-Sair");
			opcao = sc.nextInt();
			System.console();
			switch (opcao) {
			case 1:
				car.CadastrarCerveja();
				break;

			case 2:
				cam.Cadastrar_Vinho();
				break;
			case 3:
				mot.CadastrarRefri();
				break;
			case 4:
				car.ExibirCerveja();
				break;
			case 5:
				cam.Exibir_Vinho();
				break;
			case 6:
				mot.ExibirRefri();
				break;
			}
			
		} while (opcao != 7); System.out.println("\nAté Mais :)");

	}
}
