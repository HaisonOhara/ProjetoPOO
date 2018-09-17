package projeto.veiculo.terrestre;

import java.util.Scanner;

public class Menu {
	public Caminhao cam;
	public Carro car;
	private Moto mot;

	public Menu(Caminhao cam, Carro car, Moto mot) {
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
			System.out.println("(2)-Cadastrar Mamiferos");
			System.out.println("(3)-Cadastrar Peixes");
			System.out.println("(4)-Exibir Cerveja");
			System.out.println("(5)-Exibir Mamiferos");
			System.out.println("(6)-Exibir Peixes");
			System.out.println("(7)-Sair");
			opcao = sc.nextInt();
			System.console();
			switch (opcao) {
			case 1:
				car.CadastrarCarro();
				break;

			case 2:
				cam.Cadastrar_Cam();
				break;
			case 3:
				mot.CadastrarMoto();
				break;
			case 4:
				car.ExibirCarro();
				break;
			case 5:
				cam.Exibir_Cam();
				break;
			case 6:
				mot.ExibirMoto();
				break;
			}
			
		} while (opcao != 7); System.out.println("\nAté Mais :)");

	}
}
