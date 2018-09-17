package projeto.bebidas;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cerveja extends Bebidas {

	public String tipo;

	/**
	 * @deprecated Use {@link #CadastrarCerveja()} instead
	 */
	public void CadastrarCarro() {
		CadastrarCerveja();
	}

	public void CadastrarCerveja() {
		Scanner scc = new Scanner(System.in);
		Scanner cnt = new Scanner(System.in);
		
		System.out.println("\n___Cadastrando Cerveja__");
		System.out.println("\nDigite o nome da cerveja");
		this.setNome(scc.next()); 
		System.out.println("Digite o preço da cerveja");
		this.setPreco(scc.nextDouble()); 
		System.out.println("Digite o a marca da cerveja");
		this.setMarca(scc.next());
		System.out.println("Digite o tipo da cerveja");
		this.tipo=scc.next();
		System.out.println("Cerveja cadastrado com sucesso! \nPressione Enter para Continuar!");
		cnt.nextLine();

	}

	/**
	 * @deprecated Use {@link #ExibirCerveja()} instead
	 */
	public void ExibirCarro() {
		ExibirCerveja();
	}

	public void ExibirCerveja() {

		Scanner cnt = new Scanner(System.in);
		if ((this.getNome()== null) || (this.getPreco() == 0.0) || (this.getMarca() == null) || (this.tipo == null)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_da_Cervejas__");
			System.out.println("Preço:" + this.getPreco());
			System.out.println("Nome:" + this.getNome());
			System.out.println("Marca:" + this.getMarca());
			System.out.println("Tipo:" + this.tipo);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();

		}
	}
}
