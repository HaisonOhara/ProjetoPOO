package projeto.funcionario;

import java.util.Scanner;

public class Administrativo extends Funcionario {

	public double nhm;

	public void CadastrarAdministrativo() {

		{
			Scanner sca = new Scanner(System.in);
			Scanner cnt = new Scanner(System.in);
			System.out.println("\n___Cadastrando Administrativo___");
			System.out.println("\nDigite o Nome Funcionario");
			this.nome = sca.next();
			System.out.println("Digite o salario do funcinario");
			this.salario = sca.nextDouble();
			
			System.out.println("Digite o Numero de horas mensal do funcionario");
			this.nhm = sca.nextDouble();
			System.out.println("Administrativo cadastrada com sucesso! \nPressione Enter para Continuar!");
			cnt.nextLine();
		}
	}

	public void ExibirAdministrativo() {
		Scanner cnt = new Scanner(System.in);
		if ((this.nome == null) || (this.salario == 0.0) ||  (this.nhm == 0.0)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_do_Administrativo__");
			System.out.println("Nome:" + this.nome);
			System.out.println("Salario:" + this.salario);
			System.out.println("Numero de Horas Mensal:" + this.nhm);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();

		}
	}
}
