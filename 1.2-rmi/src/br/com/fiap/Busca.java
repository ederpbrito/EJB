package br.com.fiap;


import java.rmi.Naming;

public class Busca {

	public static void main(String[] args) throws Exception {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://localhost:1099/farmacia/carrinho");
		
		Item item = new Item();
		item.setNome("Dorflex");
		item.setPreco(10.95);
		carrinho.cadastrarItem(item);

	}

}

