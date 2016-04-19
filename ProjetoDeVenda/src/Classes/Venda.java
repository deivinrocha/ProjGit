package Classes;

public class Venda {
	private static int qteVendas = 0;
	private int id;
	private Funcionario funcionario;
	private Cliente cliente;	
	private String nomeProd;
	private double valor;
	
	public Venda(Funcionario funcionario, Cliente cliente, String nomeProd, double valor){
		this.funcionario = funcionario;
		this.cliente = cliente;		
		this.nomeProd = nomeProd;
		this.valor = valor;
		id = qteVendas+1;
		qteVendas = qteVendas + 1;
	}
	
	public int getId(){
		return id;
	}
	
	public Funcionario getFuncionario(){
		return funcionario;
	}	
	
	public Cliente getCliente(){
		return cliente;
	}	
	
	
	
	public String getNomeProd(){
		return nomeProd;
	}
	
	public double getValor(){
		return this.valor;		
	} 
	
	
	
}
