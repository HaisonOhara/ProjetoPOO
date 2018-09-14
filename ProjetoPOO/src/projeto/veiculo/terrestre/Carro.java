package projeto.veiculo.terrestre;

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Carro extends Veiculo_Terrestre {

	

	public int num_pass;

	public void CadastrarCarro() {
		Scanner scc = new Scanner(System.in);
		
		System.out.println("\n___Cadastrando Carro___");
		System.out.println("\nDigite o Peso do carro");
		this.peso=scc.nextDouble();
		System.out.println("Digite o Comprimento do carro");
		this.comprimento=scc.nextDouble();
		System.out.println("Digite o valor do carro");
		this.setValor(scc.nextDouble());
		System.out.println("Digite o numero de passageiros do carro");
		this.num_pass=scc.nextInt();
		System.out.println("Carro cadastrado com sucesso!");
		scc.nextLine();
		try {
			TimeUnit.SECONDS.sleep(3);
			System.out.println("");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ExibirCarro() {
	}
}
