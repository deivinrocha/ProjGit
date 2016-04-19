package Telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Classes.Banco;
import Classes.Usuario;

public class TelaDoLogin extends JFrame {
	
	JLabel lbLogo = new JLabel("Icone");
	JLabel lbIdentifica = new JLabel("Identificao do Usuario");
	JLabel lbLogin = new JLabel("Login: ");
	JLabel lbSenha = new JLabel("Senha: ");
    JTextField campoLogin = new JTextField();
    JPasswordField campoSenha = new JPasswordField();
    JButton btnEntrar = new JButton("Entrar"); 
    JButton btnSair = new JButton("Sair");
	
	public TelaDoLogin(){
		
		setVisible(true);
		setTitle("Controle de Vendas");		
		//setLayout(new GridLayout(3,2));
		setBounds(100, 100, 454, 321);
		getContentPane().setBackground(Color.BLUE);
		getContentPane().setLayout(null);
		
		getContentPane().add(lbLogo);
		lbLogo.setIcon(new ImageIcon("C:\\Users\\David Rocha\\Desktop\\javase\\Versionamento\\src\\Imagens\\login.png"));
		//lbLogo.setIcon(new ImageIcon("/Users/davidrocha/Documents/workspace/Versionamento/src/Imagens/login.png"));
		lbLogo.setBounds(10, 82, 128, 107);
		
		getContentPane().add(lbIdentifica);
		lbIdentifica.setBounds(54, 35, 220, 33);
		lbIdentifica.setForeground(Color.WHITE);
		lbIdentifica.setFont(new Font("Arial Black", Font.ROMAN_BASELINE, 15));
		
		getContentPane().add(lbLogin);
		lbLogin.setBounds(151, 86, 76, 14);
		lbLogin.setForeground(Color.WHITE);
		
		getContentPane().add(lbSenha);
		lbSenha.setBounds(151, 145, 46, 14);
		lbSenha.setForeground(Color.WHITE);
		
		getContentPane().add(campoLogin);
		campoLogin.setBounds(151, 111, 170, 20);
		
		getContentPane().add(campoSenha);
		campoSenha.setBounds(151, 170, 170, 20);	
		
		getContentPane().add(btnEntrar);
		btnEntrar.setBounds(172, 224, 102, 41);
		
		getContentPane().add(btnSair);
		btnSair.setBounds(296, 224, 102, 41);
		
		
        //setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);				
        setResizable(false);      
        
        /*btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(campoLogin.getText().equals("David") && (campoSenha.getText().equals("123"))){
					JOptionPane.showMessageDialog(null, "Seja Bem-Vindo " );		
					
				}else{
					JOptionPane.showMessageDialog(null, "Acesso Negado");
				}
			}
		});*/  
        
        //Adicionando evento ao bot�o Entrar
        
        btnEntrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e){        		        	
        		if(Banco.validaLogin(campoLogin.getText(), campoSenha.getText()) == null){
        			JOptionPane.showMessageDialog(btnEntrar, "Login ou Senha inv�lida, tente novamente!");
        			campoLogin.setText(null);
        			campoSenha.setText(null);
        		}else{
        			JOptionPane.showMessageDialog(null, "Seja Bem-vindo ao nosso sistema " +campoLogin.getText());        			
        			setVisible(false);
        			new TelaPrincipal().setVisible(true);
        			
        		}
        		/*if(e.getActionCommand().equals("Entrar")){
        			//Banco validaLogin = new Banco();
        			TelaPrincipal y = new TelaPrincipal();
        			setVisible(false);       			
        		}else{
        			JOptionPane.showMessageDialog(null, "Acesso Negado");
        			
        		}*/
        	
        	}
        });
        //Adicionando evento ao bot�o sair
        btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Sair")){
					int resposta = JOptionPane.showConfirmDialog(null, "Voc� deseja mesmo sair do programa?");
					if(resposta == JOptionPane.YES_OPTION){
						System.exit(0);
					}				
				}
			}
		});
        
        
	
	}
}
     
		
	
        

	


	
	
