package Classes;

import Classes.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import java.util.Iterator;

public class Banco {
	private static List usuarios = new ArrayList();
	private static List funcionarios = new ArrayList();
	private static List clientes = new ArrayList();
	private static List vendas = new ArrayList();
	
	
	public static Usuario validaLogin(String login, String senha){
		@SuppressWarnings("rawtypes")
		Iterator listUsers =  usuarios.iterator();
		/* for(Usuario users: usuarios){
		validaLogin listUser = (Usuarios)listUser.next();
		} */
		while(listUsers.hasNext()){
            Usuario cadUsers = (Usuario)listUsers.next();
            if(login.equals(cadUsers.getLogin()) && senha.equals(cadUsers.getSenha())){
                return cadUsers;           
            }
						
		}	
		return null;
	}
	
	public static boolean inserir(Usuario user){
		
		try{
			usuarios.add(user);
			return true;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar um novo Usuário, entre em contato com o Administrador do sistema!");
			return false;
		}
	}	
	
	public static boolean inserir(Funcionario funcio){
			
		try{
				funcionarios.add(funcio);
				return true;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Erro ao cadastrar um novo Funcionário, entre em contato com o Administrador do sistema!");
				return false;
			}				
	}	
	
	public static boolean inserir(Cliente cli){
		
		try{
			clientes.add(cli);
			return true;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar um novo Cliente, entre em contato com o Administrador do sistema!");
			return false;
		}
	}
	
	public static boolean inserir(Venda venda){
		
		try{
			vendas.add(venda);
			return true;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar uma nova Venda, entre em contato com o Administrador do sistema!");
			return false;
		}
	}
	
	public static List ListUsers(){		
		
		//for(int i = 0; i<usuario.size(); i++){
			
		//}	
		return usuarios;
	}
	
	public static List ListVendas(){
		
		return vendas;
	}
	
	public static List  ListClientes(){
		return clientes;
	}
	
	public static List ListFuncio(){
		return funcionarios;
	}
	
	/*public static void removerUser() {  
		ArrayList<Usuario> listUsers = new ArrayList<Usuario>();
	    String remover = JOptionPane.showInputDialog("Digite o Nome do usuario para Excluir: ");  
	    for (int i = 0; i < listUsers.size(); i++) {  
	        if (listUsers.get(i).getLogin().equals(remover)) {  
	            remover += listUsers.remove(i);  
	        }  
	    }  
	} */ 
	
	@SuppressWarnings("unchecked")
	public static void removeUser(String login){
		Iterator<Usuario> listUsers = usuarios.iterator();
		while(listUsers.hasNext()){
			Usuario cadUsers = (Usuario)listUsers.next();
			if(login.equals(cadUsers.getLogin())){
				if(JOptionPane.showConfirmDialog(null, "Deseja excluir o usuario "+cadUsers.getNome()+"?") == JOptionPane.YES_NO_OPTION){
					listUsers.remove();
					JOptionPane.showMessageDialog(null, "Usuario removido da lista de membros!");				
				}
				
			}
		}
	}
	
			
	/*public static void alterarUser() {  
		ArrayList<Usuario> listUsers = new ArrayList<Usuario>();
	    String nome = JOptionPane.showInputDialog("Digite o Nome do usuario que deseja Alterar");  
	    String novo = JOptionPane.showInputDialog("Digite o Novo Nome do Usuario");  
	    for (int i = 0; i < listUsers.size(); i++) {  
	        if (listUsers.get(i).getNome().equals(nome)) {  
	            listUsers.get(i).setNome(novo);  
	             
	        }  
	    }  
	}*/
	
	
	
	 public static Cliente alterarCliente(String nome){
	     Iterator listUsers = clientes.iterator();
	        while(listUsers.hasNext()){
	            Cliente cliente = (Cliente)listUsers.next();
	            if(nome.equals(cliente.getNome()) ){
	                return cliente;
	            }
	        }
	        return null;
	        
	    }

	    public static Funcionario alterarFuncionario(String nome){	    	
	     Iterator listUsers = funcionarios.iterator();
	        while(listUsers.hasNext()){
	            Funcionario funci = (Funcionario)listUsers.next();
	            if(nome.equals(funci.getNome()) ){
	                return funci;
	            }
	        }
	        return null;

	    }

	    public static Venda alterarVenda(String codigo){
	        int codNum = Integer.parseInt(codigo);
	        Iterator listUsers = vendas.iterator();
	        while(listUsers.hasNext()){
	            Venda venda = (Venda)listUsers.next();         
	            if(codNum == venda.getId()){
	                return venda;
	            }
	        }
	        return null;

	    }		
	
	
	
}
