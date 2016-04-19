package Classes;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Usuario extends Pessoa {	
	
	private String login;
	private String senha;	
	
	//public Usuario(String nome, String cpf, Data dataN, String login, String senha){
	public Usuario(String login, String senha, String nome){
		//super(nome,dataN);
		super(nome, new Data(02,02,2010));
		this.login = login;
		this.senha = senha;			
	}
	
	public String getLogin(){
		return login;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	
	
	/*public static Usuario validarLogin(String login, String senha){
		
		
		return null;
		
	}*/	
	
}

