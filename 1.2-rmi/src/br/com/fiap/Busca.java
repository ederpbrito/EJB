package br.com.fiap;


import java.rmi.Naming;

public class Busca {

	public static void main(String[] args) throws Exception {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		
		Item item = new Item();
		item.setNome("teste1234");
		item.setPreco(10.95);
		carrinho.cadastrarItem(item);

	}

}

