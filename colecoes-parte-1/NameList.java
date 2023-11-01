package colecoes_parte_1;

import java.util.ArrayList;

public class NameList {
	private ArrayList<String> names = new ArrayList<String>();
	
	public ArrayList<String> getNames() {
		return names;
	}
	
	public boolean enqueue(String name) {
		 this.names.add(name);
		 this.names.sort(null);
		return true;
	}
	
	public void printNames() {
		for(String name: this.names) {
			System.out.println(name + ", ");
		}
		
		System.out.println();
	}
}
