package projeto.funcionario;

import java.util.Scanner;

public class Professor extends Funcionario {

	public double num_aulas;

	public void Cadastrar_Professor() {
		Scanner sca = new Scanner(System.in);
		Scanner cnt = new Scanner(System.in);
		System.out.println("\n___Cadastrando Diretor___");
		System.out.println("\nDigite o Nome Funcionario");
		this.nome = sca.next();
		System.out.println("Digite o salario do funcionario");
		this.salario = sca.nextDouble();
		System.out.println("Digite o número de aulas  do funcionario");
		this.num_aulas = sca.nextInt();
		System.out.println("Professor cadastrada com sucesso! \nPressione Enter para Continuar!");
		cnt.nextLine();
	}

	public void Exibir_Professor() {
		Scanner cnt = new Scanner(System.in);
		if ((this.nome == null) || (this.salario == 0.0) ||  (this.num_aulas == 0.0)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_do_Administrativo__");
			System.out.println("Nome:" + this.nome);
			System.out.println("Salario:" + this.salario);
			System.out.println("Numero de Assistentes:" + this.num_aulas);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();

		}
	}
}
