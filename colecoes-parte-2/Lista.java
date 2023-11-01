package colecoes_parte_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Lista {
	private Map<Integer, Pessoa> lista = new HashMap<>();
	
	public Map<Integer, Pessoa> getLista() {
		return this.lista;
	}
	
	public boolean enqueue(Pessoa p) {
		this.lista.put(this.lista.size() - 1 , p);
		return true;
	}
	
	public void mapList() {
		Collection<Pessoa> pessoas = this.lista.values();
		Collection<Pessoa> masc = new ArrayList<Pessoa>();
		Collection<Pessoa> fem = new ArrayList<Pessoa>();
		for (Pessoa pessoa: pessoas) {
			if(pessoa.getSexo().contains("Masculino")) {
				masc.add(pessoa);
			} else {				
				fem.add(pessoa);
			}
		}
		
		System.out.println("Lista de pessoas do sexo masculino: ");
		this.printList(masc);
		System.out.println("Lista de pessoas do sexo femenino: ");
		this.printList(fem);
	}
	
	public void printList(Collection<Pessoa> masc) {
		for(Pessoa pessoa: masc) {
			System.out.println();
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Sexo: " + pessoa.getSexo());
			System.out.println();
		}
	}
}
