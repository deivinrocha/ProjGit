package Telas;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Classes.Pessoa;
import Classes.Usuario;

import java.awt.Button;
import java.awt.Panel;
import java.awt.Component;

public class TelaPrincipal extends JFrame {	
	

	
	JButton btnCad = new JButton("Cadastro");
	JButton btnVen = new JButton("Vendas");
	JButton btnSair = new JButton("Sair");
	Usuario users;
	TelaDoLogin entrar;
	
	
	public TelaPrincipal() {		
		
		setTitle("Bem vindo(a) ");
		this.setSize(437, 144);
		this.setVisible(true);	
		setLocationRelativeTo(null);
		
		
		getContentPane().setEnabled(false);
		getContentPane().setLayout(null);
		
		
		btnCad.setBounds(45, 46, 101, 30);
		getContentPane().add(btnCad);
		
		
		btnVen.setBounds(169, 45, 101, 32);
		getContentPane().add(btnVen);		
		
		btnSair.setBounds(294, 46, 81, 30);
		getContentPane().add(btnSair);
		
		setResizable(false);		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		btnCad.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Cadastro")){					
					new TelaCadastro().setVisible(true);
					setVisible(false);
				}				
			}
		});
		
		btnVen.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Vendas")){
					new TelaVendas(users).setVisible(true);
					setVisible(false);
				}
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Sair")){
					int resposta = JOptionPane.showConfirmDialog(null, "Você realmente deseja sair da Tela Principal?");
					if(resposta == JOptionPane.YES_OPTION){
						setVisible(false);
						new TelaDoLogin().setVisible(true);
					}
				}
				
			}
		});
		
	}



	

}
