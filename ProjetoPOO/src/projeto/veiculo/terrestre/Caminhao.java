package projeto.veiculo.terrestre;

import java.util.Scanner;

public class Caminhao extends Veiculo_Terrestre {

	
	public double tonelagem;

	public  void Cadastrar_Cam() {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("\n___Cadastrando caminhao___");
		System.out.println("\nDigite o Peso do caminhao");
		this.peso = sca.nextDouble();
		System.out.println("Digite o Comprimento do caminhao");
		this.comprimento = sca.nextDouble();
		System.out.println("Digite o valor do caminhao");
		this.setValor(sca.nextDouble());
		System.out.println("Digite a tonelagem do Caminhao");
		this.tonelagem = sca.nextDouble();

	}

	public void Exibir_Cam() {

	}
}
