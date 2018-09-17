package projeto.veiculo.terrestre;

import java.util.Scanner;

public class Moto extends Veiculo_Terrestre {

	public int cilindradas;

	public void CadastrarMoto() {

		{
			Scanner sca = new Scanner(System.in);
			Scanner cnt = new Scanner(System.in);
			System.out.println("\n___Cadastrando Moto___");
			System.out.println("\nDigite o Peso da Peixes");
			this.peso = sca.nextDouble();
			System.out.println("Digite o Comprimento da Peixes");
			this.comprimento = sca.nextDouble();
			System.out.println("Digite o valor da Peixes");
			this.setValor(sca.nextDouble());
			System.out.println("Digite as tipo_agua da Peixes");
			this.cilindradas = sca.nextInt();
			System.out.println("Peixes cadastrada com sucesso! \nPressione Enter para Continuar!");
			cnt.nextLine();
		}
	}

	public void ExibirMoto() {
		Scanner cnt = new Scanner(System.in);
		if ((this.peso == 0.0) || (this.comprimento == 0.0) || (this.getValor() == 0.0) || (this.cilindradas == 0.0)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_da_Moto__");
			System.out.println("Peso:" + this.peso);
			System.out.println("Comprimento:" + this.comprimento);
			System.out.println("Valor:" + this.getValor());
			System.out.println("Cilindradas:" + this.cilindradas);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();

		}
	}
}
