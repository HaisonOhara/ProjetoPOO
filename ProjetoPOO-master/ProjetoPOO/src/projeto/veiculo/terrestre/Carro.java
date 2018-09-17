package projeto.veiculo.terrestre;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Carro extends Veiculo_Terrestre {

	public int num_pass;

	public void CadastrarCarro() {
		Scanner scc = new Scanner(System.in);
		Scanner cnt = new Scanner(System.in);
		
		System.out.println("\n___Cadastrando Carro___");
		System.out.println("\nDigite o Peso do carro");
		this.peso = scc.nextDouble();
		System.out.println("Digite o Comprimento do carro");
		this.comprimento = scc.nextDouble();
		System.out.println("Digite o valor do carro");
		this.setValor(scc.nextDouble());
		System.out.println("Digite o numero de passageiros do carro");
		this.num_pass = scc.nextInt();
		System.out.println("Cerveja cadastrado com sucesso! \nPressione Enter para Continuar!");
		cnt.nextLine();

	}

	public void ExibirCarro() {

		Scanner cnt = new Scanner(System.in);
		if ((this.peso == 0.0) || (this.comprimento == 0.0) || (this.getValor() == 0.0) || (this.num_pass == 0.0)) {
			System.out.println(
					"Ops, Há Algo de Errado com o Preenchimento  deste item :(\nPressione Enter e tente preenche-lo novamente!");
			cnt.nextLine();
		} else {
			System.out.println("__Dados_da_Carro__");
			System.out.println("Peso:" + this.peso);
			System.out.println("Comprimento:" + this.comprimento);
			System.out.println("Valor:" + this.getValor());
			System.out.println("Numero de Passageiros:" + this.num_pass);
			System.out.println("Pressione Enter para Continuar!");
			cnt.nextLine();

		}
	}
}
