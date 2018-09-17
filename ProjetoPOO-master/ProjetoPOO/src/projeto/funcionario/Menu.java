package projeto.funcionario;

import java.util.Scanner;

public class Menu {
	public Professor cam;
	public Diretor car;
	private Administrativo mot;

	public Menu(Professor cam, Diretor car, Administrativo mot) {
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
			System.out.println("(1)-Cadastrar Diretor");
			System.out.println("(2)-Cadastrar Professor");
			System.out.println("(3)-Cadastrar Administrativo");
			System.out.println("(4)-Exibir Diretor");
			System.out.println("(5)-Exibir Professor");
			System.out.println("(6)-Exibir Administrativo");
			System.out.println("(7)-Sair");
			opcao = sc.nextInt();
			System.console();
			switch (opcao) {
			case 1:
				car.CadastrarDiretor();
				break;

			case 2:
				cam.Cadastrar_Professor();
				break;
			case 3:
				mot.CadastrarAdministrativo();
				break;
			case 4:
				car.ExibirDiretor();
				break;
			case 5:
				cam.Exibir_Professor();
				break;
			case 6:
				mot.ExibirAdministrativo();
				break;
			}
			
		} while (opcao != 7); System.out.println("\nAté Mais :)");

	}
}
