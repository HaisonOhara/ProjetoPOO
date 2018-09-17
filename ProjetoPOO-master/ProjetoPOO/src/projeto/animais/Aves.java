package projeto.animais;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Aves extends Animais {

	public String cor_pena;

	/**
	 * @deprecated Use {@link #CadastrarAve()} instead
	 */
	public void CadastrarCarro() {
		CadastrarAve();
	}

	public void CadastrarAve() {
		Scanner scc = new Scanner(System.in);
		Scanner cnt = new Scanner(System.in);
		
		System.out.println("\n___Cadastrando Aves___");
		System.out.println("Digite o nome da Ave");
		this.nome = scc.next();
		System.out.println("\nDigite o Peso da Ave");
		this.peso = scc.nextDouble();
		System.out.println("Digite o ambiente da Ave");
		this.ambiente = scc.next();
		System.out.println("Digite a cor da pena da ave");
		this.cor_pena = scc.next();
		System.out.println("Ave cadastrada com sucesso! \nPressione Enter para Continuar!");
		cnt.nextLine();

	}

	/**
	 * @deprecated Use {@link #ExibirAve()} instead
	 */
	public void ExibirCarro() {
		ExibirAve();
	}

	public void ExibirAve() {

		Scanner cnt = new Scanner(System.in);
		if ((this.peso == 0.0) || (this.nome == null) || (this.ambiente == null) || (this.cor_pena == null)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_da_Ave__");
			System.out.println("nome:" + this.nome);
			System.out.println("Peso:" + this.peso);
			System.out.println("Ambiente:" + this.ambiente);
			System.out.println("Cor da Pena:" + this.cor_pena);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();

		}
	}
}
