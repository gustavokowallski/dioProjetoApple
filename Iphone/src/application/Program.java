package application;

import entities.entities.Iphone;

public class Program {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.atender();
		iphone.tocar();
		iphone.exibirPagina("Brasil");
		iphone.adicionarAba();
	}
}
