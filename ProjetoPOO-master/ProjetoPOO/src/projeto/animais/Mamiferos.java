package projeto.animais;

import java.util.Scanner;

public class Mamiferos extends Animais {

	public String tipo_pelo;

	/**
	 * @deprecated Use {@link #CadastrarMamifero()} instead
	 */
	public void Cadastrar_Cam() {
		CadastrarMamifero();
	}

	public void CadastrarMamifero() {
		Scanner scc = new Scanner(System.in);
		Scanner cnt = new Scanner(System.in);
		
		System.out.println("\n___Cadastrando Mamiferos___");
		System.out.println("Digite o nome do mamifero");
		this.nome = scc.next();
		System.out.println("\nDigite o Peso do mamifero");
		this.peso = scc.nextDouble();
		System.out.println("Digite o ambiente do mamifero");
		this.ambiente = scc.next();
		System.out.println("Digite o tipo pelo  do mamifero");
		this.tipo_pelo = scc.next();
		System.out.println("mamifero cadastrada com sucesso! \nPressione Enter para Continuar!");
		cnt.nextLine();
	}

	/**
	 * @deprecated Use {@link #ExibirMamifero()} instead
	 */
	public void Exibir_Cam() {
		ExibirMamifero();
	}

	public void ExibirMamifero() {

		Scanner cnt = new Scanner(System.in);
		if ((this.peso == 0.0) || (this.nome == null) || (this.ambiente == null) || (this.tipo_pelo == null)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_do_Mamifero__");
			System.out.println("nome:" + this.nome);
			System.out.println("Peso:" + this.peso);
			System.out.println("Ambiente:" + this.ambiente);
			System.out.println("Tipo do Pelo:" + this.tipo_pelo);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();
		}
	}
}
