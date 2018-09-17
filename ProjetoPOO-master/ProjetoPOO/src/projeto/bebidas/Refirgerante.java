package projeto.bebidas;

import java.util.Scanner;

public class Refirgerante extends Bebidas {

	public String sabor;

	public void CadastrarRefri() {

		{
			Scanner scc = new Scanner(System.in);
			Scanner cnt = new Scanner(System.in);
			
			System.out.println("\n___Cadastrando Refrigerante__");
			System.out.println("\nDigite o nome do refrigerante");
			this.setNome(scc.next()); 
			System.out.println("Digite o preço do refrigerante");
			this.setPreco(scc.nextDouble()); 
			System.out.println("Digite o a marca do refrigerante");
			this.setMarca(scc.next());
			System.out.println("Digite o sabor cerveja");
			this.sabor=scc.next();
			System.out.println("Cerveja cadastrado com sucesso! \nPressione Enter para Continuar!");
			cnt.nextLine();

		}
	}

	public void ExibirRefri() {
		Scanner cnt = new Scanner(System.in);
		if ((this.getNome()== null) || (this.getPreco() == 0.0) || (this.getMarca() == null) || (this.sabor == null)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_da_Cervejas__");
			System.out.println("Preço:" + this.getPreco());
			System.out.println("Nome:" + this.getNome());
			System.out.println("Marca:" + this.getMarca());
			System.out.println("Sabor:" + this.sabor);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();


		}
	}
}
