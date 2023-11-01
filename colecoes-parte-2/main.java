package colecoes_parte_2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean canContinue = true;
		Lista lista = new Lista();
		
		while(canContinue) {
			System.out.println("Insira o nome da pessoa: ");
			String nome = scan.next();
			
			System.out.println("Qual o sexo da pessoa?");
			System.out.println("1 - Masculino");
			System.out.println("2 - Femenino");
			int sexoSelecionado = scan.nextInt();
			String sexo;
			if(sexoSelecionado == 1 ) {
				sexo = "Masculino";
			} else if(sexoSelecionado == 2) {
				sexo = "Femenino";
			} else {
				System.out.println("Opção inválida");
				break;
			}
			
			Pessoa novaPessoa = new Pessoa(nome, sexo);
			lista.enqueue(novaPessoa);
			
			System.out.println("Deseja adicionar outra pessoa?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			int result = scan.nextInt();
			if(result == 2) canContinue = false;
		}
		lista.mapList();
	}

}
