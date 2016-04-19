package Telas;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import Classes.Banco;
import Classes.Cliente;
import Classes.Funcionario;
import Classes.Usuario;
import Classes.Venda;

public class TelaInsVenda extends JFrame {
	
	private JPanel contentPane;
	private JTextField textNomeProd;
	private JTextField textValor;
	//JComboBox comboFunc, comboCli; 

	public TelaInsVenda() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbInsVenda = new JLabel("Inserir Venda");
		lbInsVenda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbInsVenda.setBounds(137, 11, 157, 26);
		contentPane.add(lbInsVenda);
		
		
		/*
			comboCli = new JComboBox();
			comboFunc = new JComboBox();
			
			List cl = Banco.ListClientes();
			Iterator listCl = cl.iterator();
				while(listCl.hasNext()){
					Cliente cliente = (Cliente)listCl.next();
					comboCli.addItem(cliente.getNome());
				}
			comboCli.setVisible(true);
			
			List func = Banco.ListFuncio();
			Iterator listFunc = func.iterator();
				while(listFunc.hasNext()){
					Funcionario funcionario = (Funcionario)listFunc.next();
					comboFunc.addItem(funcionario.getNome());
				}*/
			
		
		
		JLabel lbNomeFunc = new JLabel("Nome do Funcionario:");
		lbNomeFunc.setBounds(44, 75, 147, 14);
		contentPane.add(lbNomeFunc);
		
		final JComboBox comboFunc = new JComboBox();		
		comboFunc.setBounds(188, 72, 106, 20);
		contentPane.add(comboFunc);
		
		List func = Banco.ListFuncio();
		Iterator listFunc = func.iterator();
			while(listFunc.hasNext()){
				Funcionario funcionario = (Funcionario)listFunc.next();
				comboFunc.addItem(funcionario.getNome());
			}
		comboFunc.setVisible(true);
		
		JLabel lbNomeCli = new JLabel("Nome do Cliente:");
		lbNomeCli.setBounds(44, 108, 120, 14);
		contentPane.add(lbNomeCli);		
		
		
		final JComboBox comboCli = new JComboBox();
		
		comboCli.setBounds(188, 108, 106, 20);
		contentPane.add(comboCli);
		
		List cl = Banco.ListClientes();
		Iterator listCl = cl.iterator();
			while(listCl.hasNext()){
				Cliente cliente = (Cliente)listCl.next();
				comboCli.addItem(cliente.getNome());
			}
		comboCli.setVisible(true);
		
		JLabel lbNomeProd = new JLabel("Nome do Produto:");
		lbNomeProd.setBounds(44, 140, 120, 14);
		contentPane.add(lbNomeProd);
		
		textNomeProd = new JTextField();
		textNomeProd.setBounds(188, 139, 106, 20);
		contentPane.add(textNomeProd);
		textNomeProd.setColumns(10);
		
		JLabel lbValor = new JLabel("Valor R$:");
		lbValor.setBounds(44, 172, 106, 14);
		contentPane.add(lbValor);
		
		textValor = new JTextField();
		textValor.setBounds(188, 170, 106, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);		
		
		
		
		JButton btnCadastrar = new JButton("Cadastrar >>");
		btnCadastrar.setBounds(255, 228, 114, 23);
		contentPane.add(btnCadastrar);		
			
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Cadastrar >>")){		
				
					Funcionario funCad = Banco.alterarFuncionario(comboFunc.getSelectedItem().toString());
					Cliente clCad = Banco.alterarCliente((String)comboCli.getSelectedItem().toString());
					Venda nova = new Venda(funCad, clCad, textNomeProd.getText(), Double.parseDouble(textValor.getText()));
					Banco.alterarFuncionario((String)comboFunc.getSelectedItem());
					Banco.inserir(nova);
					JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!");
					textNomeProd.setText("");
					textValor.setText("");
					comboCli.setSelectedIndex(0);
					comboFunc.setSelectedIndex(0);						
				}
			}
		});		
			
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(156, 228, 89, 23);
		contentPane.add(btnVoltar);
		setVisible(true);
		
		btnVoltar.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			if(e.getActionCommand().equals("Voltar")){
    				setVisible(false);
    				new TelaVendas(null).setVisible(true);
    			}
    			
    		}
    	});
		
	}
}
