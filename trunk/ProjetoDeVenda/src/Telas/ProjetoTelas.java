package Telas;


import Classes.Cliente;
import Classes.Funcionario;
import Classes.Data;
import Classes.Usuario;
import Classes.Banco;
import Classes.Venda;





public class ProjetoTelas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				
				
		
		
		//Usuario d1 = new Usuario("David", "032.393.233-00", new Data(21,05,2008), "david", "123");
		//Usuario d2 = new Usuario("Zizu", "033.333.933-00", new Data(12,02,2008), "zizu", "123");
		Usuario d1 = new Usuario("david","123","David");
		Usuario d2 = new Usuario("zizu","123","Zizu");
		Banco.inserir(d1);
		Banco.inserir(d2);
		
		Funcionario x1 = new Funcionario("Maria","032.299", new Data(12,12,2012), "Suporte", 2000, "Vendedor", new Data(02,05,2013));
		Funcionario x2 = new Funcionario("Luzia","031.292", new Data(12,10,2012), "Venda", 2000, "Vendedor", new Data(12,05,2013));
		Banco.inserir(x1);
		Banco.inserir(x2);
		
		Cliente y1 = new Cliente("Joao","020.292.292-00",new Data(12,02,1987),"Cartao", "Vip",new Data(12,05,2011));
		Cliente y2 = new Cliente("Caleb","047.498.233-09",new Data(12,02,1957),"Dinheiro", "Vip",new Data(20,12,2011));
		Banco.inserir(y1);
		Banco.inserir(y2);
		
		Venda w1 = new Venda(x1, y2, "Uisque", 20);
		Venda w2 = new Venda(x2, y1, "Vinho", 12);
		Banco.inserir(w1);
		Banco.inserir(w2);
		
		new TelaDoLogin();
		//new TelaPrincipal();
		//new TelaCadastro();
		//new TelaCadCliente();
		//new TelaVendas();
		//new TelaCadFunc();
		//new TelaInsVenda();		
		//new TelaVendas(d1);
		
		
		
		

		
		
		

	}

}
