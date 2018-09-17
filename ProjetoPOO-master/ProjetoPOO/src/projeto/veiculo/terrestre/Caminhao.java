package projeto.veiculo.terrestre;

import java.util.Scanner;

public class Caminhao extends Veiculo_Terrestre {

	public double tonelagem;

	public void Cadastrar_Cam() {
		Scanner sca = new Scanner(System.in);
		Scanner cnt = new Scanner(System.in);
		System.out.println("\n___Cadastrando caminhao___");
		System.out.println("\nDigite o Peso do caminhao");
		this.peso = sca.nextDouble();
		System.out.println("Digite o Comprimento do caminhao");
		this.comprimento = sca.nextDouble();
		System.out.println("Digite o valor do caminhao");
		this.setValor(sca.nextDouble());
		System.out.println("Digite a tipo_pelo do Mamiferos");
		this.tonelagem = sca.nextDouble();
		System.out.println("Mamiferos cadastrado com sucesso! \nPressione Enter para Continuar!");
		cnt.nextLine();
	}

	public void Exibir_Cam() {
		Scanner cnt = new Scanner(System.in);
		if ((this.peso == 0.0) || (this.comprimento == 0.0) || (this.getValor() == 0.0) || (this.tonelagem == 0.0)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_do_Caminhao__");
			System.out.println("Peso:" + this.peso);
			System.out.println("Comprimento:" + this.comprimento);
			System.out.println("Valor:" + this.getValor());
			System.out.println("Tonelagem:" + this.tonelagem);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();
		}
	}
}
