package Telas;


	import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Classes.Banco;
import Classes.Data;
import Classes.Funcionario;
import Telas.ProjetoTelas;

public class TelaCadFunc extends JFrame {

	private JPanel contentPane;
	
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textDataN;
	private JTextField textCargo;
	private JTextField textSalario;
	private JTextField textDepartamento;
	private JTextField txtDataC;

	public TelaCadFunc() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 309);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarMembro = new JLabel("Cadastro de Funcionário");
		lblCadastrarMembro.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCadastrarMembro.setBounds(137, 11, 240, 36);
		contentPane.add(lblCadastrarMembro);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(66, 58, 103, 14);
		contentPane.add(lbNome);
		
		
		setVisible(true);
		
		
		
		JButton btnEnviar = new JButton("Enviar >>");
		btnEnviar.setBounds(323, 239, 97, 31);
		contentPane.add(btnEnviar);
		
		/*btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario novo = new Funcionario(textNome.getText(), textCpf.getText(), new Data(textDataN.getText()), textCargo.getText(), Double.parseDouble(textSalario.getText()), textDepartamento.getText(), new Data(txtDataC.getText()) );				
			}
		});*/
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(218, 239, 94, 31);
		contentPane.add(btnCancelar);
		
		JLabel lbCpf = new JLabel("CPF:");
		lbCpf.setBounds(66, 83, 46, 14);
		contentPane.add(lbCpf);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(66, 108, 141, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lbCargo = new JLabel("Cargo:");
		lbCargo.setBounds(66, 133, 132, 14);
		contentPane.add(lbCargo);
		
		JLabel lbSalario = new JLabel("Sal\u00E1rio:");
		lbSalario.setBounds(66, 158, 141, 14);
		contentPane.add(lbSalario);
		
		JLabel lbDepartamento = new JLabel("Departamento:");
		lbDepartamento.setBounds(66, 183, 103, 14);
		contentPane.add(lbDepartamento);
		
		textNome = new JTextField();
		textNome.setBounds(195, 55, 239, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		textNome.setText("Digite seu Nome");
		
		textCpf = new JTextField();
		textCpf.setText("XXX-XXX-XXX-XX");
		textCpf.setBounds(195, 80, 239, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		textDataN = new JTextField();
		textDataN.setText("DD/MM/AAAA");
		textDataN.setBounds(195, 105, 239, 20);
		contentPane.add(textDataN);
		textDataN.setColumns(10);
		
		textCargo = new JTextField();
		textCargo.setBounds(195, 130, 239, 20);
		contentPane.add(textCargo);
		textCargo.setColumns(10);
		
		textSalario = new JTextField();
		textSalario.setText("R$ 0000,00");
		textSalario.setBounds(195, 155, 240, 20);
		contentPane.add(textSalario);
		textSalario.setColumns(10);
		
		textDepartamento = new JTextField();
		textDepartamento.setBounds(195, 183, 239, 20);
		contentPane.add(textDepartamento);
		textDepartamento.setColumns(10);
		
		JLabel lblDataDeContratao = new JLabel("Data de Contrata\u00E7\u00E3o");
		lblDataDeContratao.setBounds(66, 211, 119, 14);
		contentPane.add(lblDataDeContratao);
		
		txtDataC = new JTextField();
		txtDataC.setText("DD/MM/AAAA");
		txtDataC.setBounds(195, 208, 239, 20);
		contentPane.add(txtDataC);
		txtDataC.setColumns(10);
		
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Enviar >>")){						
					Funcionario novo = new Funcionario(textNome.getText(), textCpf.getText(), 
						new Data(textDataN.getText()), textCargo.getText(), 
						Double.parseDouble(textSalario.getText()), textDepartamento.getText(), 
						new Data(txtDataC.getText()) );						
					if(Banco.inserir(novo)){
						JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com sucesso!");
					}
					setVisible(false);
					new TelaPrincipal().setVisible(true);
				}
				
			}
		});
		/*btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario novo = new Funcionario(textNome.getText(), textCpf.getText(), 
						new Data(textDataN.getText()), textCargo.getText(), 
						Double.parseDouble(textSalario.getText()), textDepartamento.getText(), 
						new Data(txtDataC.getText()) );				
			}
		});*/
		
		

			
			btnCancelar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getActionCommand().equals("Cancelar")){
						new TelaCadCliente().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);						
						new TelaCadastro().setVisible(true);
						
					}
					
				}
			});
		}
	}
