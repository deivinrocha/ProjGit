package Classes;

public class Pessoa {
	private String nome, cpf;
	//static int codigo;
	Data dataNasc;
	
	public Pessoa(String nome, Data dataN){
		this.nome = nome;
		this.dataNasc = dataN;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}			   
	
}
