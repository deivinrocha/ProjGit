package Classes;

import java.util.Date;

public class Cliente extends Pessoa {

	String formasPg;
	String tipoCliente;
	Data ultimaCompra;
	
	//public Cliente(String nome, Data dataN, String formasPg, String tipoCliente, Data ultimaCompra){
	public Cliente(String nome, String cpf, Data dataN, String formasPg, String tipoCliente, Data ultimaCompra){
		super(nome,dataN);
		this.formasPg = formasPg;
		this.tipoCliente = tipoCliente;
		this.ultimaCompra = ultimaCompra;	
	}

	public String getFormasPg(){
		return formasPg;
	}
	
	public void setFormasPg(String formasPg){
		this.formasPg = formasPg;
	}
	
	public String getTipoCliente(){
		return tipoCliente;
	}
	
	public void setTipoCliente(String tipoCliente){
		this.tipoCliente = tipoCliente;
	}
	
	
	
	
	

}
