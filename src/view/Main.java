package view;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		int[] vetor = {12, 4, 16, 2, 8, 6};
		
		for(int index : vetor) {
			a.insert(index);
		}
		
		try {
			a.search(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
