package projeto.bebidas;

import java.util.Scanner;

public class Vinho extends Bebidas {

	public String tipo_uva;

	public void Cadastrar_Vinho() {
		Scanner scc = new Scanner(System.in);
		Scanner cnt = new Scanner(System.in);
		
		System.out.println("\n___Cadastrando Vinho");
		System.out.println("\nDigite o nome do vinho");
		this.setNome(scc.next()); 
		System.out.println("Digite o preço do vinho");
		this.setPreco(scc.nextDouble()); 
		System.out.println("Digite o a marca do vinho");
		this.setMarca(scc.next());
		System.out.println("Digite o tipo dsa uva do vinho");
		this.tipo_uva=scc.next();
		System.out.println("Cerveja cadastrado com sucesso! \nPressione Enter para Continuar!");
		cnt.nextLine();
	}

	public void Exibir_Vinho() {
		Scanner cnt = new Scanner(System.in);
		if ((this.getNome()== null) || (this.getPreco() == 0.0) || (this.getMarca() == null) || (this.tipo_uva == null)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_do_Vinho__");
			System.out.println("Preço:" + this.getPreco());
			System.out.println("Nome:" + this.getNome());
			System.out.println("Marca:" + this.getMarca());
			System.out.println("Tipo da Uva:" + this.tipo_uva);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();

		}
	}
}
