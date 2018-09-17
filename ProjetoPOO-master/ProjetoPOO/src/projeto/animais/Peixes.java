package projeto.animais;

import java.util.Scanner;

public class Peixes extends Animais {

	public String tipo_agua;

	/**
	 * @deprecated Use {@link #CadastrarPeixes()} instead
	 */
	public void CadastrarMoto() {
		CadastrarPeixes();
	}

	public void CadastrarPeixes() {

		{
			Scanner scc = new Scanner(System.in);
			Scanner cnt = new Scanner(System.in);
			
			System.out.println("\n___Cadastrando Peixe___");
			System.out.println("Digite o nome do Peixe");
			this.nome = scc.next();
			System.out.println("\nDigite o Peso do Peixe");
			this.peso = scc.nextDouble();
			System.out.println("Digite o ambiente do Peixe");
			this.ambiente = scc.next();
			System.out.println("Digite o tipo da Agua  do Peixe");
			this.tipo_agua = scc.next();
			System.out.println("Peixe cadastrada com sucesso! \nPressione Enter para Continuar!");
			cnt.nextLine();
		}
	}

	/**
	 * @deprecated Use {@link #ExibirPeixes()} instead
	 */
	public void ExibirMoto() {
		ExibirPeixes();
	}

	public void ExibirPeixes() {
		Scanner cnt = new Scanner(System.in);
		if ((this.peso == 0.0) || (this.nome == null) || (this.ambiente == null) || (this.tipo_agua == null)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_do_Peixe__");
			System.out.println("Nome:" + this.nome);
			System.out.println("Peso:" + this.peso);
			System.out.println("Ambiente:" + this.ambiente);
			System.out.println("Tipo da Água:" + this.tipo_agua);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();
		}
	}
}
