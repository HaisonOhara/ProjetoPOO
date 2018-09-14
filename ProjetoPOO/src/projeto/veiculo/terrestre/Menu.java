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

	public void MenuInicial() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---Menu Principal---");
			System.out.println("(1)-Cadastrar Carro");
			System.out.println("(2)-Cadastrar Caminhao");
			System.out.println("(3)-Cadastrar Moto");
			System.out.println("(4)-Cadastrar Veiculo Terrestre");
			System.out.println("(5)-Cadastrar Carro");
			System.out.println("(6)-Sair");
			opcao = sc.nextInt();
			System.console();
			switch (opcao) {
			case 1:
				car.CadastrarCarro();
				break;

			case 2:
				cam.Cadastrar_Cam();
				break;
			}

		} while (opcao != 6); System.out.println("Até Mais :)");

	}
}
