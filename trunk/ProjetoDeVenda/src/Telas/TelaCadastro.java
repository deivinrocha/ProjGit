package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import Classes.Banco;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	JButton inserirUs = new JButton("Cadastrar Membro");
	JButton btnRemover = new JButton("Remover Usuario");
	JButton btnVoltar = new JButton("Voltar");
	//final JComboBox comboBox = new JComboBox();
	String Escolha[] = {"Selecione", "Usuario", "Cliente", "Funcionario"};	
	JComboBox opcao = new JComboBox(Escolha);
	private final JButton btnAvancar = new JButton("Avan\u00E7ar >>");

	public TelaCadastro() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 272);
		opcao.setVisible(false);		
		btnAvancar.setVisible(false);
		
		setTitle("Gerenciamento de Membros");
		
		/*comboBox.addItem("Selecione");
		comboBox.addItem("Cliente");
		comboBox.addItem("Funcionário");
		comboBox.addItem("Usuário");*/
		
		inserirUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Cadastrar Membro")){
					btnRemover.setVisible(false);
					//btnAvancar.setVisible(true);
					opcao.setVisible(true);					
					
				}
				
			}
		});
		
		opcao.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(opcao.getSelectedItem().toString().equals("Selecione") == false){
					btnAvancar.setVisible(true);
					if(opcao.getSelectedItem().toString().equals("Cliente")){
						btnAvancar.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								if(e.getActionCommand().equals("Avan\u00E7ar >>")){									
									new TelaCadCliente();
									setVisible(false);									
								}
							}
						});
							
						
					}else if(opcao.getSelectedItem().toString().equals("Funcionario")){
						btnAvancar.addActionListener(new ActionListener(){
							@Override
							public void actionPerformed(ActionEvent e) {
								if(e.getActionCommand().equals("Avan\u00E7ar >>")){
									setVisible(false);
									new TelaCadFunc();
								}
								
							}
						});
					}
					if(opcao.getSelectedItem().toString().equals("Usuario")){						
						btnAvancar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {								
								if(e.getActionCommand().equals("Avan\u00E7ar >>")){
									setVisible(false);
									new TelaCadUser();
									
								}
							}
						});
					}
				}else if(opcao.getSelectedItem().toString().equals("Selecione")){
					btnAvancar.setVisible(false);
				
				}
			}
		});
		
		
		
		
		inserirUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Cadastrar Membro")){
					btnRemover.setVisible(false);
					btnAvancar.setVisible(true);
					opcao.setVisible(true);
					
				}
				
			}
		});
		
		/*btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if(e1.getActionCommand().equals("Avan\u00E7ar >>")){
					new Cadastro().setVisible(true);
					
				}
			}
		});*/
		
		
		
		inserirUs.setBounds(10, 26, 265, 33);
		contentPane.add(inserirUs);
		
		
		btnRemover.setBounds(10, 151, 265, 33);
		contentPane.add(btnRemover);
		
		
		btnVoltar.setBounds(10, 195, 265, 33);
		contentPane.add(btnVoltar);
		
		opcao.setBounds(10, 70, 103, 27);		
		contentPane.add(opcao);
		btnAvancar.setBounds(144, 108, 112, 23);
		
		contentPane.add(btnAvancar);
		
		btnRemover.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Remover Usuario")){
		            String Del = JOptionPane.showInputDialog("Digite um login a ser deletado");
		            Banco.removeUser(Del);

		        }
				
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Voltar")){
					setVisible(false);
					new TelaPrincipal().setVisible(true);
				}
				
			}
		});
	}
}
